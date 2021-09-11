/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarExamplePolymorphism;

/**
 *
 * @author merttan
 */
public class Test {

    /*Bu örnekte biraz apileri zorlayacağım*/
    public static void main(String... args) {

        Car car1 = new Car("BMW", "520", "lacivert", 1);
        Suv suvCar = new Suv("1000", "BMW", "X5", "lacivert", 1);
        Truck truckCar = new Truck(30_000, "700", "BMC", "H100", "Beyaz", 12);
        System.out.println("---------------------------------------------------------------\n");
        if (car1 instanceof Suv) {
            System.out.println("car1 instanceof Suv");
            
           
        } else if (truckCar instanceof Suv) {
            System.out.println("truckCar instanceof Suv");       
             if (truckCar instanceof Car) {
                System.out.println("truckCar instanceof Car");
            }
        }

    }

}
