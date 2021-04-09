/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.haftasonucalismasi;

/**
 *
 * @author MERT
 */
public class CarTest {

    public static void main(String[] args) {
        
        Car car = new Car();
        car.kazalimi=false;
        car.marka="bmw";
        car.model="320";
        car.renk="Bordo";
        car.yası=12;
        car.km=100_000_000;
        car.sase="A98S8D8G9G";
        System.out.println(car.yazdir());
        car.kilometreArtisi(56);
        System.out.println(car.yazdir());
        
       
        

    }

}
