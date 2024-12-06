package ntu.hung.bai1_basicgui_simplemath;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller
{

    @FXML
    private TextField textFieldA;

    @FXML
    private TextField textFieldB;

    @FXML
    private RadioButton radioAdd;

    @FXML
    private RadioButton radioSubtract;

    @FXML
    private RadioButton radioMultiply;

    @FXML
    private RadioButton radioDivide;

    @FXML
    private TextField textFieldResult;

    @FXML
    private Button buttonCalculate;

    private ToggleGroup operationGroup;

    @FXML
    public void initialize()
    {
        operationGroup = new ToggleGroup();
        radioAdd.setToggleGroup(operationGroup);
        radioSubtract.setToggleGroup(operationGroup);
        radioMultiply.setToggleGroup(operationGroup);
        radioDivide.setToggleGroup(operationGroup);

        radioAdd.setSelected(true);

        buttonCalculate.setOnAction(event -> performCalculation());
    }

    private void performCalculation()
    {
        try
        {
            double numberA = Double.parseDouble(textFieldA.getText());
            double numberB = Double.parseDouble(textFieldB.getText());
            double result = 0;

            RadioButton selectedOperation = (RadioButton) operationGroup.getSelectedToggle();
            if (selectedOperation == radioAdd)
            {
                result = numberA + numberB;
            }
            else if (selectedOperation == radioSubtract)
            {
                result = numberA - numberB;
            }
            else if (selectedOperation == radioMultiply)
            {
                result = numberA * numberB;
            }
            else if (selectedOperation == radioDivide)
            {
                if (numberB == 0)
                {
                    textFieldResult.setText("Error: Division by zero");
                    return;
                }
                result = numberA / numberB;
            }

            textFieldResult.setText(String.valueOf(result));
        }
        catch (NumberFormatException e)
        {
            textFieldResult.setText("Error: Invalid input");
        }
    }
}
