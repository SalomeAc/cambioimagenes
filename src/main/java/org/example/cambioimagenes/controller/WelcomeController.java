package org.example.cambioimagenes.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import org.example.cambioimagenes.model.player.Player;
import org.example.cambioimagenes.view.GameStage;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException{
        String nickname = nicknameTextField.getText();
        Player player = new Player(1,nickname);
        GameStage.getInstance().getGameController().setPlayer(player);

    }

}


