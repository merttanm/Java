/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Test7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        String[] parts = str.split(" ");
        for (int i = parts.length - 1; i >= 0; i--) {

            char[] charArray = parts[i].toCharArray();
            for (int t = 0; t < charArray.length; t++) {
                for (int j = t + 1; j < charArray.length; j++) {
                    if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[t])) {
                        char temp = charArray[t];
                        charArray[t] = charArray[j];
                        charArray[j] = temp;
                    }
                }
            }
            System.out.print(String.valueOf(charArray) + " ");
        }

    }

}
