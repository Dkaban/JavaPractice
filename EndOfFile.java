// THE PROBLEM
// ***************************
// Read text and output it along with the line number until there is no more input.
// Solution Created By: Dustin Kaban
// Date: June 6th, 2020
// ***************************

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        for(int i=1;scan.hasNext() == true;i++)
        {
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
