package ntu.hung.bai2_basicgui_bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller
{

    @FXML
    private TextField canNangField;

    @FXML
    private TextField chieuCaoField;

    @FXML
    private CheckBox ChauA;

    @FXML
    private Button btnthuchien;

    @FXML
    private TextField resultBMI;

    @FXML
    private TextField resultDanhGia;

    @FXML
    public void initialize()
    {
        btnthuchien.setOnAction(event -> calculateBMI());
    }

    private void calculateBMI()
    {
        try
        {
            double weight = Double.parseDouble(canNangField.getText());
            double height = Double.parseDouble(chieuCaoField.getText());

            if (height <= 0 || weight <= 0)
            {
                resultBMI.setText("Error");
                resultDanhGia.setText("Chiều cao và cân nặng phải > 0");
                return;
            }

            double bmi = weight / (height * height);
            resultBMI.setText(String.format("%.2f", bmi));

            String evaluation = evaluateBMI(bmi, ChauA.isSelected());
            resultDanhGia.setText(evaluation);
        }
        catch (NumberFormatException e)
        {
            resultBMI.setText("Error");
            resultDanhGia.setText("Nhập số hợp lệ cho chiều cao và cân nặng");
        }
    }

    private String evaluateBMI(double bmi, boolean isAsian)
    {
        if (isAsian)
        {
            if (bmi < 17.5)
            {
                return "Under weight";
            }
            else if (17.5 < bmi && bmi < 22.99)
            {
                return "Normal weight";
            }
            else if (23 < bmi && bmi < 27.99)
            {
                return "Over weight";
            }
            else
            {
                return "Obese";
            }
        }
        else
        {
            if (bmi < 18.5)
            {
                return "Under weight";
            }
            else if (18.5 < bmi && bmi < 24.99)
            {
                return "Normal weight";
            }
            else if (25 < bmi && bmi < 29.99)
            {
                return "Over weight";
            }
            else
            {
                return "Obese";
            }
        }
    }
}
