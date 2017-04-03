package geekbrains.lessons;

import java.util.Scanner;

/**
 * Created by Zigzagger on 08.03.2017.
 */
public class Controller {
            Scanner scanner = new Scanner(System.in);
            int max_range = 40;
            int number_of_try = 1;
            int conceived_number = (int)(Math.random() * max_range);
            System.out.println("The Game is begin !");
            System.out.println("_|---|_");
            System.out.println("|     |");
            System.out.println("| ^ ^ |  HI!");
            System.out.println("|  #  |  ||");
            System.out.println("|__-__|  /");
            System.out.println(" _| |___/ ");
            System.out.println("-------");
            System.out.println("I'm Mr.Robot. Lets play some games !");
            System.out.println("In which game you want to play: \n1: Guess the number \n2: GTA V \n3: Minecraft");
            scanner.next();
            System.out.println("Hah, you so silly if you want to play something else than Guess the number ))0)))");
            System.out.println("Lets start. You need to guess my number, it's easy! The range of number is from 0 to " + max_range);
            while(true){
                System.out.println("And your decision is...");
                int user_number = scanner.nextInt();

                if (user_number == conceived_number){
                    System.out.println("You are right!");
                    System.out.println("Generally you'w done " + number_of_try + " trying");
                    if (number_of_try == 1) {
                        System.out.println("You are fu*king lucky #@2#$!*&@# !!!");
                    } else if (number_of_try > 10){
                        System.out.println("Ha-ha, you so noob !");
                    } else if (number_of_try < 10){
                        System.out.println("Give my greetings to your mother");
                    }
                    break;
                }
                else if(user_number > conceived_number){
                    System.out.println("Nice try, but your number is bigger than my number!");
                }
                else {
                    System.out.println("Sorry honey, your number is smaller than my number!");
                }
                number_of_try++;
            }
            max_range = max_range + 60;
            conceived_number = (int)(Math.random() * max_range);
            System.out.println("If you so cool, try this one! Now range is from 0 to " + max_range);
            number_of_try = 1;
            while(true){
                System.out.println("And your decision is...");
                int user_number = scanner.nextInt();

                if (user_number == conceived_number){
                    System.out.println("You are right!");
                    System.out.println("Generally you'w done " + number_of_try + " trying");
                    if (number_of_try == 1) {
                        System.out.println("GOD MODE ON !!!!");
                    } else if (number_of_try < 10){
                        System.out.println("It's like a secret cow level !");
                    } else if (number_of_try > 10){
                        System.out.println("May be next time man, you boring");
                    }
                    break;
                }
                else if(user_number > conceived_number){
                    System.out.println("WTF MAN! To big, try smaller!");
                }
                else {
                    System.out.println("Hahahaha, not yet, to small!");
                }
                number_of_try++;
            }
            scanner.close();
        }
}
