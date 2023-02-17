/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.entities;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Cours {
   private int Id_c ;
   private String  Titre_c ;
   private String   Categorie_c ;
    private int  Niveau_c ;
    private String   Fichier_c ;
   private String   Description_c ;
    private Date date_c;

    public Cours(int Id_c, String Titre_c, String Categorie_c, int Niveau_c, String Fichier_c, String Description_c, Date date_c) {
        this.Id_c = Id_c;
        this.Titre_c = Titre_c;
        this.Categorie_c = Categorie_c;
        this.Niveau_c = Niveau_c;
        this.Fichier_c = Fichier_c;
        this.Description_c = Description_c;
        this.date_c = date_c;
    }

    public Cours(String Titre_c, String Categorie_c, int Niveau_c, String Fichier_c, String Description_c, Date date_c) {
        this.Titre_c = Titre_c;
        this.Categorie_c = Categorie_c;
        this.Niveau_c = Niveau_c;
        this.Fichier_c = Fichier_c;
        this.Description_c = Description_c;
        this.date_c = date_c;
    }

    public Cours(String Titre_c, String Categorie_c, int Niveau_c, String Fichier_c, String Description_c) {
        this.Titre_c = Titre_c;
        this.Categorie_c = Categorie_c;
        this.Niveau_c = Niveau_c;
        this.Fichier_c = Fichier_c;
        this.Description_c = Description_c;
    }

    public Cours() {
    }

    public int getId_c() {
        return Id_c;
    }

    public void setId_c(int Id_c) {
        this.Id_c = Id_c;
    }

    public String getTitre_c() {
        return Titre_c;
    }

    public void setTitre_c(String Titre_c) {
        this.Titre_c = Titre_c;
    }

    public String getCategorie_c() {
        return Categorie_c;
    }

    public void setCategorie_c(String Categorie_c) {
        this.Categorie_c = Categorie_c;
    }

    public int getNiveau_c() {
        return Niveau_c;
    }

    public void setNiveau_c(int Niveau_c) {
        this.Niveau_c = Niveau_c;
    }

    public String getFichier_c() {
        return Fichier_c;
    }

    public void setFichier_c(String Fichier_c) {
        this.Fichier_c = Fichier_c;
    }

    public String getDescription_c() {
        return Description_c;
    }

    public void setDescription_c(String Description_c) {
        this.Description_c = Description_c;
    }

    public Date getDate_c() {
        return date_c;
    }

    public void setDate_c(Date date_c) {
        this.date_c = date_c;
    }

    @Override
    public String toString() {
        return "Cours{" + "Id_c=" + Id_c + ", Titre_c=" + Titre_c + ", Categorie_c=" + Categorie_c + ", Niveau_c=" + Niveau_c + ", Fichier_c=" + Fichier_c + ", Description_c=" + Description_c + ", date_c=" + date_c + '}';
    }
    
}
