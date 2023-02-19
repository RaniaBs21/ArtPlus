/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.entities;

/**
 *
 * @author OACA
 */
public class Admin {
      private int Id_Ad;
    private String Nom_Ad;
    private String Prenom_Ad;
    private String Email_Ad;
    private String Password_Ad;
    private String Adresse_Ad;
    private String Num_Tel_Ad;

    public Admin(int Id_Ad, String Nom_Ad, String Prenom_Ad, String Email_Ad, String Password_Ad, String Adresse_Ad, String Num_Tel_Ad) {
        this.Id_Ad = Id_Ad;
        this.Nom_Ad = Nom_Ad;
        this.Prenom_Ad = Prenom_Ad;
        this.Email_Ad = Email_Ad;
        this.Password_Ad = Password_Ad;
        this.Adresse_Ad = Adresse_Ad;
        this.Num_Tel_Ad = Num_Tel_Ad;
    }

    public Admin(String Nom_Ad, String Prenom_Ad, String Email_Ad, String Password_Ad, String Adresse_Ad, String Num_Tel_Ad) {
        this.Nom_Ad = Nom_Ad;
        this.Prenom_Ad = Prenom_Ad;
        this.Email_Ad = Email_Ad;
        this.Password_Ad = Password_Ad;
        this.Adresse_Ad = Adresse_Ad;
        this.Num_Tel_Ad = Num_Tel_Ad;
    }

    public int getId_Ad() {
        return Id_Ad;
    }

    public void setId_Ad(int Id_Ad) {
        this.Id_Ad = Id_Ad;
    }

    public String getNom_Ad() {
        return Nom_Ad;
    }

    public void setNom_Ad(String Nom_Ad) {
        this.Nom_Ad = Nom_Ad;
    }

    public String getPrenom_Ad() {
        return Prenom_Ad;
    }

    public void setPrenom_Ad(String Prenom_Ad) {
        this.Prenom_Ad = Prenom_Ad;
    }

    public String getEmail_Ad() {
        return Email_Ad;
    }

    public void setEmail_Ad(String Email_Ad) {
        this.Email_Ad = Email_Ad;
    }

    public String getPassword_Ad() {
        return Password_Ad;
    }

    public void setPassword_Ad(String Password_Ad) {
        this.Password_Ad = Password_Ad;
    }

    public String getAdresse_Ad() {
        return Adresse_Ad;
    }

    public void setAdresse_Ad(String Adresse_Ad) {
        this.Adresse_Ad = Adresse_Ad;
    }

    public String getNum_Tel_Ad() {
        return Num_Tel_Ad;
    }

    public void setNum_Tel_Ad(String Num_Tel_Ad) {
        this.Num_Tel_Ad = Num_Tel_Ad;
    }

    @Override
    public String toString() {
        return "Admin{" + "Id_Ad=" + Id_Ad + ", Nom_Ad=" + Nom_Ad + ", Prenom_Ad=" + Prenom_Ad + ", Email_Ad=" + Email_Ad + ", Password_Ad=" + Password_Ad + ", Adresse_Ad=" + Adresse_Ad + ", Num_Tel_Ad=" + Num_Tel_Ad + '}';
    }
    
    
}
