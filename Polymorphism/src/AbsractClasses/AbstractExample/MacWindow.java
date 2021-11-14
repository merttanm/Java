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
public class MacWindow extends Window {

    @Override
    public void toFront() {
        System.out.println("Mac window front");
    }

    @Override
    public void toBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
