package Errors;

import javafx.scene.control.Alert;

public class errorDisplayer {

    public static void display(String errorName, String errorMessage){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(errorName);
        alert.setHeaderText(errorMessage);
        alert.showAndWait();
    }
}
