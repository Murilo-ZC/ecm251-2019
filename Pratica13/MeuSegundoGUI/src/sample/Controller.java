package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label lblText;
    @FXML
    private TextField txtName;

    @FXML
    public void changeText(){
        lblText.setText("Hello " + txtName.getText());
        txtName.clear();
    }
}
