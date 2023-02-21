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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class CommentController implements Initializable {

    @FXML
    private Button btnReturn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnReturn.setOnAction( event->{
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/Acceuil.fxml"));
             Scene scene=btnReturn.getScene();
             scene.setRoot(parent2);
           }catch (IOException ex) {
               Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
    }    
    
}
