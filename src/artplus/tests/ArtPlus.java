/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.tests;

import artplus.entities.Commentaire;
import artplus.entities.Post;
import artplus.services.CommentaireServices;
import artplus.services.PostServices;
import artplus.utils.MyConnection;

/**
 *
 * @author DELL
 */
public class ArtPlus {
    public static void main(String[] args) {
      MyConnection mc = MyConnection.getInstance();
      /*Post p = new Post("img","img",50);
        PostServices crud = new PostServices();
        crud.ajouterPost2(p);*/
        
       
        CommentaireServices cr = new CommentaireServices();
        Commentaire c= new Commentaire("ranou", 100, 100);
        //cr.ajouterCommentaire2(c);
        cr.modifierCommentaire(c);
        //cr.supprimerCom(1);
        
       
        

//MyConnection mc2 = MyConnection.getInstance();
      //  System.out.println(mc.hashCode()+" - "+mc2.hashCode());
       
        
      /* PostServices pcd = new PostServices();
        pcd.ajouterPost(); //ajout statique */
       
       //PostServices pcd = new PostServices();
       /* Post p2 = new Post("story", "first story", 100);
        pcd.ajouterPost2(p2);*/
       
       //pcd.supprimerPost(5);
         
         
         //pcd.modifierPost(p);
        
        //System.out.println(pcd.afficherPost());
        
       /* CommentaireServices cd = new CommentaireServices();
        cd.ajouterCommentaire();*/
        
       //CommentaireServices cd = new CommentaireServices();
      /* Commentaire c2 = new Commentaire("my comment", 50, 100);
        cd.ajouterCommentaire2(c2);*/
       // cd.supprimerCom(5);
       //System.out.println(cd.afficherCommentaire());
    }
    
}
