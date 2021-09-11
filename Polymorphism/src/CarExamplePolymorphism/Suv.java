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
public class Suv extends Car{
    
    String  ekstracBeygir;

    public Suv(String ekstracBeygir, String marka, String model, String renk, int yas) {
        super(marka, model, renk, yas);
        this.ekstracBeygir = ekstracBeygir;
        System.out.print("Araç beygiri:" +ekstracBeygir +"\n");
    }
    
     
    
}
