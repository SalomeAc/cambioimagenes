package org.example.cambioimagenes.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.example.crapsgame.controller.GameController;

import java.io.IOException;

public class GameStage extends Stage {
    private GameController gameController;
    public GameStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/cambioimagenes/game-view.fxml"));
        Parent root = loader.load();

        gameController = loader.getController();

        setTitle("Ventana juego de craps");
        Scene scene = new Scene(root);
        getIcons().add(new Image(String.valueOf(getClass().getResource(
                "/org/example/cambioimagenes/images/favicon.png"))));
        setResizable(false);
        setScene(scene);
        show();

    }

    public GameController getGameController(){
        return gameController;
    }

    public static GameStage getInstance () throws IOException {
        return GameStageHolder.INSTANCE = new GameStage();
    }
    private static class GameStageHolder{
        private static GameStage INSTANCE;
    }

}
