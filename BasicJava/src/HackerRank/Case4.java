/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class Case4 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kelime1 = null;
        String[] kelime2 = null;
        String[] kelime3 = null;
        for (int i = 0; i < 3; i++) {
            //    sc.nextLine();
            String s1 = sc.nextLine();
            kelime1 = s1.split(" ");

            String s2 = sc.nextLine();
            kelime2 = s2.split(" ");

            String s3 = sc.nextLine();
            kelime3 = s3.split(" ");

            System.out.println("===============================");
            for (int j = 0; j < kelime1.length; j++) {
                System.out.print(kelime1[j] + "               ");
            }
            System.out.println();
            for (int j = 0; j < kelime2.length; j++) {
                System.out.print(kelime2[j] + "               ");
            }
            System.out.println();
            for (int j = 0; j < kelime3.length; j++) {
                System.out.print(kelime3[j] + "               ");
            }
            System.out.println();
            System.out.println("===============================");
        }

    }
}
