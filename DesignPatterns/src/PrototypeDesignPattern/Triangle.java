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
public class Triangle extends ShapePrototype {


    public Triangle() {
        System.out.println("I triangle is created");
    }
    
    @Override
    void draw() {
        System.out.println("I am a trienagle");
    }  

}
