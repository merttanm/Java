/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Random;

/**
 *
 * @author MERT
 */
public class Calculator {

    public static void main(String... args) {
        Random rand = new Random();
        int number1 = rand.nextInt(100);
        int number2 = rand.nextInt(100);
        int addition = addingNumbers(number1, number2);
        int subtraction = subNumbers(number1, number2);
        int multiplication = mulNumbers(number1, number2);
        double division = divNumbers(number1, number2);

        System.out.println("Addition Numbers:    " + addition);
        System.out.println("Subtraction Numbers: " + subtraction);
        System.out.println("Addition Numbers:    " + multiplication);
        System.out.println("Subtraction Numbers: " + division);

    }

    public static int addingNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public static double addingNumbers(double number1, double number2) {
        return number1 + number2;
    }

    public static float addingNumbers(float number1, float number2) {
        return number1 + number2;
    }

    public static int subNumbers(int number1, int number2) {
        return number1 - number2;
    }

    public static int mulNumbers(int number1, int number2) {
        int conclusion = number1 * number2;
        return conclusion;

    }

    public static double divNumbers(int number1, int number2) {
        return (double) number1 / number2;

    }

}
