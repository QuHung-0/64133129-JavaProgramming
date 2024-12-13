package ntu.hung.bai5_simpledict;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class Controller
{

    @FXML
    private TextField EnglishWordsInputField;

    @FXML
    private TextField VietNameseOutPutField;

    @FXML
    private TextArea VietNameseExplainOutPutArea;

    @FXML
    private Button TranslateButton;

    @FXML
    private Button AddMoreWordButton;

    private HashMap<String, DicValue> td;

    public Controller()
    {
        td = new HashMap<>();
        AddDictionary();
    }

    private void AddDictionary()
    {
        td.put("hello", new DicValue("/heˈləʊ/","Xin chào"));
        td.put("goodbye", new DicValue("/ɡʊdˈbaɪ/","Tạm biệt" ));
        td.put("please", new DicValue("/pliːz/","Làm ơn"));
        td.put("yes", new DicValue("/jes/","Vâng"));
        td.put("no", new DicValue("/nəʊ/","Không"));
        td.put("excuse", new DicValue("/ɪkˈskjuːz/","Thứ lỗi"));

    }

    @FXML
    public void initialize()
    {
        TranslateButton.setOnAction(event -> findWord());
    }

    private void findWord()
    {
        VietNameseOutPutField.clear();
        VietNameseExplainOutPutArea.clear();

        String input = EnglishWordsInputField.getText().trim().toLowerCase();

        if (input.isEmpty())
        {
            VietNameseOutPutField.setText("Vui lòng nhập từ cần tìm");
            return;
        }

        if (td.containsKey(input))
        {
            DicValue value = td.get(input);
            VietNameseOutPutField.setText(value.getVietnamese());
            VietNameseExplainOutPutArea.setText(value.getExplanation());
        }
        else
        {
            VietNameseOutPutField.setText("Không tìm thấy từ");
            VietNameseExplainOutPutArea.setText("Từ bạn tìm không có trong từ điển.");
        }
    }

    static class DicValue
    {
        private String vietnamese;
        private String explanation;

        public DicValue(String vietnamese, String explanation)
        {
            this.vietnamese = vietnamese;
            this.explanation = explanation;
        }

        public String getVietnamese()
        {
            return vietnamese;
        }

        public String getExplanation()
        {
            return explanation;
        }
    }


}
