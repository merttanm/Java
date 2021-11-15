/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car;

/**
 *
 * @author MERT
 */
public class Car {

    private String make;
    private String model;
    private String color;
    private String type;
    private int distance;
    private int speed;
    private int reset;

    public double go(int newKm) {
        distance += newKm;
        double periyot = (double) newKm / speed;
        return periyot;
    }

    public double sıfırla(int newSıfırla) {
        distance = 0;
        return distance;
    }

   public String getInfo() {
        String getInfo = "Model:" + model + "   " + "Marka:" + make + "   "  + "Speed:" + speed + "   " + "Distiance:" + distance + "   "
                + "Renk:" + color + "   "+ "Tipi:" + type + "   ";
        return getInfo;
    }

    @Override
    public String toString() {
        return  "Model:" + model + "   " + "Marka:" + make + "   "  + "Speed:" + speed + "   " + "Distiance:" + distance + "   "
                + "Renk:" + color + "   "+ "Tipi:" + type + "   ";
    }

    public Car(String make, String model, String color, String type, int distance, int speed) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
        this.distance = distance;
        this.speed = speed;
    }
}
