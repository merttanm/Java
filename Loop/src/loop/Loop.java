/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static final void main(String[] myData) {
        // TODO code application logic here
        System.out.println("--------------- While ---------------");
        double number1 = Math.random();
        System.out.println("number1: " + number1);

        while (number1 < 0.9) {
            number1 = Math.random();
        
            System.out.println("in while: " + number1);
        }
        System.out.println("After while");

        System.out.println("--------------- Do - While ---------------");

        double dw;
        do {
            dw = Math.random();
            System.out.println("dw: " + dw);
        } while (dw < 0.2);
        {
            System.out.println("dw < 0.2 ,End looop");
        }

        System.out.println("---------------If - Else---------------");
        int number2 = (int) (5 * Math.random());
        int number3 = (int) (5 * Math.random());

        if (number2 > number3) {
            System.out.println("number2 > number3");
        } else {
            System.out.println("number2 < number3");

        }
        System.out.println("--------------- For ---------------");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        System.out.println("\n\n\n");

        int col = 5;
        int row = 5;
        for (int i = 0; i < row; i++) {
            if (i == 1) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("*   *");
                }
                System.out.println("*****");
                break;
            }
            for (int j = 0; j < 5; j++) {

                System.out.print("*");

                if (j == col - 1) {
                    System.out.println("");
                }

            }

        }

        System.out.println("\n\n\n");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }

        }

        System.out.println("\n\n\n");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("-");
            }
            System.out.println("");

        }

        for (int k = 5; k >= 0; k--) {

            for (int l = 0; l < k; l++) {

                System.out.print("-");

            }
            System.out.println("");
        }

        int month = 3;

        switch (month) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağostos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Error! Please enter the month number between 1 and 12");
                break;

        }

        int[][] arrayOfInts = {{21, 23, 5, 123}, {12, 24, 500, 12}, {12, 98, 54, 786}};

        int searchfor = 12;

        int k = 0;
        int l = 0;
        boolean fould = false;

        here:
        for (; k < arrayOfInts.length; k++) {
            for (l = 0; l < arrayOfInts[k].length; l++) {
                if (arrayOfInts[k][l] == searchfor) {
                    fould = true;
                    System.out.println("Found" + searchfor + "at" + k + "," + l);
                    //break here; // Kırarsam aramaya devam etmiyor ama döngünün devamında yine 12 var
                    continue here;
                }

            }
        }
        if (!fould) {
            System.out.println(searchfor + " not here");
        }

        
        /*
        while(false){
            System.out.println("selam");
        int r=5;
        }
         */
    }

}
