/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.services;

/**
 *
 * @author nour
 */
import edu.artplus.entities.Reponse_Quiz;
import edu.artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nour
 */
public class Reponse_QuizCRUD {
     LocalDate d = LocalDate.now();

    Connection cnx2;

    public Reponse_QuizCRUD() {
        cnx2 = MyConnection.getInstance().getCnx();
    }

    public List<Reponse_Quiz> AfficherReponse_quizs(int id_rep) {
        List<Reponse_Quiz> myListreponse = new ArrayList<>();
        try {

            String requete3 = "SELECT * From reponse_quiz";
            Statement st = cnx2.createStatement();
            Time time = new Time(12, 30, 1);
            ResultSet rs = st.executeQuery(requete3);
            while (rs.next()) {
                Reponse_Quiz reponse = new Reponse_Quiz();
                reponse.setid_rep(rs.getInt(1));
                reponse.settype_rep(rs.getString("type_rep"));
                reponse.setdesc_rep(rs.getString("desc_rep"));
                reponse.setrep_choisie(rs.getString("rep_choisie"));
                reponse.setdate_rep( rs.getString(String.valueOf(d)));
                reponse.settime_rep(rs.getInt("time_rep"));
               reponse.setid_quiz(rs.getInt(1));
               
             
                myListreponse.add(reponse);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return myListreponse;

    }

    public void ajouterReponse2(Reponse_Quiz r) {
        cnx2 = MyConnection.getInstance().getCnx();
        try {

            String requete1 = "INSERT INTO reponse_quiz(type_rep,desc_rep,rep_choisie,time_rep,date_rep,id_quiz) VALUES ('" + r.gettype_rep() + "','" + r.getdesc_rep() + "','" + r.getrep_choisie() + "','" + r.gettime_rep() + "','" + r.getdate_rep() + "','" + r.getid_quiz() + "'); ";
            Statement st = cnx2.createStatement();

            st.executeUpdate(requete1);

            System.out.println("votre Reponse est ajoutée");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void Modifier_Reponse(Reponse_Quiz r) {
        cnx2 = MyConnection.getInstance().getCnx();
        try {
          
            String requete7 = " update reponse_quiz set desc_rep = ?,time_rep = ?,id_quiz = ? WHERE id_rep =?; " ;
             
            PreparedStatement preparedStmt =cnx2.prepareStatement(requete7);
            
            preparedStmt.setString(1, r.getdesc_rep());
            preparedStmt.setInt(2, r.gettime_rep());
             preparedStmt.setInt(3, r.getid_quiz());
             preparedStmt.setInt(4, r.getid_rep());
            preparedStmt.execute();
        
            {
                System.out.println("Reponse Modifiée !");

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
   

    }

    public void supprimerReponse(Reponse_Quiz r) {

        try {

            String requete5 = "DELETE FROM reponse_quiz WHERE  id_rep=?";
            PreparedStatement ps = cnx2.prepareStatement(requete5);
            ps.setInt(1,r.getid_rep());
           ps.executeUpdate();
            {
                System.out.println("une reponse est supprimée avec scuccés!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
