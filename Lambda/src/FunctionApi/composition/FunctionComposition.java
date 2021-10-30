/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.composition;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author merttan
 */
public class FunctionComposition {

    public static void compose1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz...");
        int i = scn.nextInt();
        
        Function<Integer, Integer> twice= k -> k*2;
        Function<Integer, Integer> square= k -> k*k;
        
        int twiceNumber= twice.apply(i);
        int squareNumber=square.apply(i);
        System.out.println(squareNumber);
        System.out.println(twiceNumber);
        
    }
    
    
    public static void compose2(){
        
        Function <Double, Double> sinAsin=((Function<Double, Double>) Math::sin);
    
    
    }

    public static void main(String... args) {

        
        compose1();
    }

}
