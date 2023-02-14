package artplus.entities;


import java.sql.Time;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Post {
    private int Id_Post;
    private String Type_Post;
    private String Description_Post;
    private int Nbre_Like_Post;
    private Date Date_Post;
    private Time Heure_Post;

    public Post(int Id_Post, String Type_Post, String Description_Post, int Nbre_Like_Post, Date Date_Post, Time Heure_Post) {
        this.Id_Post = Id_Post;
        this.Type_Post = Type_Post;
        this.Description_Post = Description_Post;
        this.Nbre_Like_Post = Nbre_Like_Post;
        this.Date_Post = Date_Post;
        this.Heure_Post = Heure_Post;
    }

    public Post(String Type_Post, String Description_Post, int Nbre_Like_Post, Date Date_Post, Time Heure_Post) {
        this.Type_Post = Type_Post;
        this.Description_Post = Description_Post;
        this.Nbre_Like_Post = Nbre_Like_Post;
        this.Date_Post = Date_Post;
        this.Heure_Post = Heure_Post;
    }

    public Post(String Type_Post, String Description_Post, int Nbre_Like_Post) {
        this.Type_Post = Type_Post;
        this.Description_Post = Description_Post;
        this.Nbre_Like_Post = Nbre_Like_Post;
        
    }

    public Post(){
    
    }

    public int getId_Post() {
        return Id_Post;
    }

    public void setId_Post(int Id_Post) {
        this.Id_Post = Id_Post;
    }

    public String getType_Post() {
        return Type_Post;
    }

    public void setType_Post(String Type_Post) {
        this.Type_Post = Type_Post;
    }

    public String getDescription_Post() {
        return Description_Post;
    }

    public void setDescription_Post(String Description_Post) {
        this.Description_Post = Description_Post;
    }

    public int getNbre_Like_Post() {
        return Nbre_Like_Post;
    }

    public void setNbre_Like_Post(int Nbre_Like_Post) {
        this.Nbre_Like_Post = Nbre_Like_Post;
    }

    public Date getDate_Post() {
        return Date_Post;
    }

    public void setDate_Post(Date Date_Post) {
        this.Date_Post = Date_Post;
    }

    public Time getHeure_Post() {
        return Heure_Post;
    }

    public void setHeure_Post(Time Heure_Post) {
        this.Heure_Post = Heure_Post;
    }

    @Override
    public String toString() {
        return "Post{" + "Id_Post=" + Id_Post + ", Type_Post=" + Type_Post + ", Description_Post=" + Description_Post + ", Nbre_Like_Post=" + Nbre_Like_Post + ", Date_Post=" + Date_Post + ", Heure_Post=" + Heure_Post + '}';
    }

    
 
    
    
    
    
}
