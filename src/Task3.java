//We have a program that reads two numbers from the keyboard and displays the larger one on the screen.
// If the numbers are the same, then any number is displayed.
//Rewrite the program using the ternary operator so that its functionality remains unchanged.
//
//Requirements:
//• The program must read two numbers from the keyboard.
//• Instead of an if-else statement, you should use a ternary operator in your program.
//• The functionality of the program should not change.
/*
We are looking for the maximum
*/
import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task3
 * @version 22-Mar-24
 * @author Halyna Poryvaieva
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
       int max=numberA>numberB?numberA:numberB;
        System.out.println(max);
    }
}
