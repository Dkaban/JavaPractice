// THE PROBLEM
// ***************************
// Read in an int, a double and a string and print them out.
// Remember: Reading an int using scan and then a string stays on the int line so it would return a blank.
// Solution Created By: Dustin Kaban
// Date: June 5th, 2020
// ***************************

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
