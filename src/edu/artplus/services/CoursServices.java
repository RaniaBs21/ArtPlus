/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.services;
import edu.artplus.entities.Cours;
import edu.artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


    

public class CoursServices {
    Connection  cnx;
    
    public CoursServices(){
        cnx = MyConnection.getInstance().getConx();
    }
    
    public void ajouterCours(){
        try {
            String requete = "INSERT INTO cours (Titre_c,Categorie_c,Niveau_c,Fichier_c,Description_c,date_c)"
                    + "VALUES ('introoo','culture',3,'vvvvv','cours integré','2023-02-16')";
            
            Statement ste = cnx.createStatement(); 
            ste.executeUpdate(requete);
            System.out.println("Cours ajouté avec succès ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
    }
    
     public void ajouterCours2(Cours c){
    try {
       
            String requete2 = "INSERT INTO cours(Titre_c,Categorie_c,Niveau_c,Fichier_c,Description_c,date_c)"
                    +" VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
            pst.setString(1,c.getTitre_c());
            pst.setString(2,c.getCategorie_c());
            pst.setInt(3,c.getNiveau_c());
            pst.setString(4,c.getFichier_c());
            pst.setString(5,c.getDescription_c());
            pst.setDate(6, java.sql.Date.valueOf(java.time.LocalDate.now()));
           
         
            pst.executeUpdate();
            System.out.println(" le cours est ajoutée");
            
        } catch (SQLException ex) {
            System.out.println("le cours n'est pas ajoutée");
        }
}
     public void modifierCours(Cours c) {
        try {
            String req = "UPDATE post SET Titre_c = '" + c.getTitre_c() + "', Categorie_c = '" + c.getCategorie_c() + "', Niveau_c = '" + c.getNiveau_c() + "', Fichier_c '" + c.getFichier_c()+ "', Description_c = '" + c.getDescription_c() + "', date_c = '" + c.getDate_c() + "' WHERE Id_c = " + c.getId_c();
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Cours updated !");
        } catch (SQLException ex) {
            System.out.println("Cours updated !");
        }
    }
        
    
    public List<Cours> afficherCours(){
        List<Cours> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM cours";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
                Cours c = new Cours();
                c.setId_c(rs.getInt(1));
                c.setTitre_c(rs.getString("Titre_c"));
                c.setCategorie_c(rs.getString("Categorie_c"));
                c.setNiveau_c(rs.getInt("Niveau_c"));
                c.setFichier_c(rs.getString("Fichier_c"));
                c.setDescription_c(rs.getString("Description_c"));
                c.setDate_c(rs.getDate(7));
                myList.add(c);   
            } 
        }
        catch (SQLException ex) {
            System.out.println("liste n'est pas affichée");
        }
         return myList;
       
    }
    
    
               
        public void supprimerCours(int Id_c) {
        try {
            String req = "DELETE FROM cours WHERE Id_c = " + Id_c;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("cours deleted !");
        } catch (SQLException ex) {
            System.out.println("cours n'est pas supprimé");
        }
    }

    
}
