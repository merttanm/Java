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
public class FlowControl {

    static int girilen;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        girilen = scn.nextInt();
        int girileniTut = girilen;
        int sayac = 0;
        int girilenTersi;
        int girilenTersi2;
        System.out.println("Bir sayi giriniz:");

        while (girilen > 0) {
            girilen /= 10;
            sayac++;
        }
        System.out.println("Girdiginiz sayinin basamak sayisi; " + sayac);

        if (sayac == 1) {
            System.out.println("Girdiginiz sayinın Tersi: " + girileniTut);
        } 
        else if (sayac == 2) {
            girilenTersi = girileniTut % 10;
            girilenTersi = girilenTersi * 10 + girileniTut / 10;
            System.out.println("Girdiginiz sayinın Tersi: " + girilenTersi);
        } 
        else if (sayac == 3) {
            girilenTersi = girileniTut % 10;
            girilenTersi2 = girileniTut / 10;
            girilenTersi = (girilenTersi * 100) + ((girilenTersi2 % 10) * 10) + girileniTut / 100;
            System.out.println("Girdiginiz sayinın Tersi: " + girilenTersi);
        }

    }

}
