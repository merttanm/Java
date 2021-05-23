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
public class Test {

    public static void main(String[] args) {
        Circle c = (Circle) ShapeStrore.createClone("Circle la");
        c.draw();
        Triangle t = (Triangle) ShapeStrore.createClone("Triangle la");
        t.draw();

    }

}
