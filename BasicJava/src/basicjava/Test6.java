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
public class Test6 {

    public static String list(String s) {

   char[] charArray = s.toCharArray();
         for (int i = 6; i > 0; i--) {
            for (int j = i-1 ; j >= 0; j--) {
                if (Character.toLowerCase(charArray[i]) < Character.toLowerCase(charArray[j])) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        
        return String.valueOf(charArray);

    }

    public static void main(String... args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(list(scn.nextLine()));

    }

}
