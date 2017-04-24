import View.View;
import Model.Model;
import Controller.Controller;
/**
 * Created by Zigzagger on 24.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model(0,0);
        View view = new View();
        Controller controller = new Controller(model, view);
        //Start
        controller.processUser();
    }
}
