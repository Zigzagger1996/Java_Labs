package ua.kpi.tef;

import java.util.Scanner;
/**
 * Created by Zigzagger on 21.03.2017.

 */
public class Controller {
    //Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public int inputIntValueWithScanner(Scanner sc) {
            while (!sc.hasNextInt()) {
                view.printMessage(view.ERROR_ENTER + view.ARRAY_ENTER_REQUEST);
                sc.next();
            }
            return sc.nextInt();
    }

    public void firstArrayInitialisation(){
        for(int i = 0; i < model.getFirstArray().length; i++){
            view.printMessagePlusArray(" ", model.getFirstArray(), i);
        }
        view.printMessage("");
    }
    public void secondArrayInitialisation(){
        for(int i = 0; i < model.getSecondArray().length; i++){
            view.printMessagePlusArray(" ", model.getSecondArray(), i);
        }
        view.printMessage("");
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        view.printMessage(view.INFO_MESSAGE);
        view.printMessage(view.ARRAY_SIZE);
        int arraySize = model.arraySize(inputIntValueWithScanner(sc));
        int[] newFirstArray = new int[arraySize];
        int[] newSecondArray = new int[arraySize];
        model.newFirstArray(newFirstArray);
        model.newSecondArray(newSecondArray);
        view.printMessage(view.ARRAY_ENTER_REQUEST);

        for (int i = 0; i < newFirstArray.length; i++) {
            view.indexCounter(i);
            int elementValue = inputIntValueWithScanner(sc);
            model.arrayValue(i, elementValue);
        }

        view.printMessage(View.FIRST_ARRAY_INFO);
        firstArrayInitialisation();
        view.printMessage(View.SECOND_ARRAY_INFO);
        model.arrayFormation();
        secondArrayInitialisation();
    }
}
