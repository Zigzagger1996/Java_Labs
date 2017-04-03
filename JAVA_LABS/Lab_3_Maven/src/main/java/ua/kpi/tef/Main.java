package ua.kpi.tef;

/**
 * Created by Zigzagger on 21.03.2017.
 * @author — Vladimir Glukhomanyk
 * @version - 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
