/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevlers;

import java.util.Scanner;
import java.lang.Object;
import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class Arrays {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //int dizi[] = new int[34];
        ArrayList<Integer> dizi = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int girilen = scn.nextInt();
            dizi.add(girilen);
        }

        for (int i = 0; i < dizi.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (dizi.get(i) == dizi.get(j)) {
                    dizi.remove(i);
                }

            }
        }
        System.out.print(dizi);

    }
}
