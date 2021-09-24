/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author merttan
 */
public class ArithmaticExceptionExample {

    public static void main(String[] args) {

        try {
            bolmeIslemi(20, 0);
        }
        catch(ArithmeticException ea)
        {
            System.out.println("ArithmeticException hatası: " +ea.getMessage());
        }
         catch(NullPointerException en)
        {
            System.out.println("NullPointerException hatası:" +en.getMessage());
        }
    }

    public static void bolmeIslemi(int sayi1, int sayi2) {
        if(sayi2==0 ){
           throw new  ArithmeticException(" Sıfıra bölemezsin...");
        }
        System.out.println(sayi1 / sayi2);

    }

}
