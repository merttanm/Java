/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.primitive;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 *
 * @author merttan
 */
public class PrimitiveFunctionExample {
    
    public static void main(String[] args) {
        examples1();
        examples2();
    }
    
    public static void examples1() {
        IntFunction<Double> intFunction = i -> Math.sqrt(i);
        System.out.println(intFunction.apply(10));
        
        LongFunction<Double> longFunction = l -> 1d / l;
        System.out.println(longFunction.apply(10));
        
        DoubleFunction<String> doubleFunction = d -> String.valueOf(d);
        System.out.println(doubleFunction.apply(10.23423));
        
    }
    
    public static void examples2() {
        
        IntToLongFunction intToLongFunction = i -> (long) i;
        System.out.println(intToLongFunction.applyAsLong(Integer.MAX_VALUE) + 1);
        
        IntToDoubleFunction intToDoubleFunction = i -> (double) i;
        System.out.println(intToDoubleFunction.applyAsDouble(5));
        
        LongToIntFunction longToIntFunction = i -> (int) i;
        System.out.println(longToIntFunction.applyAsInt(9_999_999_909L));
        
    }
}
