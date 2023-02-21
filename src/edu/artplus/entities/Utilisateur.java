/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.entities;
import edu.artplus.services.PointsService;
import java.util.ArrayList;

/**
 *
 * @author nour
 */
public class Utilisateur {
    private int id_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
     private String email;
    private String password;
    private String num_tel;
     private ArrayList<Quiz>ListQuiz;

    public Utilisateur() {
    }

    public Utilisateur(int id_utilisateur, String nom_utilisateur, String prenom_utilisateur, String email, String password, String num_tel, ArrayList<Quiz> ListQuiz) {
        this.id_utilisateur = id_utilisateur;
        this.nom_utilisateur = nom_utilisateur;
        this.prenom_utilisateur = prenom_utilisateur;
        this.email = email;
        this.password = password;
        this.num_tel = num_tel;
        this.ListQuiz = ListQuiz;
    }

    public Utilisateur(String nom_utilisateur, String prenom_utilisateur, String email, String password, String num_tel, ArrayList<Quiz> ListQuiz) {
        this.nom_utilisateur = nom_utilisateur;
        this.prenom_utilisateur = prenom_utilisateur;
        this.email = email;
        this.password = password;
        this.num_tel = num_tel;
        this.ListQuiz = ListQuiz;
    }

    public int getid_utilisateur() {
        return id_utilisateur;
    }

    public void setid_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getnom_utilisateur() {
        return nom_utilisateur;
    }

    public void setnom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getprenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setprenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getnum_tel() {
        return num_tel;
    }

    public void setnum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public ArrayList<Quiz> getListQuiz() {
        return ListQuiz;
    }

    public void setListQuiz(ArrayList<Quiz> ListQuiz) {
        this.ListQuiz = ListQuiz;
    }
    
    
}