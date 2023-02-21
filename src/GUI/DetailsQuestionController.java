/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import edu.artplus.entities.Question_Quiz;
import edu.artplus.services.Question_QuizCRUD;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author hassen
 */
public class DetailsQuestionController implements Initializable {

    @FXML
    private TableView<Question_Quiz> tableau;
    @FXML
    private TableColumn<Question_Quiz, String> typequestion;
    @FXML
    private TableColumn<Question_Quiz, String> themequestion;
    @FXML
    private TableColumn<Question_Quiz, String> descriptionquestion;
    @FXML
    private TableColumn<Question_Quiz, Integer> timequestion;

    private TableColumn<Question_Quiz, String> tvaction;

    ObservableList<Question_Quiz> data = FXCollections.observableArrayList();

    @FXML
    private TextField ptypequestion;

    @FXML
    private TextField pthemequestion;
    @FXML
    private TextField pdescriptionquestion;
    @FXML
    private TextField ptimequestion;

    @FXML
    private TextField pdescription;
    @FXML
    private Button ajouterquestion;
    @FXML
    private TextField quesid;
    @FXML
    private Button updatequestion;
    @FXML
    private Button deletequestion;

    @FXML
    private TextField recherche;
    @FXML
    private PieChart chart;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        tableau.setOnMouseClicked(e -> {
            Question_Quiz q = new Question_Quiz();
            q = tableau.getSelectionModel().getSelectedItem();
            quesid.setText(String.valueOf(q.getid_quest()));
            ptypequestion.setText(q.gettype_quest());
            pthemequestion.setText(q.gettheme());
            pdescriptionquestion.setText(q.getdesc_quest());
            ptimequestion.setText(String.valueOf(q.gettime_quest()));
        });
    }

    public void refreshlist() {
        Question_QuizCRUD q = new Question_QuizCRUD();
        Question_Quiz quest = new Question_Quiz();
        ObservableList<Question_Quiz> Mylist = q.AfficherQuestions_quizs();

        typequestion.setCellValueFactory(new PropertyValueFactory<>("type question"));
        themequestion.setCellValueFactory(new PropertyValueFactory<>("theme question"));
        descriptionquestion.setCellValueFactory(new PropertyValueFactory<>("description question"));
        timequestion.setCellValueFactory(new PropertyValueFactory<>("time question"));

        tableau.setItems(Mylist);

    }

    @FXML
    private void ajouterquestion2(ActionEvent event) {
        Question_QuizCRUD quest = new Question_QuizCRUD();
        StringBuilder errors = new StringBuilder();

        if (ptypequestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer le type de question ");
            alert.showAndWait();
            return;

        }

        if (pthemequestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer le theme ");
            alert.showAndWait();
            return;

        }

        if (pdescriptionquestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer la description ");
            alert.showAndWait();
            return;

        }

        if (ptimequestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer le temps");
            alert.showAndWait();
            return;

        }

        String type_quest = ptypequestion.getText();
        String desc_quest = pdescription.getText();
        int time = Integer.parseInt(ptimequestion.getText());
        String theme = pthemequestion.getText();
        String description = pdescription.getText();

        Question_Quiz p = new Question_Quiz(type_quest, theme, desc_quest, time);
        Question_QuizCRUD quest1 = new Question_QuizCRUD();
        quest1.ajouterquestion2(p);
         refreshlist();
         stat();
        {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Question Ajoutée");
        alert.showAndWait();
        }
    }

    @FXML
    private void Modifier_Question(ActionEvent event) {
         Question_QuizCRUD q1 = new Question_QuizCRUD();

        if (typequestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer un prix ");
            alert.showAndWait();
            return;

        }

        if (themequestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer une quantite ");
            alert.showAndWait();
            return;

        }

        if (descriptionquestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer un taille ");
            alert.showAndWait();
            return;

        }

        if (ptimequestion.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer un nom");
            alert.showAndWait();
            return;

        }

        if (pdescription.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur");
            alert.setContentText("entrer une description");
            alert.showAndWait();
            return;

        }
        {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Erreur");
        alert.setContentText("Question Modifiée !!!!");
        alert.showAndWait();
        }
    


    int id_quest = Integer.parseInt(quesid.getText());
      String type_quest = typequestion.getText();
            String theme = themequestion.getText();
    String desc_quest = descriptionquestion.getText();
    int time_quest = Integer.parseInt(ptimequestion.getText());
        Question_Quiz p = new Question_Quiz(id_quest, type_quest, theme, desc_quest, time_quest);
        Question_QuizCRUD quest1 = new Question_QuizCRUD();
        quest1.Modifier_Question(p);
         refreshlist();
         stat();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Question Modifier");
        alert.showAndWait();
    
      
    
    

}

@FXML
        private void deletequestion(ActionEvent event) {
        Question_QuizCRUD p1 = new Question_QuizCRUD() ; 
        Question_Quiz p = new Question_Quiz() ; 
        int id = Integer.parseInt(quesid.getText()) ; 
        p.setid_quest(id);
        p1.supprimequestion(p);
         refreshlist();
         stat();
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Question Supprimée");
        alert.showAndWait();
                
    }

    private void stat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
