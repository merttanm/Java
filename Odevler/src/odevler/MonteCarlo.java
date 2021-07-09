/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevler;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class MonteCarlo {

    public static void main(String[] args) {

        System.out.println("Nokta Sayısı Giriniz...");
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        double numberOfCircle = 0.0;

        for (int i = 0; i < n; i++) {

            double x = Math.random();
            double y = Math.random();
            double distiance = x * x * y * y;
            //  System.out.println("distiance"+distiance);
            if (distiance <= 1) {
                numberOfCircle++;
            }
        }
        double myPı = 4.0 * numberOfCircle / n;
        System.out.println("My Pİ: " + myPı);
        System.out.println("Javas Pİ:" + Math.PI);

    }

}
