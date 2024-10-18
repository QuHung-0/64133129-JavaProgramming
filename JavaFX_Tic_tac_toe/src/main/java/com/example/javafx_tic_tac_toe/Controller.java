package com.example.javafx_tic_tac_toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller
{
    private boolean luotNguoiChoi_1 = true;
    private String[][] KhuVucChoi = new String[3][3];

    @FXML
    private Label luotNguoiChoi;

    @FXML
    private Button button00, button01, button02, button10, button11, button12, button20, button21, button22;

    @FXML
    public void initialize()
    {
        luotNguoiChoi.setText("Lượt người chơi 1");
        resetKhuVucChoi();
    }

    @FXML
    private void handleButtonClick(ActionEvent actionEvent)
    {
        Button click = (Button) actionEvent.getSource();

        String id = click.getId();
        int dong = Character.getNumericValue(id.charAt(id.length() - 2));
        int cot = Character.getNumericValue(id.charAt(id.length() - 1));

        if (KhuVucChoi[dong][cot] == null)  // Only allow moves on empty buttons
        {
            if (luotNguoiChoi_1)
            {
                click.setText("X");
                KhuVucChoi[dong][cot] = "X";
                luotNguoiChoi.setText("Lượt người chơi 2");
            }
            else
            {
                click.setText("O");
                KhuVucChoi[dong][cot] = "O";
                luotNguoiChoi.setText("Lượt người chơi 1");
            }

            if (dieuKienThang())
            {
                if (luotNguoiChoi_1)
                {
                    luotNguoiChoi.setText("Người chơi 1 thắng");
                }
                else
                {
                    luotNguoiChoi.setText("Người chơi 2 thắng");
                }
                disableButtons();
            }
            else if (KhuVucChoiDay())
            {
                luotNguoiChoi.setText("Hòa");
            }

            // Switch player turn
            luotNguoiChoi_1 = !luotNguoiChoi_1;
        }
    }


    private boolean KhuVucChoiDay()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (KhuVucChoi[i][j] == null)
                {
                    return false;
                }
            }
        }
        return true;
    }


    private boolean dieuKienThang()
    {

        for (int i = 0; i < 3; i++)
        {
            if (KhuVucChoi[i][0] != null && KhuVucChoi[i][0].equals(KhuVucChoi[i][1]) && KhuVucChoi[i][1].equals(KhuVucChoi[i][2]))
            {
                return true;
            }
        }

        for (int j = 0; j < 3; j++)
        {
            if (KhuVucChoi[0][j] != null && KhuVucChoi[0][j].equals(KhuVucChoi[1][j]) && KhuVucChoi[1][j].equals(KhuVucChoi[2][j]))
            {
                return true;
            }
        }

        if (KhuVucChoi[0][0] != null && KhuVucChoi[0][0].equals(KhuVucChoi[1][1]) && KhuVucChoi[1][1].equals(KhuVucChoi[2][2]))
        {
            return true;
        }

        if (KhuVucChoi[0][2] != null && KhuVucChoi[0][2].equals(KhuVucChoi[1][1]) && KhuVucChoi[1][1].equals(KhuVucChoi[2][0]))
        {
            return true;
        }

        return false;
    }


    private void resetKhuVucChoi()
    {
        KhuVucChoi = new String[3][3];
        button00.setText("");
        button01.setText("");
        button02.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");
        enableButtons();
    }

    private void enableButtons()
    {
        button00.setDisable(false);
        button01.setDisable(false);
        button02.setDisable(false);
        button10.setDisable(false);
        button11.setDisable(false);
        button12.setDisable(false);
        button20.setDisable(false);
        button21.setDisable(false);
        button22.setDisable(false);
    }

    private void disableButtons()
    {
        button00.setDisable(true);
        button01.setDisable(true);
        button02.setDisable(true);
        button10.setDisable(true);
        button11.setDisable(true);
        button12.setDisable(true);
        button20.setDisable(true);
        button21.setDisable(true);
        button22.setDisable(true);
    }


}