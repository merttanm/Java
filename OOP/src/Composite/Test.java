/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person();
        person.firstName = "Numan";
        person.lastName = "Duman eder";
        person.tckn = "1234567810012";

        Car car = new Car();
        car.make = "asdasd";
        car.model = "320";
        car.distance = 13;
        car.speed = 230;
        car.year = "1995";
        car.owner = person;
        
        

        System.out.println(car.print());
        System.out.println(person.kisiBilgisi());

    }

}
