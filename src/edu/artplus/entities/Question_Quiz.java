/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.entities;

import java.sql.Time;


/**
 *
 * @author nour
 */
public class Question_Quiz {
    private int id_quest;
    private String type_quest;
    private String theme;
    private String desc_quest;

   
  
    private int time_quest;
     private Quiz quiz;
    private int id_quiz;
    public Question_Quiz() {
    }

    public Question_Quiz(String type_quest, String theme, String desc_quest, int time_quest,int id_quiz) {
        this.type_quest = type_quest;
        this.theme = theme;
        this.desc_quest = desc_quest;
        
        this.time_quest = time_quest;
         this.id_quiz = id_quiz;
       
    }

    public Question_Quiz(String type_quest, String theme, String desc_quest, int time_quest) {
        this.type_quest = type_quest;
        this.theme = theme;
        this.desc_quest = desc_quest;
        this.time_quest = time_quest;
    }

    

    public int getid_quiz() {
        return id_quiz;
    }

    public void setid_quiz(int id_quiz) {
        this.id_quiz = id_quiz;
    }

    public Question_Quiz(int id_quest, String type_quest, String theme, String desc_quest, int time_quest) {
        this.id_quest = id_quest;
      
        this.type_quest = type_quest;
        this.theme = theme;
        this.desc_quest = desc_quest;
        
        this.time_quest = time_quest;
       
    }

    public int getid_quest() {
        return id_quest;
    }

    public void setid_quest(int id_quest) {
        this.id_quest = id_quest;
    }

    public String gettype_quest() {
        return type_quest;
    }

    public void settype_quest(String type_quest) {
        this.type_quest = type_quest;
    }

    public String gettheme() {
        return theme;
        
    }

    public void settheme(String theme) {
        this.theme = theme;
    }

    public String getdesc_quest() {
        return desc_quest;
    }

    public void setdesc_quest(String desc_quest) {
        this.desc_quest = desc_quest;
    }

    

    public int gettime_quest() {
        return time_quest;
    }

    public void settime_quest(int time_quest) {
        this.time_quest = time_quest;
    }

    public int getquiz() {
        return id_quiz;
    }

    public void setquiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "Question_Quiz{" + "id_quest=" + id_quest + ", type_quest=" + type_quest + ", theme=" + theme + ", desc_quest=" + desc_quest + ", time_quest=" + time_quest + ", quiz=" + quiz + ", id_quiz=" + id_quiz + '}';
    }

  
    

    
   
}
   