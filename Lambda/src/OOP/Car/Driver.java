/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car;

/**
 *
 * @author merttan
 */
public class Driver {

    private String name;
    private int id;
    Car car;

    public Driver(String name, int id, Car car) {
        this.name = name;
        this.id = id;
        this.car = car;
    }

    public void drive(Place place) {
        System.out.println(toString());
        System.out.println(place);
        int distiance = place.getDistiance();
        car.go(distiance);
        System.err.println(toString());

    }

    @Override
    public String toString() {
        String getInfo = "Sürücü İsmi:" + name + "   " + "Sürücü id:" + id + "   " + "Aracı:" + car;
        return getInfo; //To change body of generated methods, choose Tools | Templates.
    }

}
