/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class MainTest {

    public static void main(String[] args) {

    }
// Super class
    class Car {
// Composition
        ArrayList<Tire> tire;
        Engine motor;
    }
    
// Sub class
    class Tire {
    }

    class Engine {
    }

}
