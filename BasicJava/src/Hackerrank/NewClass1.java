/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class NewClass1 {

    /*
Explanation

Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24
 and  n>20 is even, so it isn't weird. Thus, we print Not Weird.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
