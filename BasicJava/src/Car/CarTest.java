/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author MERT
 */
public class CarTest {

     public static void main(String[] args) {
    
        Car arac= new Car();
        arac.marka="BMW";
        arac.model="530";
        arac.renk="Sarı";
        arac.tipi="Coupe";
         System.out.println("Marka:"+arac.marka);
          System.out.println("Model:"+arac.model);
          System.out.println("Renk:"+arac.renk);
          System.out.println("Tipi:"+arac.tipi);
        
    }

}
