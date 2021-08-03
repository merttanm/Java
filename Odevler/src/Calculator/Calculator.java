/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author MERT
 */
public class Calculator {

    public static void main(String[] args) {
        int addition= addingNumbers(12,44);
        int subtraction, multiplication,division;
        System.out.println("addingNumbers"+addition);

    }

    public static int addingNumbers(int number1, int number2) {
        int conclusion = number1 + number2;
        return conclusion;

    }
    public static int subNumbers(int number1, int number2) {
        int conclusion = number1 - number2;
        return conclusion;

    }
    public static int mulNumbers(int number1, int number2) {
        int conclusion = number1 * number2;
        return conclusion;

    }

}
