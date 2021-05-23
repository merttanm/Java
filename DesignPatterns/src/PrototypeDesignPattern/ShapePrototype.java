/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MERT
 */
public abstract class ShapePrototype implements Cloneable {

    int x, y;

    abstract void draw();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ShapePrototype.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }

}
