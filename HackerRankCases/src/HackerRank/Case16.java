/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Case16 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int ii = scan.nextInt();
        double dd = scan.nextDouble();
        scan.nextLine();
        String textInput = scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println((int) (ii + i));
        /* Print the sum of both integer variables on a new line. */
        System.out.println((double)(d + dd));
        /* Print the sum of the double variables on a new line. */
        System.out.println(s + textInput);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
