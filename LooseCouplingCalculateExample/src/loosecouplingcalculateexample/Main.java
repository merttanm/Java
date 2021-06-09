/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loosecouplingcalculateexample;

import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        calculateOperations Sınıfı ile Cube ve Square sınıfı arasına Shape interface' i koyuyorum
        ve daha dinamik hale geliyor.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birim uzunlugu giriniz..");
        int i = Integer.parseInt(scanner.nextLine());
        calculateOperations cO = new calculateOperations(new Cube());
        cO.calculate(i);
    }

}
