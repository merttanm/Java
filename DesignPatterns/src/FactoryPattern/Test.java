/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory f = new ShapeFactory();
        Shape r = f.createShape(ShapeFactory.ShapeType.RECTANGLE);
        System.out.println(r.toString());
    }
}
