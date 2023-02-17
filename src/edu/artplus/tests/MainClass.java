/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.tests;

import edu.artplus.entities.Categorie_cours;
import edu.artplus.entities.Cours;
import edu.artplus.entities.Level;
import edu.artplus.services.CategorieServices;
import edu.artplus.services.CoursServices;
import edu.artplus.services.LevelServices;
import edu.artplus.utils.MyConnection;

/**
 *
 * @author Admin
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author DELL
 */
public class MainClass  {
    public static void main(String[] args) {
      //MyConnection mc = MyConnection.getInstance();
      //MyConnection mc2 = MyConnection.getInstance();
       //System.out.println(mc.hashCode()+" - "+mc2.hashCode());
       
        
       // CoursServices pcd = new CoursServices();
        //pcd.ajouterCours(); 
        //CoursServices pcd1 = new CoursServices();
       // Cours p2 = new Cours("hhhh","ggggg" ,3, " courss","aaaa");
        //pcd1.ajouterCours2(p2) ;
        //pcd.supprimerCours(5);
         
           
        //LevelServices pcd2 = new LevelServices();
        //pcd2.ajouterLevel(); 
        //LevelServices pcd3 = new LevelServices();
        //Level lev2 = new Level(6);
       // pcd3.ajouterLevel2(lev2) ;
       // pcd2.supprimerLevel(5);
       //System.out.println(pcd2.afficherLevel());
       
       
      CategorieServices pcd4 = new CategorieServices();
       // pcd4.ajouterCategorie(); 
        //CategorieServices pcd5 = new CategorieServices();
        //Categorie_cours cat = new Categorie_cours("sooooooo");
        //pcd5.ajouterCategorie2(cat) ;
        // pcd4.supprimerCategorie(5);
        System.out.println(pcd4.afficherCategorie());
         
    }
    
}
