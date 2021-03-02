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

        int myInt = 123;
        short myShort = 1234;
        long myLong = 123456789;
        double myDouble = 13.98;
        boolean myBool = true;
        char myChar = 'G';
        float myFloat = 1234.000f;
        float myFloat1 = (float) 1234.0000;
        byte myByte = 123;

        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myBool);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myFloat);
        System.out.println(myFloat1);

        System.out.println("-------------------------");
        //Stirng sınıfları

        String s = "Selam";
        String b = " ";
        String m = "Mert";
        String t = s + b + m;

        System.out.println(s);
        System.out.println(b);
        System.out.println(m);
        System.out.println(t);
        System.out.println("Selam" + " " + "Mert");

        //İlişkisel operatörler
        System.out.println("-------------------------");
        System.out.println(number1 > number2); //false
        System.out.println(number1 >= number2);//false
        System.out.println(number1 < number3);//truw
        System.out.println(number1 <= number3);//truw
        System.out.println(number1 == number4);//false

        //Dönüştürme işlemleri
        double longNumber = 0;
        int shortNumber = (int) longNumber; // Dikkat

        /*
        int shortNumber = 0;
        double longNumber=(double)shortNumber;
         */
        Hello nesne = new Hello();
        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);
        
        /*
        Sabit ifadelerin değerleri run-time zamanında belirlenir!!
        
        Nesne oluşturulunca bellekte nesneye yer ayırmış ve bu
        yerin adresi, nesnenin referansına atanmış demektir.
        */
        
        
        
    }

}
