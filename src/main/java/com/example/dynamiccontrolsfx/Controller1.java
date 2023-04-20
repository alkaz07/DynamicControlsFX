package com.example.dynamiccontrolsfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller1 {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        int amount = 10;
        for (int i = 0; i < amount; i++) {
            Reader reader = new Reader();
            System.out.println(reader);
        }
    }
}