/*
Enter two integers from the keyboard, which will be the coordinates of the point (the first number read is the "x" coordinate,
// and the second is the "y" coordinate). It is known that the point does not lie on the coordinate axes OX and OY.
//Display the number of the coordinate quarter in which the given point is located.
//
//Clue:
//Belonging of a point with coordinates (x, y) to one of the quarters is determined as follows:
//
//for the first quarter x>0 and y>0;
//for the second quarter x<0 and y>0;
//for the third quarter x<0 and y<0;
//for the fourth quarter x>0 and y<0.
//Example for numbers 4 6:
//1
//Example for numbers -6 -6:
//3
//Requirements:
//• The program must read two numbers from the keyboard.
//• The program must use the System.out.println() or System.out.print() command.
//• If the point is in the first coordinate quarter, print "1".
//• If the point is in the second coordinate quadrant, print "2".
//• If the point is in the third coordinate quadrant, print "3".
//• If the point is in the fourth coordinate quadrant, print "4".
*/

import java.util.Scanner;

/**
 * AIT-TR,Java Basic,Task2
 * @version 21-Mar-24
 * @author Halyna Poryvaieva
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers:");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 & y > 0) {
            System.out.println("1");
        } else if (x < 0 & y > 0) {
            System.out.println("2");
        } else if (x < 0 & y < 0) {
            System.out.println("3");
        } else if (x > 0 & y < 0) {
            System.out.println("4");
        }
    }
}
