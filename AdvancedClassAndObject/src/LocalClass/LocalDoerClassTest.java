/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocalClass;

import AnonymousClass.DoerInterface;

/**
 *
 * @author merttan
 */
public class LocalDoerClassTest {
    // Methodun içinde class oluştururabiliyorum ayrıca ona interface implement edibiliyorum.

    private static int i = 2;
    private static int k = 5;

    public static void main(String[] args) {

        class LocalDearClass implements DoerInterface {

            int i = 5;

            @Override
            public void doIt() {
                System.out.println("k: " + k);
                System.out.println("I always do it");
            }

            @Override
            public void doThat() {
                System.out.println("k: " + k);
                System.out.println("I always do that");

            }
        }
        LocalDearClass test2 = new LocalDearClass();
        test2.doIt();
        test2.doThat();

        LocalDoerClassTest test = new LocalDoerClassTest();
        test.method();

    }

    // bu metod static olmadığı için ve yukarda i yi static yapmadığım için çok rahat metodun içinde kullanabiliyoruz
    public void method() {

        class LocalDoerClass implements DoerInterface {

            @Override
            public void doIt() {

                System.out.println("i: " + i);
                System.out.println("I always do it");
            }

            @Override
            public void doThat() {
                System.out.println("i: " + i);
                System.out.println("I always do that");

            }
        }

        LocalDoerClass obj1 = new LocalDoerClass();
        obj1.doIt();
        obj1.doThat();

    }

}
