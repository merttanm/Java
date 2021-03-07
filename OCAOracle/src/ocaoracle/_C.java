/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocaoracle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class _C {

    private static int $;                          // Hata vermez

    public static void main(String[] args) {
        String a_b;                                // Hata vermez     
        //    System.out.println($);                     // Hata vermez
        // System.out.println(a_b);                   // Hata verir 

        //Hata vermesinin sebebi a_b nin değer atamaması. Bize değer gir yada null gir diyor
        int girilenSayi = 123;
        ArrayList arr = new ArrayList<>();

        int ata = 0;

        while (girilenSayi > 0) {
            System.out.print(girilenSayi % 10);
            girilenSayi /= 10;
        }

        System.out.println("\n");
        String metin = "FatihSultanMehmet";
        for (int i = 0; i < metin.length(); i++) {
            System.out.print(metin.charAt(i) + "*");
        }
        System.out.println("\n");

        int asalSayi = 14;
        boolean asalmi = true;

        for (int i = 2; i < asalSayi; i++) {
            if (asalSayi % i == 0) {
                asalmi = false;
                System.out.println(asalSayi + " asal bir sayı değildir");
                break;

            } else {
                System.out.println(asalSayi + " asal bir sayıdır");
            }
            break;

        }

        while (asalSayi % 2 != 0 && asalSayi % 3 != 0 && asalSayi % 5 != 0) {
            System.out.println(asalSayi + " asal bir sayıdır");
            break;
        }

        int faktoriyel = 7;
        int sayac = 1;

        for (int i = 1; i <= faktoriyel; i++) {
            sayac *= i;
            System.out.println(i + " Faktoriyel " + sayac);
        }

        int loops = 8;
        for (int i = 1; i <= loops; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        for (int k = loops; k >= 1; k--) {
            for (int l = 1; l < k; l++) {
                System.out.print(k);
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int u = loops; u > 0; u--) {
            for (int y = u; y >= 0; y--) {
                System.out.print(y + " ");

            }
            System.out.println("");

        }
        System.out.println("\n");

        int loops2=20;
        for (int p = 0; p <= loops2; p++) {
            for (int w = 0; w <= p; w++) {
                System.out.print(w+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = 0; i < loops2; i++) {
            for (int j = loops2; j > i; j--) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
          System.out.println("\n");
          
         for (int i = 0; i < loops2; i++) {
             loops2--;
            for (int j = 0; j < loops2; j++) {
                System.out.print(j+" ");
                 
            }
            
            System.out.println("");
        }
        
        
        
    }

}
