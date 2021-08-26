/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositionCar;

/**
 *
 * @author MERT
 */
public class Wheel {

    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void rotate() {
        System.out.println("Whell is Rotate....");
    }

}
