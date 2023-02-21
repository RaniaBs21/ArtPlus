/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import edu.artplus.entities.Reponse_Quiz;
import edu.artplus.services.Reponse_QuizCRUD;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.time.LocalDate;

public class DetailsReponseController {

    @FXML
    private TableView<Reponse_Quiz> tableau;
    @FXML
    private TableColumn<Reponse_Quiz, String> typequestion;
    @FXML
    private TableColumn<Reponse_Quiz, String> themequestion;
    @FXML
    private TableColumn<Reponse_Quiz, String> descriptionquestion;
    @FXML
    private TableColumn<Reponse_Quiz, String> timequestion;
    @FXML
    private TableColumn<Reponse_Quiz, LocalDate> datequestion;
    @FXML
    private TextField ttype;
    @FXML
    private ComboBox<String> pthemequestion;
    @FXML
    private TextField trepchoisie;
    @FXML
    private TextField ttime;
    @FXML
    private DatePicker iddate;
    @FXML
    private TextField idrep;
    @FXML
    private Button btn_ajouter;
    @FXML
    private Button btnmodifier;
    @FXML
    private Button btnsupprimer;

    @FXML
    public void initialize() {
        // Configure les colonnes de la table
                tableau.setOnMouseClicked(e -> {

        typequestion.setCellValueFactory(new PropertyValueFactory<>("type"));
        themequestion.setCellValueFactory(new PropertyValueFactory<>("theme"));
        descriptionquestion.setCellValueFactory(new PropertyValueFactory<>("reponseChoisie"));
        timequestion.setCellValueFactory(new PropertyValueFactory<>("time"));
        datequestion.setCellValueFactory(new PropertyValueFactory<>("date"));
                });
        // Remplir la liste des thèmes
        pthemequestion.getItems().addAll("Theme 1", "Theme 2", "Theme 3", "Theme 4");

        // Remplir la table avec des données de test
        tableau.getItems().addAll(
                new Reponse_Quiz("Type 1", "Theme 1", "Reponse 1", "12:00", LocalDate.now()),
                new Reponse_Quiz("Type 2", "Theme 2", "Reponse 2", "14:00", LocalDate.now()),
                new Reponse_Quiz("Type 3", "Theme 3", "Reponse 3", "16:00", LocalDate.now())
                 );
                
    }

    @FXML
    public void ajouterReponse() {
        // Récupérer les valeurs des champs de saisie
        String type = ttype.getText();
        String theme = pthemequestion.getValue();
        String reponseChoisie = trepchoisie.getText();
        String time = ttime.getText();
        LocalDate date = iddate.getValue();

        // Ajouter la nouvelle réponse à la table
        tableau.getItems().add(new Reponse_Quiz(type, theme, reponseChoisie, time, date));
    }

    @FXML
    public void modifierReponse() {
        // Récupérer la réponse sélectionnée dans la table
        Reponse_Quiz reponseSelectionnee = tableau.getSelectionModel().getSelectedItem();

        // Vérifier qu'une réponse est bien sélectionnée
        if (reponseSelectionnee == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Aucune réponse sélectionnée");
            alert.setContentText("Veuillez sélectionner une réponse à modifier.");
            alert.showAndWait();
            return;
        }

        // Récupérer les nouvelles valeurs des champs de saisie
        String type = ttype.getText();
        String theme = pthemequestion.getValue();
        String reponseChoisie = trepchoisie.getText();
        String time = ttime.getText();
        LocalDate date = iddate.getValue();

    }
}