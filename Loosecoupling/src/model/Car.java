/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author MERT
 */
public class Car implements Comparable<Car> {

    static String model;
    static int chassis;

    public Car( int chassis, String model) {
        this.model = model;
        this.chassis = chassis;
    }

    public String getModel() {
        return model;
    }

    public int getChassis() {
        return chassis;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setChassis(int chassis) {
        this.chassis = chassis;
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.getChassis() - anotherCar.getChassis();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return chassis == car.chassis;

    }

    @Override
    public int hashCode() {
        return Objects.hash(chassis);
    }

    @Override
    public String toString() {
        return "Car{"
                + "chassis=" + chassis
                + ", model='" + model + '\''
                + '}';
    }

}
