/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Post;
import artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class PostServices implements InterfacePostServices {
    Connection  cnx;
    
    public  PostServices(){
        cnx = MyConnection.getInstance().getConx();
    }
    @Override
    public void ajouterPost(){
        try {
            String requete = "INSERT INTO post(Type_Post,Description_Post,Nbre_Like_Post,Date_Post,Heure_Post)"
                    + "VALUES ('statut','first post','15','2023-02-13','13:56')";
            
            Statement ste = cnx.createStatement(); //ste va executer la requette
            ste.executeUpdate(requete);
            System.out.println("Post ajouté avec succès ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
    }
    @Override
     public void ajouterPost2(Post p){
    try {
       
            String requete2 = "INSERT INTO post (Type_Post,Description_Post,Nbre_Like_Post,Date_Post,Heure_Post)"
                    +" VALUES (?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete2);
            pst.setString(1,p.getType_Post());
            pst.setString(2,p.getDescription_Post());
            pst.setInt(3,p.getNbre_Like_Post());
            pst.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
            pst.setTime(5, java.sql.Time.valueOf(java.time.LocalTime.now()));
         
            pst.executeUpdate();
            System.out.println("votre post est ajoutée");
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}
     @Override
     public void modifierPost(Post p) {
        try {
            String req = "UPDATE post SET Type_Post = '" + p.getType_Post() + "', description_Post = '" + p.getDescription_Post() + "' WHERE Id_Post = " + p.getId_Post();
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Post updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
       @Override     
        public void supprimerPost(int Id_Post) {
        try {
            String req = "DELETE FROM post WHERE Id_Post = " + Id_Post;
            Statement ste = cnx.createStatement();
            ste.executeUpdate(req);
            System.out.println("Post deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Post> afficherPost(){
        List<Post> myList= new ArrayList<>();
        try {
            
            String requete3 = "SELECT * FROM post";
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(requete3);
            while (rs.next()){
                Post p = new Post();
                p.setId_Post(rs.getInt(1));
                p.setType_Post(rs.getString("Type_Post"));
                p.setDescription_Post(rs.getString("Description_Post"));
                p.setNbre_Like_Post(rs.getInt(4));
                p.setDate_Post(rs.getDate(5));
                p.setHeure_Post(rs.getTime(6));
                

                myList.add(p);   
            }
            
        }
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         return myList;
       
    }
    
}
