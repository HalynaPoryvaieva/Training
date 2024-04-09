//Write a program that reads two real numbers (double) from the keyboard and reports whether these numbers are equal
// to one millionth.
//        Requirements:
//        • The program must read two numbers from the keyboard.
//        • If the numbers are equal, the program should display the message "numbers are equal".
//        • If the numbers are not equal, the program should display the message "numbers are not equal".
//        • The accuracy of the comparison should reach one millionth (0.000001).import java.util.Scanner;

import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task4
 * @version 09-04-24
 * @author Halyna Poryvaieva
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDouble = scanner.nextDouble();
        double secondDouble = scanner.nextDouble();

        if (Math.abs(secondDouble - firstDouble) < 0.000001) {
            System.out.println("the numbers are equal");
        } else {
            System.out.println("the numbers are not equal");
        }
    }
}

