/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class AcceuilController implements Initializable {

    @FXML
    private ToolBar navbar;
    @FXML
    private AnchorPane btnAcc;
    @FXML
    private Button btnCour;
    @FXML
    private Button btnEv;
    @FXML
    private Button btnProd;
    @FXML
    private TextField statut_zone;
    @FXML
    private Button btn_pub;
    @FXML
    private TextField statut_zone1;
    @FXML
    private Button btnTend;
    @FXML
    private Text user_Name;
    @FXML
    private ImageView btnCom;
    @FXML
    private ImageView btnJad;
    @FXML
    private Button btnAss;
    @FXML
    private Button icon_gal;
    @FXML
    private ImageView comment;
    @FXML
    private Button BtnCom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       btnCour.setOnAction( event->{
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/Cours.fxml"));
               Scene scene=btnCour.getScene();
             scene.setRoot(parent2);
             
             //**********methode 2************
             
//                Scene scene=new Scene(parent);
//                Stage stage=(Stage) ((Node) event.getSource())
//                        .getScene().getWindow();
//               stage.setScene(scene);
//               stage.setScene(scene);
//              stage.setTitle("Interface2");
//               stage.show();

           }catch (IOException ex) {
               Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
       
       btnEv.setOnAction( event->{
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/Evenement.fxml"));
             Scene scene=btnCour.getScene();
             scene.setRoot(parent2);
           }catch (IOException ex) {
               Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
             
       btnProd.setOnAction( event->{
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/Produits.fxml"));
             Scene scene=btnCour.getScene();
             scene.setRoot(parent2);
           }catch (IOException ex) {
               Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
       
        btnAss.setOnAction( event->{
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/Assistance.fxml"));
             Scene scene=btnCour.getScene();
             scene.setRoot(parent2);
           }catch (IOException ex) {
               Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
        
        BtnCom.setOnAction( event->{
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/Comment.fxml"));
             Scene scene=BtnCom.getScene();
             scene.setRoot(parent2);
           }catch (IOException ex) {
               Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
       
    
    }
    
}
