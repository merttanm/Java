/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkingInJava.Object;

/**
 *
 * @author MERT
 */
public class Precedence {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int a = x + y - 2 / 2 + z;//5
        int b = x + (y - 2) / (2 + z);//1
        System.out.println("a:" + a + " " + "b:" + b);

    }

}
