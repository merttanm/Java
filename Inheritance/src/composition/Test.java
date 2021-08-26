/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car("Mercedes", "CLA", "2000' model", 320, 100_000_000, 4);

        System.out.println(car);
        car.start();
        System.out.println(car.getInfo());
    }

}
