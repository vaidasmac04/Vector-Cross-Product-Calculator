package Handlers;

import Errors.errorDisplayer;
import javafx.scene.control.TextField;

public class Calculator {

    private int answer[];

    public Calculator(){
        answer = new int[3];
    }

    protected void calculateVectorCrossProduct(int[] firstVectorCoordinates, int[] secondVectorCoordinates, TextField[] answerFields){
        try{
            answer[0] = getAnswerCoordinate(firstVectorCoordinates[1], secondVectorCoordinates[2],
                    firstVectorCoordinates[2], secondVectorCoordinates[1]);

            answer[1] = (-1)* getAnswerCoordinate(firstVectorCoordinates[0], secondVectorCoordinates[2],
                    firstVectorCoordinates[2], secondVectorCoordinates[0]);

            answer[2] = getAnswerCoordinate(firstVectorCoordinates[0], secondVectorCoordinates[1],
                    firstVectorCoordinates[1], secondVectorCoordinates[0]);

            setAnswerFields(answerFields);
        }catch (ArithmeticException e){
            errorDisplayer.display("Output error", "Answer is too big");
        }

    }

    private void setAnswerFields(TextField[] answerFields){
        for(int i = 0; i < answerFields.length; i++){
            answerFields[i].setText(Integer.toString(answer[i]));
        }
    }

    private int getAnswerCoordinate(int number1, int number2, int number3, int number4) throws ArithmeticException{
        return Math.subtractExact(Math.multiplyExact(number1,number2),Math.multiplyExact(number3,number4));
    }

}
