/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.services;

import edu.artplus.entities.Question_Quiz;
import edu.artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import edu.artplus.entities.Quiz;

import java.util.HashSet;
import edu.artplus.entities.Quiz;
import edu.artplus.entities.Reponse_Quiz;

import java.util.List;
import java.util.Set;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import jdk.nashorn.internal.objects.NativeDate;

/**
 *
 * @author nour
 */
public class Question_QuizCRUD {

    Connection cnx2;

    public Question_QuizCRUD() {
        cnx2 = MyConnection.getInstance().getCnx();
    }

    long l = 1000;

    

    public void ajouterquestion2(Question_Quiz q) {
        cnx2 = MyConnection.getInstance().getCnx();
        

        try {
             String requete2 = "INSERT INTO question_quiz(type_quest,theme,desc_quest,time_quest,id_quiz) VALUES ('" + q.gettype_quest() + "','" + q.gettheme() + "','" + q.getdesc_quest() + "','" +q.gettime_quest() + "','"+q.getid_quiz()+"'); ";
           Statement st = cnx2.createStatement();
           
            st.executeUpdate(requete2);
            System.out.println("votre question est ajoutée");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public ObservableList<Question_Quiz> AfficherQuestions_quizs() {
         ObservableList<Question_Quiz> myList = FXCollections.observableArrayList();
              String requete3 = "SELECT * From question_quiz";
                Statement st;
        try {

            st = cnx2.createStatement();
            Time time = new Time(12, 30, 1);
            ResultSet rs = st.executeQuery(requete3);
            while (rs.next()) {
                Question_Quiz ques = new Question_Quiz();
                ques.setid_quest(rs.getInt(1));
                ques.settype_quest(rs.getString("type_quest"));
                ques.settheme(rs.getString("theme"));
                ques.setdesc_quest(rs.getString("desc_quest"));
                
                ques.settime_quest(rs.getInt("time_quest"));
                myList.add(ques) ;
              
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return myList;

    }
     public void supprimequestion(Question_Quiz q) {

        try {

            String requete5 = "DELETE FROM question_quiz WHERE  id_quest=?";
            PreparedStatement ps = cnx2.prepareStatement(requete5);
            ps.setInt(1,q.getid_quest());
           ps.executeUpdate();
            {
                System.out.println("une question est supprimée avec scuccés!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
      public void Modifier_Question(Question_Quiz q) {
        cnx2 = MyConnection.getInstance().getCnx();
        try {
          
            String requete7 = " update question_quiz set type_quest = ?,theme = ?,desc_quest = ?,time_quest = ? WHERE id_quest =?; " ;
             
            PreparedStatement preparedStmt =cnx2.prepareStatement(requete7);
            
            preparedStmt.setString(1, q.gettype_quest());
            preparedStmt.setString(2, q.gettheme());
             preparedStmt.setString(3,q.getdesc_quest());
             preparedStmt.setInt(4, q.gettime_quest());
             preparedStmt.setInt(5, q.getid_quest());
            preparedStmt.execute();
        
            {
                System.out.println("Question Modifiée !");

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
   

    }

    public void supprimerReponse(Question_Quiz q) {

        try {

            String requete5 = "DELETE FROM reponse_quiz WHERE  id_rep=?";
            PreparedStatement ps = cnx2.prepareStatement(requete5);
            ps.setInt(1,q.getid_quest());
           ps.executeUpdate();
            {
                System.out.println("une reponse est supprimée avec scuccés!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }


     public int GetthemeId(String theme) {
       
        int id = -1 ; 

        
        try {
            String query = " SELECT id from marque where libelle = ? ; ";
            PreparedStatement preparedStmt = cnx2.prepareStatement(query);
            preparedStmt.setString(1, theme );
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next() == false)
            {
                System.out.println("theme not found "); 
                
            }
            else {
                id=rs.getInt(1);
            }
            
        } catch (SQLException ex) {
        }
        
        return id ; 
    }
    
    
    public String GetthemeName(int id ) {
       
        String theme = "asdasdasdasd" ; 

       
        try {
            String query = " SELECT theme from question_quiz where id = ? ; ";
            PreparedStatement preparedStmt = cnx2.prepareStatement(query);
            preparedStmt.setInt(1, id );
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next() == false)
            {
                System.out.println("theme not found "); 
                
            }
            else {
                    
                theme=rs.getString(1);
            }
            
        } catch (SQLException ex) {
        }
        
        return theme ; 
    }
}
