package net.hifor.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author IKin
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}