/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Commentaire;
import artplus.entities.Post;
import artplus.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class CommentaireServices {
    
    public void ajouterCommentaire(){
        try {
            String requete = "INSERT INTO commentaire (Description_Com,Nbre_Com,Nbre_Like_Com,Date_Com)"
                    + " VALUES ('ranoucha l 3asla','1','13','2023-02-13') ";
            Statement st = new MyConnection().getConx().createStatement();
            
            st.executeUpdate(requete);
            System.out.println("Commentaire ajouté avec sucès");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
    
     public void ajouterCommentaire2(Commentaire c){
         try {
            String requete2 = "INSERT INTO commentaire (Description_Com,Nbre_Com,Nbre_Like_Com,Date_Com)"
                    +" VALUES (?,?,?,?)";
            PreparedStatement pst = new MyConnection().getConx().prepareStatement(requete2);
            pst.setString(1,c.getDescription_Com());
            pst.setInt(2,c.getNbre_Com());
            pst.setInt(3,c.getNbre_Like_Com());
            pst.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
         
            pst.executeUpdate();
            System.out.println("votre commentaire est ajoutée");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
     
     public List<Commentaire> afficherCommentaire(){
            List<Commentaire> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM commentaire";
            Statement ste = new MyConnection().getConx().createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
                Commentaire c = new Commentaire();
                c.setId_Com(rs.getInt(1));
                c.setDescription_Com(rs.getString("Description_Com"));
                c.setNbre_Like_Com(rs.getInt(4));
                c.setDate_Com(rs.getDate(5));

                myList.add(c);   
            }
            
        }
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         return myList;
     }
    
}
