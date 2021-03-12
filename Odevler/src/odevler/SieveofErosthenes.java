/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevler;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class SieveofErosthenes {

    public static void main(String[] args) {

        SieveofErosthenes soe = new SieveofErosthenes();
        System.out.println("Lütfen bir sayı giriniz");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        soe.count(n);
    }

    void count(int n) {
        Boolean[] list = new Boolean[n + 1];
        Arrays.fill(list, true);

        for (int i = 2; i <= n; i++) {
            if (list[i] == true) 
                for (int j = 2; i * j <= n; j++) {
                    list[i * j] = false;

                }
                
            
           

        }
        
         int num = 0;
                for (boolean b : list) {
                    if (b) 
                        num++;
                    
                }System.out.println(n + "  sayısına kadar " + num + " tane asal vardır");

    }

}
