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
public class Odevler {

    static int array[] = {3, 5, 3, 5, 5, 2, 43, 2};
    static int arraytekli[] = new int[10];

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = 0; j <= i; j++) {
                if (arraytekli[j] != array[i] && arraytekli[j + 1] != array[i] && arraytekli[j + 2] != array[i]) {
                    arraytekli[i] = array[i];
                } else {
                    j++;
                    break;
                }

            }

        }

        for (int i = 0; i < arraytekli.length; i++) {
            System.out.print(arraytekli[i] + " ");
        }

    }

}
