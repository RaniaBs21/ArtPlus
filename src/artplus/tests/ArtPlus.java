/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.tests;

import artplus.entities.Admin;
import artplus.services.GuideServices;
import artplus.utils.MyConnection;
import artplus.entities.Guide;
import artplus.entities.Utilisateur;
import artplus.services.AdminServices;
import artplus.services.UtilisateurServices;

/**
 *
 * @author DELL
 */
public class ArtPlus {

    private static Utilisateur u2;

    
    public static void main(String[] args) {
        
 // ***************** connexion bd ****************
       MyConnection mc = MyConnection.getInstance();
       
//*******************crude guide *****************

         //GuideServices  gcd = new GuideServices ();
         //Guide g = new Guide (1,"souha","solaani","souha@gmail.com","souha","tunis","25365214");
         //gcd.ajouterGuide();
         //gcd.ajouterGuide2(g2);
         //gcd.modifierGuide(g);
         //gcd.supprimerGuide(2);
         //System.out.println(gcd.afficherGuide()); 
         
     
 // **************** crud Admin ******************** 
 
        // AdminServices  acd = new AdminServices ();
         //Admin a = new Admin ("souha","solaani","souha@gmail.com","souha","tunis","25365214");
         //acd.ajouterAdmin();
        // acd.ajouterAdmin2(a);
        
        /* Admin a2 = new Admin (2,"add","ad","souha@gmail.com","souha","tunis","25365214");
         acd.modifierAdmin(a2);*/
        
         //acd.supprimerAdmin(2);
         //System.out.println(acd.afficherAdmin()); 
         
         
         
             
  // **************** crud Utilisateur ******************** 
  
        // UtilisateurServices  Ucd = new UtilisateurServices ();
         //Utilisateur u = new Utilisateur ("souha","solaani","souha@gmail.com","souha","tunis","25365214");
         //Ucd.ajouterUtilisateur();
         //Ucd.ajouterUtilisateur2(u);
         
        /* Utilisateur u2 = new Utilisateur (1,"souha","solaani","souha@gmail.com","souha","tunis","25365214");
         Ucd.modifierUtilisateur(u2);*/
        
        // Ucd.supprimerUtilisateur(2);
        
        
        // System.out.println(Ucd.afficherUtilisateur());
    }
   
     
}
