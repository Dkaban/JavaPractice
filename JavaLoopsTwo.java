// THE PROBLEM
// ***************************
// You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and  
// n values as a single line of n space-separated integers.
// Solution Created By: Dustin Kaban
// Date: June 25th, 2020
// ***************************

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculateAndDisplayValue(a,b,n);
        }
        in.close();
    }

    static void calculateAndDisplayValue(int a, int b, int n)
    {
        int value = a;
        for(int i=0;i<n;i++)
        {
            value += (Math.pow(2,i)*b);
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }
}
