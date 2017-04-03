package ua.kpi.tef;

/**
 * Created by Zigzagger on 21.03.2017.
 * В классе содержаться константы и медоты вывода данных на экран
 * @see View
 */
public class View {

    public static final String INFO_MESSAGE = "Lab_First, KPI_2017, Vladimir Glukhomanyk, Var_3";
    public static final String ARRAY_SIZE = "Enter array size: ";
    public static final String ARRAY_ENTER_REQUEST = "Enter first array (just integer value):";
    public static final String ERROR_ENTER = "Wrong value !";
    public static final String FIRST_ARRAY_INFO = "First array: ";
    public static final String SECOND_ARRAY_INFO = "Second array: ";

    public void printMessage(String message){ System.out.println(message);}
    public void printMessagePlusArray(String message, int[] array, int i){ System.out.print(message + array[i]);}

    public void indexCounter(int i){ i = i + 1; System.out.println("Element [" + i + "]:");}
}
