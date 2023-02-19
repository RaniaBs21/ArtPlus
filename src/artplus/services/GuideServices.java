/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Guide;
import artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OACA
 */
public class GuideServices implements InterfaceGuideServices {
    
     Connection  cnx;
    
    public GuideServices(){
        cnx = MyConnection.getInstance().getConx();
    }
   
    
@Override
    public void ajouterGuide(){
        try {
            String requete = "INSERT INTO guide (Nom_Gd,Prenom_Gd,Email_Gd,Password_Gd,Adresse_Gd,Num_Tel_Gd)"
                    + " VALUES ('gd','gd','gd@gmail.com','gd123','tunis',22547554) ";
            Statement st = cnx.createStatement();
            
            st.executeUpdate(requete);
            System.out.println("guide ajouté avec sucès");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
    
    
  @Override
     public void ajouterGuide2(Guide g){
         try {
            String requete2 = "INSERT INTO guide (Nom_Gd,Prenom_Gd,Email_Gd,Password_Gd,Adresse_Gd,Num_Tel_Gd)"
                    +" VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
            pst.setString(1,g.getNom_Gd());
            pst.setString(2,g.getPrenom_Gd());
            pst.setString(3,g.getEmail_Gd());
            pst.setString(4,g.getPassword_Gd());
            pst.setString(5,g.getAdresse_Gd());
            pst.setString(6,g.getNum_Tel_Gd());
         
            pst.executeUpdate();
            System.out.println("votre guide est ajoutée");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         
    
    }
     
   @Override
      public void modifierGuide(Guide g) {
        try {
            String reqModif = "UPDATE guide SET Nom_Gd = '" + g.getNom_Gd() + "', Prenom_Gd = '" + g.getPrenom_Gd() + "', Email_Gd = '" + g.getEmail_Gd() + "', Password_Gd= '" + g.getPassword_Gd() + "', Adresse_Gd = '" + g.getAdresse_Gd() + "', Num_Tel_Gd = '" + g.getNum_Tel_Gd() + "' WHERE guide.`Id_Gd` = " + g.getId_Gd();
            Statement st = cnx.createStatement();
            st.executeUpdate(reqModif);
            System.out.println("Guide updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
   @Override
      public void supprimerGuide(int Id_Gd) {
        try {
            String req = "DELETE FROM guide WHERE Id_Gd = " + Id_Gd;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Guide deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
    @Override
     public List<Guide> afficherGuide(){
            List<Guide> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM guide";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
               
                Guide g = new Guide();
                g.setId_Gd(rs.getInt(1));
                g.setNom_Gd(rs.getString("Nom_Gd"));
                g.setPrenom_Gd(rs.getString("Prenom_Gd"));
                g.setEmail_Gd(rs.getString("Email_Gd"));
                g.setPassword_Gd(rs.getString("Password_Gd"));
                g.setAdresse_Gd(rs.getString("Adresse_Gd"));
                g.setNum_Tel_Gd(rs.getString("Num_Tel_Gd"));
               

                myList.add(g);   
            }
            
        }
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         return myList;
     }
    
}
