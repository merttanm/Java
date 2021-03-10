/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.lang.annotation.ElementType;
import java.util.Random;

/**
 *
 * @author MERT
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    ElementType[] arrayName = new ElementType[2];

    static int intArray[] = new int[34];
    static double dArray[] = new double[31];
    static Pizza pizza[] = new Pizza[10];

    public static void main(String[] args) {
        // TODO code application logic here

        
        doldur();
        print();
        /*for (int i = 0; i < dArray.length; i++) {

            int dArray4 = random.nextInt();
            int sayi = dArray4 % 10;
            dArray[i] = sayi;
            System.out.println(dArray[i]);

        }
         */
    

    }

    public static void doldur() {
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {

            int randomInt = random.nextInt();
            int sayi = randomInt % 10;
            intArray[i] = sayi;
        }
        pizza[0] = new Pizza("peynirli");
        pizza[1] = new Pizza("Karışık");
        pizza[2] = new Pizza("Suculu");
        pizza[3] = new Pizza("Kaşarlı");
        pizza[4] = new Pizza("Domatesli");

    }

    public static void print() {

        for (int i = 0; i < 10; i++) {
            System.out.println(intArray[i] + " ");

        }
        
        System.out.println();
        System.out.println("Pizzas: "+ pizza[0].name + pizza[1].name + pizza[2].name +pizza[3].name);
        
        
        
        
        
    }

}

class Pizza {

    String name;

    Pizza(String name) {
        this.name = name;

    }

}
