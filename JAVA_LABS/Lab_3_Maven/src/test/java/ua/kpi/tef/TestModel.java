package ua.kpi.tef;

import ua.kpi.tef.Model;
import ua.kpi.tef.View;
import ua.kpi.tef.Controller;
import org.junit.Assert;

/**
 * Created by Zigzagger on 21.03.2017.
 * Unit test for simple App
 */
public class TestModel {

    @org.junit.Test
    public void testArrayFormation() {
        Model model = new Model();
        int[] mass = {0, 1, 2, 3, 2, 5, 6, 5, 8, 0};
        int[] mass2 = new int[10];
        int[] mass3 = {1, 0, 1, 0, 1, 1, 0, 1, 0, 1};

        model.newFirstArray(mass);
        model.newSecondArray(mass2);

        model.arrayFormation();

        model.newFirstArray(mass2);
        model.newSecondArray(mass3);

        Assert.assertArrayEquals(model.getFirstArray(), model.getSecondArray());
    }
}