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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author wiemhjiri
 */
public class AbonementController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button annuler;
  
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        annuler.setOnAction(event->{
            try {
                Parent parent3=FXMLLoader
                        .load(getClass().getResource("/view/Accueil.fxml"));
                
                //Scene scene=new Scene(parent2);
                //Stage stage=(Stage) ((Node) event.getSource())
                        //.getScene().getWindow();
                //stage.setScene(scene);
                Scene scene= annuler.getScene();
                scene.setRoot(parent3);
                //stage.setTitle("Interface 2");
               // stage.show();

            } catch (IOException ex) {
                Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
          
          
     
        
        
        
    }    
    
}
