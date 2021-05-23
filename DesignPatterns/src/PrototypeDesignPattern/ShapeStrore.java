/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern;

import java.util.Hashtable;

/**
 *
 * @author MERT
 */
public class ShapeStrore {

    static Hashtable<String, ShapePrototype> shape = new Hashtable<String, ShapePrototype>();

    static {

        shape.put("Circle Lan", new Circle());
        shape.put("Triangle Lan", new Triangle());

    }

    static ShapePrototype createClone(String shapeType) {
        return (ShapePrototype)shape.get(shapeType).clone();

    }

}
