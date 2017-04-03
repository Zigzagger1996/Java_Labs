package geekbrains.lessons;

import java.util.Scanner;

/**
 * Created by Zigzagger on 08.03.2017.
 */
public class View {
    public static final String START_GAME_MESSAGE = "The Game is begin !";
    public static final String DECISION_MESSAGE = "And your decision is...";
    public static final String WIN_MESSAGE = "You are right!";
    public static final String WIN_MESSAGE_1_LVL_1 = "You are fu*king lucky #@2#$!*&@# !!!";
    public static final String WIN_MESSAGE_2_LVL_1 = "Ha-ha, you so noob !";
    public static final String WIN_MESSAGE_3_LVL_1 = "Give my greetings to your mother)";
    public static final String BIG_NUMBER_MESSAGE = "Nice try, but your number is bigger than my number!";
    public static final String SMALL_NUMBER_MESSAGE_LVL_1 = "Sorry honey, your number is smaller than my number!";
    public static final String NEXT_LVL_MESSAGE_LVL_1 = "If you so cool, try this one! Now range is from 0 to ";
    public static final String WIN_MESSAGE_1_LVL_2 = "GOD MODE ON !!!!";
    public static final String WIN_MESSAGE_2_LVL_2 = "It's like a secret cow level !";
    public static final String WIN_MESSAGE_3_LVL_2 = "May be next time man, you boring";
    public static final String SMALL_NUMBER_MESSAGE_LVL_2 = "WTF MAN! To big, try smaller!";
    public static final String BIG_NUMBER_MESSAGE_LVL_2 = "Hahahaha, not yet, to small!";


    public void Mr_Robot (){
        System.out.println("_|---|_");
        System.out.println("|     |");
        System.out.println("| ^ ^ |  HI!");
        System.out.println("|  #  |  ||");
        System.out.println("|__-__|  /");
        System.out.println(" _| |___/ ");
        System.out.println("-------");
        System.out.println("I'm Mr.Robot. Lets play some games !");
    }

    public void Game_Selection (int max_range){
        Scanner scanner = new Scanner(System.in);
        System.out.println("In which game you want to play: \n1: Guess the number \n2: GTA V \n3: Minecraft");
        scanner.next();
        System.out.println("Hah, you so silly if you want to play something else than Guess the number ))0)))");
        System.out.println("Lets start. You need to guess my number, it's easy! The range of number is from 0 to " + max_range);
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }
}
