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
 * @author DELL
 */
public class JavaFxMain extends Application{
    private Stage stage;
    private Parent parent;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.stage= new Stage();
        parent=FXMLLoader.load(getClass().getResource("/view/Acceuil.fxml"));
        //parent=FXMLLoader.load(getClass().getResource("/view/Comment.fxml"));
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}

