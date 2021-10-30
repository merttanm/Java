/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.composition;

import java.util.function.Predicate;

/**
 *
 * @author merttan
 */
public class PredicateComposition {
    
    public static void main(String[] args) {
        Predicate<Integer> isEven= i -> i%2 ==0;
        System.out.println("is Even: " + isEven.test(10));
        
        Predicate<Integer> isNotEven= Predicate.not(isEven);
        System.out.println("is Not Even: " + isNotEven.test(10));
        
    }
    
}
