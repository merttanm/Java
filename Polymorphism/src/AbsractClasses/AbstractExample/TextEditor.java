/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbsractClasses.AbstractExample;

/**
 *
 * @author merttan
 */
public class TextEditor {

    public static void main(String ... args) {

        MacWindow mc = new MacWindow();
        mc.toBack();
        mc.toFront();
        System.out.println();
        
        Window w = new MacWindow();
        w.toBack();
        w.toFront();
        
        System.out.println();
        x11Window x11 = new x11Window();
        x11.toBack();
        x11.toFront();
       

    }

}
