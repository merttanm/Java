/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevlers.StateOfTheObject;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.marka = "BMW";
        bmw.model = "320";
        bmw.distiance = 10_000;
        bmw.speed = 320;
        bmw.years = "10 years";
        
        Person abuzittin = new Person();
        abuzittin.firsName = "Abuzittin";
        abuzittin.tckn = "14531453145";
        abuzittin.lastName = "Sokargeçer";

        System.out.println(abuzittin.getInfo());
        System.out.println(bmw.getInfo());

        bmw.owner = abuzittin;
        abuzittin.vehicle = bmw;

        System.out.println("----------İlişki durumu-----------");
        System.out.println(abuzittin.getInfo());
        System.out.println(bmw.getInfo());

    }

}
