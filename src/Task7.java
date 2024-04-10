
//Amigo created a secret word for access to closed information, but his keyboard broke, and now it is impossible
// to type letters in upper case. Write a program that will compare the entered string with the string from the
// secret variable, regardless of case.
//If the entered string is equal to the string from the secret variable, the program displays the message
// "access is allowed". Otherwise - "access denied".
//Requirements:
//The program should read the time c of the keyboard.
//The Solution class must have a public static secret variable of String type.
//If the entered line and the line from the secret variable are the same, regardless of case, the program should
// display the message "access is allowed".

import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task7
 * @version 10-04-24
 * @author Halyna Poryvaieva
 */
public class Task7 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.equalsIgnoreCase(secret)) {
            System.out.println("access is allowed");
        } else {
            System.out.println("Access is denied");
        }
    }
}
