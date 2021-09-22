/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnonymousClass;

/**
 *
 * @author merttan
 */
public class DoerClassTest {

    public static void main(String[] args) {
        callDoerClass();

    }

    public static void callDoerClass() {
        DoerClass dc = new DoerClass();
        dc.doIt();
        dc.doThat();

    }

}
