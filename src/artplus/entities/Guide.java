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
public class Guide {
     private int Id_Gd;
    private String Nom_Gd;
    private String Prenom_Gd;
    private String Email_Gd;
    private String Password_Gd;
    private String Adresse_Gd;
    private String Num_Tel_Gd;

    public Guide(int Id_Gd, String Nom_Gd, String Prenom_Gd, String Email_Gd, String Password_Gd, String Adresse_Gd, String Num_Tel_Gd) {
        this.Id_Gd = Id_Gd;
        this.Nom_Gd = Nom_Gd;
        this.Prenom_Gd = Prenom_Gd;
        this.Email_Gd = Email_Gd;
        this.Password_Gd = Password_Gd;
        this.Adresse_Gd = Adresse_Gd;
        this.Num_Tel_Gd = Num_Tel_Gd;
    }

    public Guide(String Nom_Gd, String Prenom_Gd, String Email_Gd, String Password_Gd, String Adresse_Gd, String Num_Tel_Gd) {
        this.Nom_Gd = Nom_Gd;
        this.Prenom_Gd = Prenom_Gd;
        this.Email_Gd = Email_Gd;
        this.Password_Gd = Password_Gd;
        this.Adresse_Gd = Adresse_Gd;
        this.Num_Tel_Gd = Num_Tel_Gd;
    }

    public Guide() {
       
    }

    public int getId_Gd() {
        return Id_Gd;
    }

    public void setId_Gd(int Id_Gd) {
        this.Id_Gd = Id_Gd;
    }

    public String getNom_Gd() {
        return Nom_Gd;
    }

    public void setNom_Gd(String Nom_Gd) {
        this.Nom_Gd = Nom_Gd;
    }

    public String getPrenom_Gd() {
        return Prenom_Gd;
    }

    public void setPrenom_Gd(String Prenom_Gd) {
        this.Prenom_Gd = Prenom_Gd;
    }

    public String getEmail_Gd() {
        return Email_Gd;
    }

    public void setEmail_Gd(String Email_Gd) {
        this.Email_Gd = Email_Gd;
    }

    public String getPassword_Gd() {
        return Password_Gd;
    }

    public void setPassword_Gd(String Password_Gd) {
        this.Password_Gd = Password_Gd;
    }

    public String getAdresse_Gd() {
        return Adresse_Gd;
    }

    public void setAdresse_Gd(String Adresse_Gd) {
        this.Adresse_Gd = Adresse_Gd;
    }

    public String getNum_Tel_Gd() {
        return Num_Tel_Gd;
    }

    public void setNum_Tel_Gd(String Num_Tel_Gd) {
        this.Num_Tel_Gd = Num_Tel_Gd;
    }

    @Override
    public String toString() {
        return "Guide{" + "Id_Gd=" + Id_Gd + ", Nom_Gd=" + Nom_Gd + ", Prenom_Gd=" + Prenom_Gd + ", Email_Gd=" + Email_Gd + ", Password_Gd=" + Password_Gd + ", Adresse_Gd=" + Adresse_Gd + ", Num_Tel_Gd=" + Num_Tel_Gd + '}';
    }
    
    
}
