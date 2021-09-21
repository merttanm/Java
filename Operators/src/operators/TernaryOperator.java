/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author MERT
 */
public class TernaryOperator {

    public static void main(String args[]) {
        trncagır();
    }

    public static void trncagır() {

        int i = 13;
        int j = 76;
        int min = (i <= j) ? i : j;
        System.out.println("Min: " + min); //13

        int x = 0;
        int y = 5;
        int z = 6;
        int t = x == 2 ? y : z;
        System.out.println("t: " + t); //6

        int tenl1 = 11;
        int tenl2 = 15;
        int tenl3 = 2;

        boolean b = tenl1 < tenl2 ? (tenl1 < tenl3 ? true : false) : true;
        System.out.println("b: " + b);  // false
        //   6+ 36/30 = 7,2 bool true

    }

}
