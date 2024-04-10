//Using the while loop, display a quote (variable quote) on the screen a hundred times:
//        "I will never work for pennies. Amigo"
//Output each value from a new line.
//        Requirements:
//The program should display the text on the screen.
//The program should display the contents of the variable quote 100 times.
//The program must use a while loop.

import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task8
 * @version 10-04-24
 * @author Halyna Poryvaieva
 */
public class Task8{
    public static void main(String[] args) {
        String quote = "I will never work for pennies. Amigo";
        int i = 1;
        while (i <= 100) {
            System.out.println(quote);
            i++;
        }
    }
}
