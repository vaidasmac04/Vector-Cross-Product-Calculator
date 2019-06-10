package Handlers;


import Errors.errorDisplayer;
import javafx.scene.control.TextField;

public class CalculateHandler extends Calculator{

    private TextField[][] coordinatesFields;

    public CalculateHandler(TextField[][] coordinatesFields){
        this.coordinatesFields = coordinatesFields;
    }

    public void calculate() {
        int[][] coordinates = new int[2][3];

        try{
            for(int i = 0; i < coordinates.length; i++){
                for(int j = 0; j < coordinates[i].length; j++){
                    coordinates[i][j] = Integer.parseInt(coordinatesFields[i][j].getText());
                }
            }

            calculateVectorCrossProduct(coordinates[0], coordinates[1], coordinatesFields[2]);

        }catch (NumberFormatException e){
            errorDisplayer.display("Input error",
                    "->Please enter numbers\nor\n->Entered numbers are too big");
        }
    }
}
