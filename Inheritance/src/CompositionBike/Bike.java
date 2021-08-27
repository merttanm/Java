/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositionBike;

/**
 *
 * @author MERT
 */
public class Bike {

    private String make;
    private String color;
    private int jant;

    private Wheel[] wheel = new Wheel[10];
    private Pedal pedal;
    private Saddle sele;


    public Bike(String make, String color, int jant) {
        this.make = make;
        this.color = color;
        this.jant = jant;

        pedal = new Pedal("1000 tl ", "blue ");
        sele = new Saddle("Spor sele");
        System.out.println("Marka: " + make + " " + "Renk: " + color + " " + "Jant: " + jant );

    }
    
    public String getInfo() {
        return   "Marka: " + make  + "Renk: " + color +" Jant";
    }

}
