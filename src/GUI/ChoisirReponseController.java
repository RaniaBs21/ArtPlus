/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nour
 */
public class ChoisirReponseController implements Initializable {

    @FXML
    private ImageView panier;
    @FXML
    private HBox idquiz;
    @FXML
    private Text label;
    @FXML
    private Text label1;
    @FXML
    private Text label11;
    @FXML
    private ImageView idimage;
    @FXML
    private Button continuer1;
    @FXML
    private TextField searshInput;
    @FXML
    private Button search;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private HBox qteLayout;
    @FXML
    private Button inc;
    @FXML
    private Text qteInput;
    @FXML
    private Button dec;
    @FXML
    private VBox PanierLayout;
    @FXML
    private Text montantLabel;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }
      @FXML
          void continuer1(ActionEvent event) throws IOException {
              Parent root = FXMLLoader.load(getClass().getResource("/ArtPlus/GUI/Resultat.fxml"));
              Scene scene = new Scene(root);
              Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
              stage.setScene(scene);
              stage.show();

    }
          }
