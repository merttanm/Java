/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car;

/**
 *
 * @author merttan
 */
public class DriverTest {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "530", "Sarı", "Coupe", 123, 320);
        Driver mert = new Driver("Mert", 1, car1);
        Place paris = new Place("Paris", 4500);

        System.out.println(car1.getInfo());

        mert.drive(paris);

    }

}
