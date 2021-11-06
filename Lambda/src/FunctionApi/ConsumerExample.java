/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *
 * @author merttan
 */
public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> loverCaseConverter = s -> System.out.println(s.toLowerCase());
        loverCaseConverter.accept("AAAaaaaBBBBcccccTTTTT12314");

        Consumer<String> loverUpperConverter = s -> System.out.println(s.toUpperCase());
        loverUpperConverter.accept("AAAaaaaBBBBcccccTTTTT12314");

        BiConsumer<String, String> concat = (s1, s2) -> System.out.println(s1 + s2);;
        concat.accept("Names", "Statüss");

    }
}
