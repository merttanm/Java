/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class test5 {

    /*public static String ArrayChallenge(String[] strArr) {
        // code goes here  
        return strArr[0];
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        String [] se= s.nextLine();
        System.out.print(ArrayChallenge(s.nextLine()));
    }*/
    public static int getLargest(int[] a) {
        int temp;
        int count;
        int enBuyukSayi;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        enBuyukSayi = a[a.length - 1];
        System.out.println(a[0]);
        System.out.println(a[1]);
        for (int i = 0; i < 2; i++) {
            count=a[i] + a[i+1];
            if(count==enBuyukSayi){
                System.out.println(true);
            }
        }
        return enBuyukSayi;
    }

    public static void main(String args[]) {
        int a[] = {4, 19, 23, 10, 1, 3, 22};

        System.out.println("Largest: " + getLargest(a));

    }

}
