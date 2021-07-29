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
public class FindDivisors {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int tuttugum = number;
        int countNumber2 = 0;
        int countNumber3 = 0;
        int countNumber5 = 0;

        if (number % 2 == 0) {
            countNumber2++;
            number = number / 2;
            if (number == 1) {
                System.out.println(tuttugum + " = " + "2^" + countNumber2);
            }
            if (number % 2 == 0) {
                countNumber2++;
                number = number / 2;
                if (number == 1) {
                    System.out.println(tuttugum + " = " + "2^" + countNumber2);
                }
                if (number % 2 == 0 && number != 1) {
                    countNumber2++;
                    System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
                    if (number % 2 == 0 && number != 2) {
                        countNumber2++;
                        System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
                        if (number % 2 == 0 && number != 4) {
                            countNumber2++;
                            System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);

                        } else if (number % 3 == 0) {
                            countNumber3++;
                            number = number / 2;
                            System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
                        }
                    } else if (number % 3 == 0) {
                        countNumber3++;
                        number = number / 2;
                        System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
                    }
                } else if (number % 3 == 0) {
                    countNumber3++;
                    number = number / 2;
                    System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
                } else if (number % 5 == 0) {
                    countNumber5++;
                    number = number / 5;
                    System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3 + " * " + "5^" + countNumber5);
                }

            } else if (number % 3 == 0) {
                countNumber3++;
                number = number / 3;
                System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
            } else if (number % 5 == 0) {
                countNumber5++;
                number = number / 5;
                System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3 + " * " + "5^" + countNumber5);
            }

        } else if (number % 3 == 0) {
            countNumber3++;
            number = number / 3;
            System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3);
        } else if (number % 5 == 0) {
            countNumber5++;
            number = number / 5;
            System.out.println(tuttugum + " = " + "2^" + countNumber2 + " * " + "3^" + countNumber3 + " * " + "5^" + countNumber5);
        }

    }

}
