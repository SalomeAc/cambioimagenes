package org.example.cambioimagenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.cambioimagenes.view.WelcomeStage;

import java.io.IOException;

public class Main extends Application  {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        //new WelcomeStage(); // anonymous instance
        //singleton needs a private static class
        WelcomeStage.getInstance();


    }
}

