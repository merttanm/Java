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
public class AsalSayiKontrol {

    public static void main(String[] args) {

        System.out.println("Lütfen pozitif bir sayı giriniz...");
        Scanner scn = new Scanner(System.in);
        int sayi = scn.nextInt();
        int counter = 0;

        for (int i = 2; i <= sayi; i++) {
            for (int j = 2; j < i; j++) {
                /* if' in içine hiç düşüp düşmediğine bakıyoruz,
                zaten bir kere girdiyse forlardan çıkana kadar counter=1 oluyor
                 */
                if (i % j == 0) {
                    counter = 1;
                }
            }
            if (counter == 0) {
                System.out.println(+i + " Sayısı asaldır");
            } else if (counter == 1) {

                System.out.println(+i + " Sayısı asal değildir");
            }
            counter = 0;
        }

    }

}
