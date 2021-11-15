/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eval;

import java.util.function.IntConsumer;

/**
 *
 * @author merttan
 */
public class RepeatDemo {

    public static void main(String... args) {
        repeat(10, () -> System.out.println("Selam App"));
        repeat(10, i -> System.out.println("Count Down" + (9 - i)));
        repeatMessage("Selam App", 10);
    }

    public static void repeat(int n, Runnable action) {

        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void repeat(int n, IntConsumer action) {

        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void repeatMessage(String textMessage, int count) {

        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(textMessage);
            }

        };
        new Thread(r).start();

    }

}
