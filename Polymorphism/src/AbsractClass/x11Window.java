/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbsractClass;

/**
 *
 * @author merttan
 */
public class x11Window extends Window {

    @Override
    public void toFront() {
        System.out.println("x11window front");
    }

    @Override
    public void toBack() {
        System.out.println("x11window back");
    }

}
