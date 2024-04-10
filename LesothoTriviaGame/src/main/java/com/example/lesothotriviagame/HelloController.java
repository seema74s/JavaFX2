package com.lesotho.lesothotriviagame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class traviaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}