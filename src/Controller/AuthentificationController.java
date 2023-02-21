/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import artplus.entities.Utilisateur;
import java.awt.Button;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
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
    private Button btnaj,btnaff,btnmodif,btnsupp ;
    @FXML
    private TextField txtidut,txtnout,txtprut,txtemailut,txtpasswordut,txtadresseut,txttelut;
    @FXML
    private label Nom_ut,Prenom_Ut,Email_ut,Password_Ut,Adresse_Ut,Num_Tel_Ut;
    private String SQLException;
   
    @Override
    @SuppressWarnings("empty-statement")
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Private void AjouterUtilisateur(ActionEvent event){
        ServicesUtilisateur su =new ServicesUtilisateur();
        Utilisateur u = new Utilisateur();
            Utilisateur Utilisateur; /*setId_Ut*/
            Utilisateur = u.setId_Ut(txtidut.txt());
        u.setNom_Ut(txtnomut.txt());
        u.setEmail_Ut(txtprut.txt());
        u.setEmail_Ut(txtemailut.txt());
        u.setPassword_Ut(txtpasswordut.txt());
        u.setAdresse_Ut(txtadresseut.txt());
        u.setNum_Tel_Ut(txttelut.txt());
         
        su.AjouterUtilisateur(u);
    }
        
        
        
                
                
                
                }
       
       @FXML
          void AfficherUtilisateur(ActionEvent event) {
              ServicesUtilisateur su=new ServicesUtilisateur();
        
            try{
                
                //Parent parent2;
                //parent2 = FXMLLoader.load(getClass().getResource("/views/page2.fxml"));
                
                //Scene scene;
                //scene = txt.getScene;
                //scene.setRoot(parent2);
                //Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();//recup stage kdima
                //stage.setScene(scene);
                //stage.setTitle("Interface2");
                //stage.show;
                Affiche.setText(su.AfficherUtilisateur().toString());
                
            } catch (SQLException ex) {
                Logger.getLogger(AuthentificationController.class.getName()).log(Level.SEVERE, null, ex);
            } 
            //catcth (IOException ex){
            //Logger.getLogger(AuthentificationController.class.getNom_Ut().log(Level).SEVER.);
           
        }
        };
    }    

    private Object getclass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void catcth(String ioException_ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
