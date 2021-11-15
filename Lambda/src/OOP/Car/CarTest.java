/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car;

/**
 *
 * @author MERT
 */
public class CarTest {

    public static void main(String... args) {

        Car arac1 = new Car("BMW", "530", "Sarı", "Coupe", 123, 320);
        System.out.println(arac1.getInfo());
        arac1.go(88);
        arac1.go(20);
        System.out.println("Km:" + arac1.go(1000));
        System.out.println("Km:" + arac1.sıfırla(0));
        System.out.println();
        Car arac2 = new Car("Mercedes", "amg", "Gri", "Sedan", 200, 350);
        System.out.println(arac2.getInfo());
        arac2.go(88);
        arac2.go(20);
        System.out.println("Km:" + arac2.go(1000));
        System.out.println("Km:" + arac2.sıfırla(0));
        
        
        
        
        
        
        
        
        
    }

}
