/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import edu.artplus.entities.Question_Quiz;
import edu.artplus.services.Question_QuizCRUD;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class QuestionController implements Initializable {

    @FXML
    private StackedBarChart<?, ?> StackBar;

    @FXML
    private PieChart PieChart; 
   
    
    @FXML
    private Button ajouterreponse1;
    @FXML
    private Button ajouterreponse2;

@Override
    public void initialize(URL url, ResourceBundle rb) {
        ajouterreponse1.setOnAction(event->{ 
           
           try{
               Parent parent2=FXMLLoader
                       .load(getClass().getResource("/view/ChoisirReponse.fxml"));
             Scene scene=ajouterreponse1.getScene();
             scene.setRoot(parent2);
           }catch (IOException ex) {
               Logger.getLogger(QuestionController.class.getName()).log(Level.SEVERE, null, ex);
            
           }
        });
    }
     
    
    @FXML
          void ajouterreponse1(ActionEvent event) throws IOException {
              Parent root = FXMLLoader.load(getClass().getResource("/ArtPlus/GUI/choisirReponse.fxml"));
              Scene scene = new Scene(root);
              Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
              stage.setScene(scene);
              stage.show();

    }

    @FXML
    void ajouterreponse2(ActionEvent event) throws IOException {
        
              Parent root = FXMLLoader.load(getClass().getResource("/ArtPlus/GUI/choisirReponse.fxml"));
              Scene scene = new Scene(root);
              Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
              stage.setScene(scene);
              stage.show();
 
    }
    
       


    void handleMouseEvent(MouseEvent event) {

    }

    

    
   
    }
