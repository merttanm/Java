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
public class Car {

    String marka;
    String model;
    String renk;
    int yas;

    public Car(String marka, String model, String renk, int yas) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yas = yas;
       print();
    }

    public void print() {
        System.out.println("ARAÇ BİLGİLERİ\n"+"Marka:" + marka +"  Model:" + model+ " Renk:" + renk + " Yas:" + yas);
    }
    
 

}
