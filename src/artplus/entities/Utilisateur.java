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
public class Utilisateur {
     private int Id_Ut;
    private String Nom_Ut;
    private String Prenom_Ut;
    private String Email_Ut;
    private String Password_Ut;
    private String Adresse_Ut;
    private String Num_Tel_Ut;
  

    public Utilisateur(int Id_Ut, String Nom_Ut, String Prenom_Ut, String Email_Ut, String Password_Ut, String Adresse_Ut, String Num_Tel_Ut) {
        this.Id_Ut = Id_Ut;
        this.Nom_Ut = Nom_Ut;
        this.Prenom_Ut = Prenom_Ut;
        this.Email_Ut = Email_Ut;
        this.Password_Ut = Password_Ut;
        this.Adresse_Ut = Adresse_Ut;
        this.Num_Tel_Ut = Num_Tel_Ut;
    }

    public Utilisateur(String Nom_Ut, String Prenom_Ut, String Email_Ut, String Password_Ut, String Adresse_Ut, String Num_Tel_Ut) {
        this.Nom_Ut = Nom_Ut;
        this.Prenom_Ut = Prenom_Ut;
        this.Email_Ut = Email_Ut;
        this.Password_Ut = Password_Ut;
        this.Adresse_Ut = Adresse_Ut;
        this.Num_Tel_Ut = Num_Tel_Ut;
    }

    public Utilisateur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_Ut() {
        return Id_Ut;
    }

    public void setId_Ut(int Id_Ut) {
        this.Id_Ut = Id_Ut;
    }

    public String getNom_Ut() {
        return Nom_Ut;
    }

    public void setNom_Ut(String Nom_Ut) {
        this.Nom_Ut = Nom_Ut;
    }

    public String getPrenom_Ut() {
        return Prenom_Ut;
    }

    public void setPrenom_Ut(String Prenom_Ut) {
        this.Prenom_Ut = Prenom_Ut;
    }

    public String getEmail_Ut() {
        return Email_Ut;
    }

    public void setEmail_Ut(String Email_Ut) {
        this.Email_Ut = Email_Ut;
    }

    public String getPassword_Ut() {
        return Password_Ut;
    }

    public void setPassword_Ut(String Password_Ut) {
        this.Password_Ut = Password_Ut;
    }

    public String getAdresse_Ut() {
        return Adresse_Ut;
    }

    public void setAdresse_Ut(String Adresse_Ut) {
        this.Adresse_Ut = Adresse_Ut;
    }

    public String getNum_Tel_Ut() {
        return Num_Tel_Ut;
    }

    public void setNum_Tel_Ut(String Num_Tel_Ut) {
        this.Num_Tel_Ut = Num_Tel_Ut;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "Id_Ut=" + Id_Ut + ", Nom_Ut=" + Nom_Ut + ", Prenom_Ut=" + Prenom_Ut + ", Email_Ut=" + Email_Ut + ", Password_Ut=" + Password_Ut + ", Adresse_Ut=" + Adresse_Ut + ", Num_Tel_Ut=" + Num_Tel_Ut + '}';
    }
    
    
}
