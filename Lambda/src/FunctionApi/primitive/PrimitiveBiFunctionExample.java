/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.primitive;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;

/**
 *
 * @author merttan
 */
public class PrimitiveBiFunctionExample {

    public static void main(String... args) {
        examples();
    }

    public static void examples() {

        ToIntBiFunction<String, String> toIntBiFunciton = (s1, s2) -> s1.length() + s2.length();
        System.out.println(toIntBiFunciton.applyAsInt("Suman", "Deniz"));

        ToLongBiFunction<Integer, Integer> toLongBiFunciton = (s1, s2) -> s1 * s2;
        System.out.println(toLongBiFunciton.applyAsLong(123_456_567, 123141213));
        
        
        ToDoubleBiFunction<Double, Double> toDoubleBiFunciton = (s1, s2) -> s1 * s2;
        System.out.println(toDoubleBiFunciton.applyAsDouble(20.34, 31.31));
        

    }

}
