package Handlers;

import javafx.scene.control.TextField;

public class ResetHandler {

    private TextField[][] coordinatesFields;

    public ResetHandler(TextField[][] coordinatesFields){
        this.coordinatesFields = coordinatesFields;
    }

    public void reset(){
        for(int i = 0; i < coordinatesFields.length; i++){
            for(int j = 0; j < coordinatesFields[i].length; j++){
                coordinatesFields[i][j].setText("");
            }
        }
    }

}
