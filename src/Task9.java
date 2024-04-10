//Enter the name from the keyboard and, using the while loop, output 10 times: <name> loves me (variable text).
//        Each conclusion is from a new term.
//        An example of output to the screen for the name Sveta:
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Sveta loves me.
//        Requirements:
//        The program must read the name of the keyboard.
//        The program should display the text on the screen.
//        The program should display the text specified in the task 10 times. Each conclusion is from a new term.
import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task8
 * @version 10-04-24
 * @author Halyna Poryvaieva
 */
public class Task9 {
    public static void main(String[] args) {
        String text = " loves me.";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + " " + text);
            i++;
        }
    }
}

