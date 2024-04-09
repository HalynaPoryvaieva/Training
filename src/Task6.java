//In the main method, write the code for the pairwise comparison on the link strings string1,
// string2 and string3 with the output of the corresponding message after each comparison:
//        "references to the same terms" or "references to different terms".
//The order of comparison should be as follows:
//        - string string1 with string string2
//- the line string2 with the line string3
//- the line string1 with the line string3.
//        Requirements:
//        Fields string1, string2 and string3 and their values cannot be changed.
//In the main method, there should be a comparison of string1 and string2 by reference.
//In the main method, there should be a comparison of string2 and string3 by reference.
//In the main method, there should be a comparison of string1 and string3 by reference.

/**
 * AIT-TR,Java Basic,Task6
 * @version 09-04-24
 * @author Halyna Poryvaieva
 */
public class Task6 {

    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "the row references are the same";
        String different = "the row references are different";
        if (string1 == string2 | string2 == string3 | string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}

