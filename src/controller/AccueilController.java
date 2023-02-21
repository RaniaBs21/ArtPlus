/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author wiemhjiri
 */
public class AccueilController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btn;
    @FXML
    private Button evenement ;
    @FXML
    private ImageView txt3;
    @FXML
    private Text txt1;
    @FXML
    private ImageView txt31;
    @FXML
    private ImageView txt311;
   
    @FXML
    private Button cours;
    @FXML
    private Button prod;
    @FXML
    private Button quiz;
    @FXML
    private Button ass;
    @FXML
    private Button fillAct;
    @FXML
    private Button btnAcc;
   
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         btnAcc.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/Acceuil0.fxml"));
               
                Scene scene= btnAcc.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         
        fillAct.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/FillActualite.fxml"));
               
                Scene scene= fillAct.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        btn.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/abonement.fxml"));
                
                //Scene scene=new Scene(parent2);
                //Stage stage=(Stage) ((Node) event.getSource())
                        //.getScene().getWindow();
                //stage.setScene(scene);
                Scene scene= btn.getScene();
                scene.setRoot(parent2);
                //stage.setTitle("Interface 2");
               // stage.show();

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        evenement.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/evenement.fxml"));
               
                Scene scene= evenement.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         cours.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/Accueil.fxml"));
               
                Scene scene= cours.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         prod.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/Produit.fxml"));
               
                Scene scene= prod.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         quiz.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/Quiz.fxml"));
               
                Scene scene= quiz.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         
         ass.setOnAction(event->{
            try {
                Parent parent2=FXMLLoader
                        .load(getClass().getResource("/view/Assistance.fxml"));
               
                Scene scene= ass.getScene();
                scene.setRoot(parent2);
               

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
    }    
    
}
