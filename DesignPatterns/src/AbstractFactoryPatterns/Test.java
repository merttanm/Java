/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPatterns;

import FactoryPattern.*;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {
        ComponentFactory c = new ComponentFactory();
        Component r = c.createShape(ComponentFactory.ComponentType.TextItem);
        Component t = c.createShape(ComponentFactory.ComponentType.Button);
        System.out.println(r.toString());
         System.out.println(t.toString());
    }
}
