/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.entities;

import edu.artplus.services.Reponse_QuizCRUD;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author nour
 */
public class Reponse_Quiz {

    private int id_rep;
    private String type_rep;
    private String desc_rep;
    private String rep_choisie;
    private int time_rep;
    private String date_rep;
    private int id_quiz;

    public Reponse_Quiz(String type_rep, String desc_rep, String rep_choisie, int time_rep, String date_rep,int id_quiz) {
        this.type_rep = type_rep;
        this.desc_rep = desc_rep;
        this.rep_choisie = rep_choisie;
        this.time_rep = time_rep;
        this.date_rep = date_rep;
        
         this.id_quiz = id_quiz;

    }

    public Reponse_Quiz(String desc_rep, String rep_choisie) {
        this.desc_rep = desc_rep;
        this.rep_choisie = rep_choisie;
    }
    

    public Reponse_Quiz(int id_rep, String type_rep, String desc_rep, String rep_choisie, int time_rep, String date_rep,int id_quiz) {
        this.id_rep = id_rep;
        this.type_rep = type_rep;
        this.desc_rep = desc_rep;
        this.rep_choisie = rep_choisie;
        this.time_rep = time_rep;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date_rep = date_rep;
      
         this.id_quiz = id_quiz;
    }

    public Reponse_Quiz() {
    }

    public Reponse_Quiz(String type_1, String theme_1, String reponse_1, String string, LocalDate now) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    public int getid_rep() {
        return id_rep;
    }

    public void setid_rep(int id_rep) {
        this.id_rep = id_rep;
    }

    public String gettype_rep() {
        return type_rep;
    }

    public void settype_rep(String type_rep) {
        this.type_rep = type_rep;
    }

    public String getdesc_rep() {
        return desc_rep;
    }

    public void setdesc_rep(String desc_rep) {
        this.desc_rep = desc_rep;
    }

    public String getrep_choisie() {
        return rep_choisie;
    }

    public void setrep_choisie(String rep_choisie) {
        this.rep_choisie = rep_choisie;
    }

    public int gettime_rep() {
        return time_rep;
    }

    public void settime_rep(int time_rep) {
        this.time_rep = time_rep;
    }

    public String getdate_rep() {
        return date_rep;
    }

    public void setdate_rep(String date_rep) {
        Date date = new Date();

        this.date_rep = date_rep;
    }

   

    public int getid_quiz() {
        return id_quiz;
    }

    public void setid_quiz(int id_quiz) {
        this.id_quiz = id_quiz;
    }

    @Override
    public String toString() {
        return "Reponse_Quiz{" + "id_rep=" + id_rep + ", type_rep=" + type_rep + ", desc_rep=" + desc_rep + ", rep_choisie=" + rep_choisie + ", time_rep=" + time_rep + ", date_rep=" + date_rep + ", id_quiz=" + id_quiz + '}';
    }

    
    
   
}
