package org.example.cambioimagenes.view;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {
    //Constructor
    public WelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/cambioimagenes/welcome-view.fxml"));
        Parent root = loader.load(); // expects IOException
        setTitle("Juego de Craps"); // remove primaryStage (porque se está heredando de Stage)
        Scene scene = new Scene(root);
        getIcons().add(new Image(String.valueOf(getClass().getResource(
                "/org/example/cambioimagenes/images/favicon.png"))));
        setResizable(false);
        setScene(scene);
        show();
    }
    // the pattern singleton starts here
    public static WelcomeStage getInstance() throws IOException{ // this is a method
        //Gets always return something
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }
    private static class WelcomeStageHolder{
        private static WelcomeStage INSTANCE; // The instance doesn't change because it's static (it's constant)
        // no need of gets and sets because it's static, you can just access them



    }
}
