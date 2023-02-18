/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Commentaire;
import artplus.entities.Post;
import artplus.utils.MyConnection;
import java.sql.Connection;
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
public class CommentaireServices implements InterfaceCommentaireServices{
    Connection  cnx;
    
    public CommentaireServices(){
        cnx = MyConnection.getInstance().getConx();
    }
    
    @Override
    public void ajouterCommentaire(){
        try {
            String requete = "INSERT INTO commentaire (Description_Com,Nbre_Com,Nbre_Like_Com,Date_Com)"
                    + " VALUES ('ranoucha l 3asla','1','13','2023-02-13') ";
            Statement st = cnx.createStatement();
            
            st.executeUpdate(requete);
            System.out.println("Commentaire ajouté avec sucès");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
    @Override
     public void ajouterCommentaire2(Commentaire c){
         try {
            String requete2 = "INSERT INTO commentaire (Description_Com,Nbre_Com,Nbre_Like_Com,Date_Com)"
                    +" VALUES (?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
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
     
     
   @Override
    public void modifierCommentaire(Commentaire c) {
        try {
            String req = "UPDATE commentaire SET Description_Com = ? WHERE Id_Com = "+c.getId_Com();

            PreparedStatement pst = cnx.prepareStatement(req);

            pst.setString(1, c.getDescription_Com()); 
            pst.executeUpdate();
            System.out.println("comment modifié !");
        } catch (SQLException ex) {
            System.out.println("comment non modifié !");
            System.out.println(ex.getMessage());
        }
    }
     
   /*  @Override
    public void modifierCommentaire(Commentaire c) {
        try {
                String reqModif = "UPDATE commentaire SET Description_Com = '" + c.getDescription_Com() + "' WHERE commentaire.`Id_Com` = " + c.getId_Com();
            Statement st = cnx.createStatement();
            st.executeUpdate(reqModif);
            System.out.println("comment updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    */
    @Override
      public void supprimerCom(int Id_Com) {
        try {
            String req = "DELETE FROM commentaire WHERE Id_Com = " + Id_Com;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Comment deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
     @Override
     public List<Commentaire> afficherCommentaire(){
            List<Commentaire> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM commentaire";
            Statement ste = cnx.createStatement();
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
