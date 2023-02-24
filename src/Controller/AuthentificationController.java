/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import artplus.entities.Utilisateur;
import artplus.utils.MyConnection;
import java.awt.Button;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author OACA
 */
public class AuthentificationController implements Initializable {

    /**
     * Initializes the controller class.
     */
       @FXML
    private javafx.scene.control.Button btnseconnecter;

    @FXML
    private javafx.scene.control.TextField txtnom;

    @FXML
    private javafx.scene.control.TextField txtpassword;
    
    private Parent  fxml;
    

    @FXML
    void openhome(ActionEvent event) {
        String nom = txtnom.getText();
        String pass = txtpassword.getText();
        if (nom.equals("Admin") && pass.equals("Admin")) {
            System.out.println("Heloo");
//          VBox.getScene().getWindow().hide();
            Stage home = new Stage();
            try {
                fxml = FXMLLoader.load(getClass().getResource("/views/Menu.fxml"));
                Scene scene = new Scene(fxml);
                home.setScene(scene);
                home.resizableProperty().setValue(false);
                home.setTitle("AffichageUser");
                home.show();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.close();

            } catch (IOException e) {
                e.printStackTrace();

            }

        } else {
            System.out.println("nom ou mot de passe incorrecte!");
        }
  
    }
    



   
  
   
    @Override
    @SuppressWarnings("empty-statement")
    public void initialize(URL url, ResourceBundle rb) {

}

}
        // TODO
//        
//       
//        
//                
//                
//                
//                }
       
     

    