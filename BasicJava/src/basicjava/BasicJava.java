/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.awt.Graphics;

/**
 *
 * @author MERT
 */
public class BasicJava extends java.applet.Applet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Değişken tanımlama
        int number1 = 23;
        int number2 = 44;
        int number3 = number1 + number2;
        int number4 = 23;
        String name = "Mert tan";
        System.out.println("Sayi1: " + number1 + " İsim: " + name);
        System.out.println("Sayi3: " + number3);
        System.out.println("Yeni sayı " + number1++);
        System.out.println("İsim uzunluğu " + name.length());
        // Encapsulation (Sarmalayıcı)  
        Integer sayi2 = new Integer(46);
        System.out.println("Sayi2: " + sayi2);

        System.out.println("-------------------------");
        //İlkel tipler (Primative tips)

        int int_sayi = 33;
        double double_sayi = 22.5;
        float float_sayi = 11.1f;
        boolean bool = false;
        String string = "Numan";

        System.out.println("İnt sayi: " + int_sayi);
        System.out.println("double sayi: " + double_sayi);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + string);

        //İlişkisel operatörler
        System.out.println("-------------------------");
        System.out.println(number1 > number2); //false
        System.out.println(number1 >= number2);//false
        System.out.println(number1 < number3);//truw
        System.out.println(number1 <= number3);//truw
        System.out.println(number1 == number4);//false

    }
}
