
import artplus.entities.Utilisateur;
import artplus.services.InterfaceUtilisateurServices;
import artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class UtilisateurServices implements InterfaceUtilisateurServices {
    
     Connection  cnx;
    
    public UtilisateurServices(){
        cnx = MyConnection.getInstance().getConx();
    }
   
    
@Override
    public void ajouterUtilisateur(){
        try {
            String requete = "INSERT INTO utilisateur (Nom_Ut,Prenom_Ut,Email_Ut,Password_Ut,Adresse_Ut,Num_Tel_Ut)"
                    + " VALUES ('gd','gd','gd@gmail.com','gd123','tunis',22547554) ";
            Statement st = cnx.createStatement();
            
            st.executeUpdate(requete);
            System.out.println("utilisateur ajouté avec suceés");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
    
    
  @Override
     public void ajouterUtilisateur2(Utilisateur u){
         try {
            String requete2 = "INSERT INTO guide (Nom_Ut,Prenom_Ut,Email_Ut,Password_Ut,Adresse_Ut,Num_Tel_Ut)"
                    +" VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
            pst.setString(1,u.getNom_Ut());
            pst.setString(2,u.getPrenom_Ut());
            pst.setString(3,u.getEmail_Ut());
            pst.setString(4,u.getPassword_Ut());
            pst.setString(5,u.getAdresse_Ut());
            pst.setString(6,u.getNum_Tel_Ut());
         
            pst.executeUpdate();
            System.out.println("votre utlisateur est ajoutée");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         
    
    }
     
   @Override
      public void modifierUtilisateur(Utilisateur u) {
        try {
            String reqModif = "UPDATE utilisateur SET Nom_Ut = '" + u.getNom_Ut() + "', Prenom_Ut = '" + u.getPrenom_Ut() + "', Email_Ut = '" + u.getEmail_Ut() + "', Password_Ut= '" + u.getPassword_Ut() + "', Adresse_Ut = '" + u.getAdresse_Ut() + "', Num_Tel_Ut = '" + u.getNum_Tel_Ut() + "' WHERE utilisateur.`Id_Ut` = " + u.getId_Ut();
            Statement st = cnx.createStatement();
            st.executeUpdate(reqModif);
            System.out.println("Utilisateur updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
   @Override
      public void supprimerUtilisateur(int Id_Ut) {
        try {
            String req = "DELETE FROM utilisateur WHERE Id_Ut = " + Id_Ut;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Utilisateur deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
    @Override
     public List<Utilisateur> afficherUtilisateur(){
            List<Utilisateur> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM utilisateur";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
               
                Utilisateur u = new Utilisateur();
                u.setId_Ut(rs.getInt(2));
                u.setNom_Ut(rs.getString("Nom_Ut"));
                u.setPrenom_Ut(rs.getString("Prenom_Ut"));
                u.setEmail_Ut(rs.getString("Email_Ut"));
                u.setPassword_Ut(rs.getString("Password_Ut"));
                u.setAdresse_Ut(rs.getString("Adresse_Ut"));
                u.setNum_Tel_Ut(rs.getString("Num_Tel_Ut"));
               

                myList.add(u);   
            }
            
        }
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         return myList;
     }

   
}
