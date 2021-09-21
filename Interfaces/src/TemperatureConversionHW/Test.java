/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConversionHW;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("1) Celcius");
        System.out.println("2) Fahrenheit");
        System.out.println("3) Kelvin");
        System.out.println("Hoşgeldiniz, lütfen derecelendirme birimi ismi giriniz ... ");
        Scanner scnr = new Scanner(System.in);
        String derecelendirme = scnr.next();
        System.out.println("Lütfen derece giriniz ... ");
        double derece= scnr.nextInt();
        ConversionC conversion = new ConversionC();
        conversion.doSelected(derecelendirme, derece);

    }

}
