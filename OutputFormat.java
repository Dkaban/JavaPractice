  
// THE PROBLEM
// ***************************
// Format output so that it has 15 spaces between the integer and the string and if the string is < 10 we add 2 0's
// If int 10 < x < 100 we add 1 0.
// Solution Created By: Dustin Kaban
// Date: June 9th, 2020
// ***************************

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}
