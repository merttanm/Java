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
public class test3 {

    public static String StringChallenge(String str) {
        // code goes here 
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.print("Output: ");
        return String.valueOf(charArray);
    }

 

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print("Inpurt: ");
        System.out.print(StringChallenge(s.nextLine()));
    }

}
