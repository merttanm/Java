/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Case10 {

    static boolean flag;
  
    static Scanner scn = new Scanner(System.in);
    static int B  = scn.nextInt();
     static int H  = scn.nextInt();

    static {

        if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
            try {
                kontrol(B, H);
                /* int area = B * H;
                System.out.println(area);*/
            } catch (Exception ea) {
                int area = B * H;
                System.out.println(area);
                System.out.println(ea.fillInStackTrace() + ": Breadth and height must be positive");
                //  ea.fillInStackTrace();
            }

        }

    }

    public static void kontrol(int sayi1, int sayi2) {
        /*sayi1 = B;
        sayi2 = H;*/
        if (B >= -100 && B <= 0 || H >= -100 && H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = B * H;
            System.out.println(area);
        }

    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.println(area);
        }

    }//end of main

}//end of class

