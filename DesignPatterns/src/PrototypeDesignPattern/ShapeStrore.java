/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author MERT
 */
public class ShapeStrore {
   public static Map<String,ShapePrototype> shapes=new HashMap<String,ShapePrototype>();
    static{
        shapes.put("Circle", new Circle());
        shapes.put("Triangle", new Triangle());
    }
 
    static ShapePrototype createClone(String shapeType){
        return (ShapePrototype)shapes.get(shapeType).clone();
    }

}
