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
public class Abonement {

    private int Id_abon ;
    //private Utilisateur Id_user ;
   private int Id_user ;
   // private Level Id_level ;
    private int Id_level ;
    private int prix_abon ;
    private Date date_abon ;
   
  
    
    public Abonement() {
    }

    public Abonement(int Id_abon,int Id_user, int Id_level, int prix_abon, Date date_abon) {
        this.Id_abon = Id_abon;
        this.Id_user = Id_user;
        this.Id_level = Id_level;
        this.prix_abon = prix_abon;
        this.date_abon = date_abon;
    }

    public Abonement(int Id_user, int Id_level, int prix_abon, Date date_abon) {
        this.Id_user = Id_user;
        this.Id_level = Id_level;
        this.prix_abon = prix_abon;
        this.date_abon = date_abon;
    }

    public Abonement(int Id_user,int Id_level, int prix_abon) {
        this.Id_user = Id_user;
        this.Id_level = Id_level;
        this.prix_abon = prix_abon;
       
    }

    public int getId_abon() {
        return Id_abon;
    }

    public void setId_abon(int Id_abon) {
        this.Id_abon = Id_abon;
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int Id_user) {
        this.Id_user = Id_user;
    }

    public int getId_level() {
        return Id_level;
    }

    public void setId_level(int Id_level) {
        this.Id_level = Id_level;
    }

    public int getPrix_abon() {
        return prix_abon;
    }

    public void setPrix_abon(int prix_abon) {
        this.prix_abon = prix_abon;
    }

    public Date getDate_abon() {
        return date_abon;
    }

    public void setDate_abon(Date date_abon) {
        this.date_abon = date_abon;
    }

    @Override
    public String toString() {
        return "Abonement{" + "Id_abon=" + Id_abon + ", Id_user=" + Id_user + ", Id_level=" + Id_level + ", prix_abon=" + prix_abon + ", date_abon=" + date_abon + '}';
    }
    
    
    
    
}
