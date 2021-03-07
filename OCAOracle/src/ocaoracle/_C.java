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

        int asalSayi = 13;
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
/*
        for (int i = 2; i < asalSayi; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(asalSayi + " asal bir sayıdır");
                break;

            }

        }
*/
        while (asalSayi % 2 != 0 && asalSayi % 3 != 0 && asalSayi % 5 != 0 ) {
               System.out.println(asalSayi + " asal bir sayıdır");
               break;
        }
             

     
  


        /*
    if(girilenSayi !=0){
        ata = girilenSayi%10;
        System.out.println("tersi: "+ ata);
        girilenSayi=girilenSayi-ata;
        
        if(girilenSayi !=0){
            ata=ata*10;
            ata=ata + ( girilenSayi%10);
            System.out.println("tersi: "+ata);
             girilenSayi=girilenSayi-ata;
        }
    }
    
    
    
    
    
    String metin="ASDASD";
        for (int i = 0; i < metin.length(); i++) {
           
            
        }
    
        int asalSayi=400;
        
        for (int i = 0; i <asalSayi ; i++) {
          
            
            
            System.out.println("sayilar: "+i);
            
        }
         */
    }

}
