/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.services;

import edu.artplus.entities.Abonement;
import edu.artplus.entities.Cours;
import edu.artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AbonnementServices {
    Connection  cnx;
    
    public AbonnementServices(){
        cnx = MyConnection.getInstance().getConx();
    }
    
    public void ajouterAbonement(){
        try {
            String requete = "INSERT INTO abonnement(Id_user,Id_level,prix_abon,date_abon)"
                    + "VALUES (1,3,800,'2023-02-16')";
            
            Statement ste = cnx.createStatement(); 
            ste.executeUpdate(requete);
            System.out.println("Abonnement ajouté avec succès ");
        } catch (SQLException ex) {
            System.err.println("Abonnement  n'est pas ajouté ");

        }
    }
    
     public void ajouterAbonment2(Abonement ab){
    try {
       
            String requete2 = "INSERT INTO abonnement(Id_user,Id_level,prix_abon,date_abon)"
                    +" VALUES (?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
            pst.setInt(1,ab.getId_user());
            pst.setInt(2,ab.getId_level());
            pst.setInt(3,ab.getPrix_abon());
            pst.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
           
         
            pst.executeUpdate();
            System.out.println(" Abonnement  est ajoutée");
            
        } catch (SQLException ex) {
            System.out.println("Abonnement  n'est pas ajoutée");
        }
}
     public void modifierAbonement(Abonement ab) {
        try {
            String req = "UPDATE abonnement SET Id_user = '" + ab.getId_user() + "', Id_level = '" + ab.getId_level() + "', prix_abon = '" + ab.getPrix_abon() + "', date_abon= '" + ab.getDate_abon() + "' WHERE Id_abon = " + ab.getId_abon();
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Abonnement est modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    
    public List<Abonement> afficherAbonement(){
        List<Abonement> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM abonnement";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
                Abonement ab = new Abonement();
                ab.setId_abon(rs.getInt(1));
                ab.setId_user(rs.getInt("Id_user"));
         
                ab.setId_level(rs.getInt("Id_level"));
                ab.setPrix_abon(rs.getInt("Prix_abon"));
                ab.setDate_abon(rs.getDate(7));
                myList.add(ab);   
            } 
        }
        catch (SQLException ex) {
            System.out.println("liste n'est pas affichée");
        }
         return myList;
       
    }
    
    
               
        public void supprimerAbonement(int Id_abon) {
        try {
            String req = "DELETE FROM abonnement WHERE Id_abon = " + Id_abon;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Abonnement  est supprimé !");
        } catch (SQLException ex) {
            System.out.println("Abonnement  n'est pas supprimé");
        }
    }

    
    
}
