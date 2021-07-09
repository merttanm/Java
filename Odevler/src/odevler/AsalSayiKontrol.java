/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevler;

import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class AsalSayiKontrol {

    public static void main(String[] args) {

        int sayi = 100;
        int counter=0;
        
        for (int i = 2; i <= sayi ; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    counter=1;
                }
        }
            if(counter==0){
                System.out.println(i);
            }
            else{
            counter=0;
            }
        }
        
    }

}
