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
public class DoerClass implements DoerInterface {

    @Override
    public void doIt() {
        System.out.println("I always do it");
    }

    @Override
    public void doThat() {
        System.out.println("I always do that");

    }

}
