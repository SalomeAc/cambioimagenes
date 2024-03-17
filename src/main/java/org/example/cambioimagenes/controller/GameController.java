package org.example.cambioimagenes.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import org.example.cambioimagenes.model.alert.AlertBox;
import javafx.scene.image.ImageView;
import org.example.cambioimagenes.model.player.Player;

public class GameController {
    private Player player;

    @FXML
    private ImageView leftImageView(){

    };

    @FXML
    private ImageView rightImageView() {

    };

    public void setPlayer(Player player){
        this.player = player;

    }

}
