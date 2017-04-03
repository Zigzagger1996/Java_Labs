package geekbrains.lessons;

import java.util.Scanner;

/**
 * Created by Zigzagger on 08.03.2017.
 */
public class Model {

    private int max_range;
    private int number_of_try;

    public int maxRange () { return max_range;}

    public int randomNumber (){return (int)(Math.random() * max_range);}

    public  int tryNumber () {return number_of_try;}
}
