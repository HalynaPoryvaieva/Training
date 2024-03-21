//Let's write a program that will read age from the keyboard. If age is from 20 to 60 (inclusive),
// then you don’t need to output anything, otherwise, output the phrase “you don’t have to work.” This can (and should!) be done with
// using only one if statement without else.
//
//Hint: use the logical operator "||" (or).
//
//Requirements:
//• The program must read one number from the keyboard.
//• If the age is less than 20 or more than 60, then you need to display the phrase “you don’t have to work.”
//• If the age is in the range from 20 to 60 (inclusive), then nothing needs to be output.
//• The program must use one if statement without else and the logical operator ||.

import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task1
 * @version 21-Mar-24
 * @author Halyna Poryvaieva
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int age=scanner.nextInt();
        if (age<20||age>60){
            System.out.println("may not work");
        }
    }
}
