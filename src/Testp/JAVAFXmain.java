/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testp;

import artplus.tests.ArtPlus;
import artplus.utils.MyConnection;
import java.awt.Button;
import java.awt.TextField;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author OACA
 */
public class JAVAFXmain extends Application {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      MyConnection mc = MyConnection.getInstance();
      launch(args);
       // CRUD crud1=new ServicesUtilisateur();
         //Utilisateur Utilisateur =new Utilisateur("aa","bb"," a@gmail.com","mlsls","naser",2588446);
         
         //Services.supprimerUtilisateur(Utilisateur1);
         //Servoices.modifierUtilisateur(Utilisateur1);
       // Services.supprimerUtilisateur(Reclamation1);
       // System.out.println(crud1.afficherUtilisateur());
       //Services.ajouterUtilisateur(Utilisateur1);
       
       //AdminServices =new AdminServices();
       //Admin Admin=new Admin(3,"MMM");
         //Services.ajouterAdmin(Admin1);
         //Services.modifierAdmin(Admin1);
          //System.out.println(Services.afficheradmin());
         // Services.supprimerAdmin(Admin1);  
         //GuideServices =new GuideServices();
       //Guide Guide=new Guide(2,"MMM","llll","p@gmail.com","mmkmkk",hdhdjd,46841548);
         //Services.ajouterGuide(Guide1);
         //Services.modifierGuide(Guide1);
          //System.out.println(Services.afficherguide());
         // Services.supprimerGuide(Guide1);
       
       
       
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
Parent root ;
        root = FXMLLoader.load(getClass().getResource("/tn/esprit/Authentification/views/Menu.fxml"));
Scene scene = new Scene(root);

primaryStage.setTitle("MON APPLICATION JAVAFX");
primaryStage.setScene(scene);
primaryStage.show();
        }

        
        

    
}
