/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.entities;

/**
 *
 * @author Admin
 */
public class Level {
    private  int Id_level ;
    private  int Nom_level ;

    public Level(int Id_level, int Nom_level) {
        this.Id_level = Id_level;
        this.Nom_level = Nom_level;
    }

    public Level(int Nom_level) {
        this.Nom_level = Nom_level;
    }

    public Level() {
    }

    public int getId_level() {
        return Id_level;
    }

    public void setId_level(int Id_level) {
        this.Id_level = Id_level;
    }

    public int getNom_level() {
        return Nom_level;
    }

    public void setNom_level(int Nom_level) {
        this.Nom_level = Nom_level;
    }

    @Override
    public String toString() {
        return "Level{" + "Id_level=" + Id_level + ", Nom_level=" + Nom_level + '}';
    }
    
    
}
