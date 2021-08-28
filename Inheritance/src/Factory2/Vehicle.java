/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

/**
 *
 * @author MERT
 */
public class Vehicle extends Factory {

    protected static String hatchbackCar;
    protected static String coupeCar;

    public Vehicle(String production, String marketing, String hatchbackCar, String coupeCar ) {
        super(production, marketing);

        this.hatchbackCar = hatchbackCar;
        this.coupeCar = coupeCar;

        System.out.println("Vehicle is creating...");
    }
    public static void getInfo() {

        Factory.getInfo();
        System.out.println("Hatchback vehicle is creating: " + hatchbackCar);
        System.out.println("Coupe vehicle is creating: " + coupeCar);

    }

}
