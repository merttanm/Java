/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

/**
 *
 * @author MERT
 */
public class ElectronicParts extends Vehicle {
  
   protected static String parts;

    public ElectronicParts(String parts,  String hatchbackCar, String coupeCar, String production, String marketing) {
        super( hatchbackCar, coupeCar,  production, marketing);
        this.parts = parts;
        System.out.println("ElectronicParts is craeating");
    }
    
     public static void getInfo() {

        Factory.getInfo();
        Vehicle.getInfo();
        System.out.println("Electronic parts is creating: " + parts);

    }
  
    
}
