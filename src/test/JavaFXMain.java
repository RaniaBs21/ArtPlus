/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rahma
 */
public class JavaFXMain extends Application {

    private Stage primaryStage;
    private Parent parent;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        parent = FXMLLoader.load(getClass().getResource("/artplus/view/EvenementGuide.fxml"));
        //parent = FXMLLoader.load(getClass().getResource("/artplus/view/Evenement.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }

}
