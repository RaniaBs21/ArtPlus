/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.tests;

import artplus.services.GuideServices;
import artplus.utils.MyConnection;
import artplus.entities.Guide;
/**
 *
 * @author DELL
 */
public class ArtPlus {
    public static void main(String[] args) {
         MyConnection mc = MyConnection.getInstance();
         GuideServices  gcd = new GuideServices ();
         Guide g = new Guide (1,"souha","solaani","souha@gmail.com","souha","tunis","25365214");
         //gcd.ajouterGuide();
         //gcd.ajouterGuide2(g2);
         //gcd.modifierGuide(g);
         //gcd.supprimerGuide(2);
         System.out.println(gcd.afficherGuide()); 
         
     
    
     
             
    }
    
}
