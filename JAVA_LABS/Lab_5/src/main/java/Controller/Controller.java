package Controller;
import View.*;
import Model.*;

/**
 * Created by Zigzagger on 24.04.2017.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        InputData inputData = new InputData();
        inputData.xEnterValue();
        inputData.yEnterValue();
        inputData.xGetValue();
        inputData.yGetValue();
    }
}
