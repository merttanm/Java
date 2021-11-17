/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.*;
import java.io.*;

/**
 *
 * @author merttan
 */
public class test1 {

    public static int FirstFactorial(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {
            count = i * count;
        }

        return count;
    }

    public static void main(String[] args) {
        // keep this function call here  
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        int fac = s.nextInt();
        if (fac <= 18 && fac >= 1) {
            System.out.println("Output: " + FirstFactorial(fac));
        }

    }

}
