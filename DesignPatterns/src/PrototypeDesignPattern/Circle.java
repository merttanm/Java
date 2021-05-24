/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern;

/**
 *
 * @author MERT
 */
public class Circle extends ShapePrototype {

    public Circle() {

        System.out.println("I  Circle  created");
    }

    @Override
    public String toString() {
        return "Circle Class...";

    }

    @Override
    public void draw() {
        System.out.println("I m Circle ");

    }

}
