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
public class AnonymousDoerClassTest {

    public static void main(String[] args) {

        AnonymousDoerClassTest t = new AnonymousDoerClassTest();

        t.method(new DoerInterface() {
            @Override
            public void doIt() {
                System.out.println("I have to do it.");
            }

            @Override
            public void doThat() {
                System.out.println("I have to do that.");
            }
        });
        callAnonymousDoerClass2();
        callAnonymousDoerClass1();
    }

    public static void callAnonymousDoerClass1() {
        DoerInterface doerObject = new DoerInterface() {
            @Override
            public void doIt() {
                System.out.println("I will always do it");
            }

            @Override
            public void doThat() {
                System.out.println("I will always do that");
            }
        };

        doerObject.doIt();
        doerObject.doThat();

    }

    public static void callAnonymousDoerClass2() {

        (new DoerInterface() {

            {
                System.out.println("in doerInterface() initializer.");
            }

            @Override
            public void doIt() {
                System.out.println("I am always do it");
            }

            @Override
            public void doThat() {
                System.out.println("I am always do that");

            }
        }).doIt();

    }

    public void method(DoerInterface doerInterface) {

        doerInterface.doIt();
        doerInterface.doThat();

    }

}
