package Main;

import Handlers.CalculateHandler;
import Handlers.ResetHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    private TextField[][] coordinatesFields;

    @FXML
    private TextField dateField;

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField fieldY1;

    @FXML
    private TextField fieldAnswerY;

    @FXML
    private TextField fieldZ2;

    @FXML
    private TextField fieldY2;

    @FXML
    private TextField fieldX1;

    @FXML
    private TextField fieldAnswerX;

    @FXML
    private TextField fieldZ1;

    @FXML
    private TextField fieldAnswerZ;

    @FXML
    private TextField fieldX2;

    @FXML
    void pressedExit(ActionEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void pressedReset(ActionEvent event) {
        ResetHandler handler = new ResetHandler(coordinatesFields);
        handler.reset();
    }

    @FXML
    void pressedCalculate(ActionEvent event) {
        CalculateHandler handler = new CalculateHandler(coordinatesFields);
        handler.calculate();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        coordinatesFields = new TextField[3][3];

        coordinatesFields[0][0] = fieldX1;
        coordinatesFields[0][1] = fieldY1;
        coordinatesFields[0][2] = fieldZ1;

        coordinatesFields[1][0] = fieldX2;
        coordinatesFields[1][1] = fieldY2;
        coordinatesFields[1][2] = fieldZ2;

        coordinatesFields[2][0] = fieldAnswerX;
        coordinatesFields[2][1] = fieldAnswerY;
        coordinatesFields[2][2] = fieldAnswerZ;

        dateField.setText(
                LocalDate.now().toString());

    }
}
