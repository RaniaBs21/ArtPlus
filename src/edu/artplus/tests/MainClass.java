/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.tests;

import edu.artplus.entities.Abonement;
import edu.artplus.entities.Categorie_cours;
import edu.artplus.entities.Cours;
import edu.artplus.entities.Level;
import edu.artplus.entities.Sous_categorie;
import edu.artplus.services.AbonnementServices;
import edu.artplus.services.CategorieServices;
import edu.artplus.services.CoursServices;
import edu.artplus.services.LevelServices;
import edu.artplus.services.Sous_categorieServices;
import edu.artplus.utils.MyConnection;


public class MainClass  {
    public static void main(String[] args) {
      //MyConnection mc = MyConnection.getInstance();
      //MyConnection mc2 = MyConnection.getInstance();
       //System.out.println(mc.hashCode()+" - "+mc2.hashCode());
       
        
       //CoursServices pcd = new CoursServices();
        //pcd.ajouterCours(); 
        CoursServices pcd1 = new CoursServices();
      // Cours p2 = new Cours("introduction generale","arts visuels" ,0, "/files/cours1","C'est un ours introductive sur l'art de la scène en presentant plusieurs notions de base très importants avant d'avancer dans les cours prochains ");
        //pcd1.ajouterCours2(p2) ;
       // Cours p3 = new Cours("les bases d'arts visuels","arts visuels" ,0, "/files/cours2","Dans ce cours vous allez bien comprendre les notions que vous allez les utiliser aucours de votre apprentissage ");
       // pcd1.ajouterCours2(p3) ;
        //pcd.supprimerCours(5);
        CoursServices pcd7 = new CoursServices();
        Cours p4 = new Cours(1, "les bases fondamenteaux d'arts visuels","arts visuels" ,0, "/files/cours2","Dans ce cours vous allez bien comprendre les notions que vous allez les utiliser aucours de votre apprentissage ",java.sql.Date.valueOf("2023-02-21"));
        pcd7.modifierCours(p4); 
        //System.out.println(pcd1.afficherCours());
         
           
        LevelServices pcd2 = new LevelServices();
        //pcd2.ajouterLevel(); 
        //LevelServices pcd3 = new LevelServices();
        //Level lev2 = new Level(3);
        //pcd3.ajouterLevel2(lev2) ;
       // pcd2.supprimerLevel(5);
       LevelServices pcds = new LevelServices();
      //  Level lev = new Level(1,1);
      // pcds.modifierLevel(lev);
       //System.out.println(pcd2.afficherLevel());
       
       
      CategorieServices pcd4 = new CategorieServices();
       // pcd4.ajouterCategorie(); 
       // CategorieServices pcd5 = new CategorieServices();
        //Categorie_cours cat = new Categorie_cours("Culture");
        //pcd5.ajouterCategorie2(cat) ;
        //pcd4.supprimerCategorie(3);
        CategorieServices pcd6 = new CategorieServices();
       //Categorie_cours cat2 = new Categorie_cours(4,"Art et culture");
       // pcd6.modifierCategorie(cat2);
        //System.out.println(pcd4.afficherCategorie());
        
        
        
        
        Sous_categorieServices psc = new Sous_categorieServices();
        //psc.ajouterSous_categorie(); 
        Sous_categorieServices psc1 = new Sous_categorieServices();
        Sous_categorie scat = new Sous_categorie("les traditions ");
        psc1.ajouterSous_categorie2(scat) ;
       // psc.supprimerSous_categorie(4);
        System.out.println(psc.afficherSous_Categorie());
        Sous_categorieServices psc2 = new Sous_categorieServices();
       // psc.supprimerSous_categorie(2);
        //Sous_categorie scat2 = new Sous_categorie(1,"couture");
       // psc2.modifierSous_categorie(scat2);
         
        AbonnementServices abon = new  AbonnementServices();
       // abon.ajouterAbonement();
        AbonnementServices abon1 = new  AbonnementServices();
         Abonement abon2 = new Abonement(1,2,500);
         //abon1.ajouterAbonment2(abon2);
         abon.supprimerAbonement(2);
         
        
       
    }
    
}
