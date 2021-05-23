/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *
 * @author MERT
 */
public class Example5 {

    static class Bird {
    }

    static class FlyBird extends Bird {

        void fly() {
        }
    }

    static class Duck extends FlyBird {
    }

    static class NonFlyBird extends Bird {

        void fly() {
        }
    }

    static class Penguin extends Bird {
    }

    public static void main(String[] args) {

        Duck d = new Duck();
        d.fly();
        Penguin p = new Penguin();
        //  p.fly();   Problem

    }

}
