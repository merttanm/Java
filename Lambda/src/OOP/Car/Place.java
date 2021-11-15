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
public class Place {

    private String name;
    private int distance;

    public Place(String name, int distiance) {
        this.name = name;
        this.distance = distiance;
    }

    public String getName() {
        return name;
    }

    public int getDistiance() {
        return distance;
    }
    
    
    
    @Override
    public String toString() {
       String getInfo = "Konum:" + name + "   " + "Alacağı yol:" + distance ;
        return getInfo; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
