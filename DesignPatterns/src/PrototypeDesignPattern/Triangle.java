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

    
    public Triangle(){
    
        System.out.println("I  Triangle  created");
    }
    
    @Override
    public String toString() {
        return "Triangle Class...";

    }
    /*
  @Override
    void draw() {
        System.out.println("I m Circle ");
        
    }*/

    @Override
    void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
