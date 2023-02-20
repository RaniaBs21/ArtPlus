/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;
import artplus.entities.Admin;
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
public class AdminServices implements InterfaceAdminServices {
    
     Connection  cnx;
    
    public AdminServices(){
        cnx = MyConnection.getInstance().getConx();
    }
   
    
@Override
    public void ajouterAdmin(){
        try {
            String requete = "INSERT INTO admin (Nom_Ad,Prenom_Ad,Email_Ad,Password_Ad,Adresse_Ad,Num_Tel_Ad)"
                    + " VALUES ('gd','gd','gd@gmail.com','gd123','tunis',22547554) ";
            Statement st = cnx.createStatement();
            
            st.executeUpdate(requete);
            System.out.println("admin ajouté avec sucès");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
    
    
  @Override
     public void ajouterAdmin2(Admin a){
         try {
            String requete2 = "INSERT INTO admin (Nom_Ad,Prenom_Ad,Email_Ad,Password_Ad,Adresse_Ad,Num_Tel_Ad)"
                    +" VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
            pst.setString(1,a.getNom_Ad());
            pst.setString(2,a.getPrenom_Ad());
            pst.setString(3,a.getEmail_Ad());
            pst.setString(4,a.getPassword_Ad());
            pst.setString(5,a.getAdresse_Ad());
            pst.setString(6,a.getNum_Tel_Ad());
         
            pst.executeUpdate();
            System.out.println("votre admin est ajoutée");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         
    
    }
     
   @Override
      public void modifierAdmin(Admin a) {
        try {
            String reqModif = "UPDATE admin SET Nom_Ad = '" + a.getNom_Ad() + "', Prenom_Ad = '" + a.getPrenom_Ad() + "', Email_Ad = '" + a.getEmail_Ad() + "', Password_Ad= '" + a.getPassword_Ad() + "', Adresse_Ad = '" + a.getAdresse_Ad() + "', Num_Tel_Ad = '" + a.getNum_Tel_Ad() + "' WHERE admin.`Id_Ad` = " + a.getId_Ad();
            Statement st = cnx.createStatement();
            st.executeUpdate(reqModif);
            System.out.println("admin updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
   @Override
      public void supprimerAdmin(int Id_Ad) {
        try {
            String req = "DELETE FROM admin WHERE Id_Ad = " + Id_Ad;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Admin deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
    @Override
     public List<Admin> afficherAdmin(){
            List<Admin> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM admin";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
               
                Admin a  = new Admin();
                a.setId_Gd(rs.getInt(1));
                a.setNom_Gd(rs.getString("Nom_Ad"));
                a.setPrenom_Gd(rs.getString("Prenom_Ad"));
                a.setEmail_Gd(rs.getString("Email_Ad"));
                a.setPassword_Gd(rs.getString("Password_Ad"));
                a.setAdresse_Gd(rs.getString("Adresse_Ad"));
                a.setNum_Tel_Gd(rs.getString("Num_Tel_Ad"));
               

                myList.add(a);   
            }
            
        }
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         return myList;
     }


    
}

