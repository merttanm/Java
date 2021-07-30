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
public class Car {

    String model;
    String marka;
    String years;
    int speed;
    int distiance;

    public double go(int newInstiance) {

        distiance += newInstiance;
        double periyot = newInstiance / speed;
        return periyot;
    }

    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        String getInfo = "Model:" + model + "   " + "Marka:" + marka + "   " + "Years:" + years + "   " + "Speed:" + speed + "   " + "Distiance:" + distiance + "   ";
        return getInfo;
    }
}
