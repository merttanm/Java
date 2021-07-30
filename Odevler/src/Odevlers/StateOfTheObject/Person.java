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
public class Person {

    String tckn;
    String firsName;
    String lastName;
    Car vehicle;

    public String getInfo() {
        String getInfo = "Tckn:" + tckn + "   " + "Firs Name:" + firsName + "   " + "Last Name:" + lastName + "   " ;
        if (vehicle != null) {
            getInfo += "Owner Car " + "Marka:" + vehicle.marka + "   " + "Model:" + vehicle.model+ "   " + "Years:" + vehicle.years + "   " + "Speed:" + vehicle.speed + "   " + "Distiance:" + vehicle.distiance + "   " ;
        }
     
            
        
        return getInfo;
    }
}
