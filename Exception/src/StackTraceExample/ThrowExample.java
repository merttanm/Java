/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackTraceExample;

/**
 *
 * @author merttan
 */
public class ThrowExample {

    public static void main(String args[]) throws Throwable {
        try {
            ThrowExample t = new ThrowExample();
            t.throwablenow();
        } catch (Throwable e) {
            System.out.println("Throwable cathing");
         
        }
    }

    public static void throwablenow() throws Throwable {
        Throwable throwable = new Throwable();
        throw throwable;
    }

}
