package Controller;
import View.*;
import Model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Zigzagger on 24.04.2017.
 */
public class InputData {

    Model model = new Model(0,0);
    View view = new View();
    Scanner scanner = new Scanner(System.in);

    public int inputData(Scanner scanner, String errorMessage){
        while (! scanner.hasNextInt() ){
            view.printMessage(errorMessage);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void xEnterValue(){
        view.printMessage(TextConstants.INPUT_X);
        model.setX(inputData(scanner, TextConstants.WRONG_DATA_INPUT));
    }

    public void yEnterValue(){
        view.printMessage(TextConstants.INPUT_Y);
        model.setY(inputData(scanner, TextConstants.WRONG_DATA_INPUT));
    }

    public void xGetValue(){
        view.printMessagePlusValue(TextConstants.OUTPUT_X, model.getX());
    }

    public void yGetValue(){
        view.printMessagePlusValue(TextConstants.OUTPUT_y, model.getY());
    }
}
