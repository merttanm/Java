/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.function;

import java.util.function.BiFunction;

/**
 *
 * @author merttan   isGreaterThan
 */
public class BıFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> doubleConsructor = (num1, num2) -> new Double(Integer.toString(num1) + "." + Integer.toString(num2));
        System.out.println(doubleConsructor.apply(12, 1452));
        System.out.println(doubleConsructor.apply(-1, 31));
        
        
        BiFunction <Integer, Integer, String> concat = (num1, num2) -> Integer.toString(num1) + Integer.toString(num2);
        System.out.println(concat.apply(31, 69));
        
        BiFunction <Integer, Integer, Boolean> isGreaterThan = (num1, num2) -> num1>num2;
        System.out.println(isGreaterThan.apply(440, 240));
            
    }

}
