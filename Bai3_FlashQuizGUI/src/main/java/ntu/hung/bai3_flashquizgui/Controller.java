package ntu.hung.bai3_flashquizgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller
{

    @FXML
    private Button buttonA;

    @FXML
    private Button buttonB;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonD;

    @FXML
    private Button optionA;

    @FXML
    private Button optionB;

    @FXML
    private Button optionC;

    @FXML
    private Button optionD;

    @FXML
    public void initialize()
    {
        // Set up event handlers for buttons
        buttonA.setOnAction(event -> highlightButton(buttonA, optionA.getText()));
        buttonB.setOnAction(event -> highlightButton(buttonB, optionB.getText()));
        buttonC.setOnAction(event -> highlightButton(buttonC, optionC.getText()));
        buttonD.setOnAction(event -> highlightButton(buttonD, optionD.getText()));
    }

    private void highlightButton(Button clickedButton, String correspondingText)
    {
        resetButtonStyles();

        clickedButton.setStyle("-fx-background-color: #32CD32; -fx-background-radius: 50;");

        System.out.println("Selected: " + correspondingText);
    }

    private void resetButtonStyles()
    {
        buttonA.setStyle("-fx-background-radius: 50;");
        buttonB.setStyle("-fx-background-radius: 50;");
        buttonC.setStyle("-fx-background-radius: 50;");
        buttonD.setStyle("-fx-background-radius: 50;");
    }
}
