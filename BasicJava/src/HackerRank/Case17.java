/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator{

    @Override
    int add(int a, int b) {
        return a+b;
    }


}

public class Case17 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}
