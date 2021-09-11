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
public class Truck extends Suv{
        
    int yükKapasitesi;

    public Truck(int yükKapasitesi, String ekstracBeygir, String marka, String model, String renk, int yas) {
        super(ekstracBeygir, marka, model, renk, yas);
        this.yükKapasitesi = yükKapasitesi;
        System.out.print("Yük Kapastesi:"+ yükKapasitesi+"kg\n");
    }

    
}
