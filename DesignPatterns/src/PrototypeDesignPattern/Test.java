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
      Circle c=(Circle)ShapeStrore.createClone("Circle");
        c.draw();
        Triangle t=(Triangle)ShapeStrore.createClone("Triangle");
        t.draw();
        System.out.println(t);
        Triangle t1=(Triangle)ShapeStrore.createClone("Triangle");
         
        t1.draw();
        System.out.println(t1);
        Triangle t2=(Triangle)ShapeStrore.createClone("Triangle");
        t2.draw();
        System.out.println(t2);
    }

}
