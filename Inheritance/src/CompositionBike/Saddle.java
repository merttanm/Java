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
public class Saddle {
    
   private String Type;

    public Saddle(String Type) {
        this.Type = Type;
        System.out.println("Sele tipi oluşturuluyor .... ");
        System.out.println( "Sele tipi: "+ Type);
    }
    
}
