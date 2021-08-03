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
        String getInfo = "Tckn:" + tckn + "   " + "Firs Name:" + firsName + "   " + "Last Name:" + lastName + "   ";
        if (vehicle != null) {
            getInfo += " and has a car: " + vehicle.getInfo();
        } else {
            getInfo += " and has no car.";
        }

        return getInfo;
    }
}
