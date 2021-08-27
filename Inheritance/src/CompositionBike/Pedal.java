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
public class Pedal {
    
    private String price;
    private String color;

    public Pedal(String price, String color) {
        this.price = price;
        this.color = color;
        System.out.println("Pedalın markası ve rengi oluşturuluyor .... ");
        System.out.println("Markası: " + price+ " "+ "Renk: "+ color);
    }
    
}
