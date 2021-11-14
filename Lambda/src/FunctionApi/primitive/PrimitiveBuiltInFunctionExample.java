/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.primitive;

import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author merttan
 */
public class PrimitiveBuiltInFunctionExample {

    public static void main(String[] args) {
        
        DoubleFunction<Integer > integerConverter= (num)-> (int)num;
        System.out.println(integerConverter.apply(1231.234234));
        
         
        ToDoubleFunction <Integer > doubleConverter= (num)-> (double)num;
        System.out.println(doubleConverter.applyAsDouble(10000));
        
        IntConsumer intCons= i -> System.out.println(i);
        intCons.accept(1231);
        
        
        DoublePredicate dblPr = (d) ->d== Math.PI;
        System.out.println(dblPr.test(Math.PI));
        
        
    }
    
}
