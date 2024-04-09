//Write a program that reads two strings from the keyboard
// and outputs a message about whether these strings are the same.
//        Requirements:
//        The program should read two lines from the keyboard.
//        If the terms are the same, the program should display the message "the terms are the same".
//        If the terms are different, the program should display the message "terms are different".

import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task5
 * @version 09-04-24
 * @author Halyna Poryvaieva
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        if (str1.equals(str2)) {
            System.out.println("the lines are the same");
        } else {
            System.out.println("the lines are different");
        }
    }
}
