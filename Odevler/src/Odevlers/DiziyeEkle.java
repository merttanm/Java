/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevlers;

import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class DiziyeEkle {
      public static void main(String[] args) {
        Odevler soe = new Odevler();
        System.out.println("Lütfen bir sayı giriniz");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int array[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            array[i]= scn.nextInt();
            System.out.println(i+" "+array[i]);
        }
        System.out.println("\n");
        
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            
            
        }
    }
    
}