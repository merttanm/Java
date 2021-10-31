/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.composition;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author merttan
 */
public class PredicateComposition {
    
    public static void main(String[] args) {
        Predicate<Integer> isEven= i -> i%2 ==0;
        System.out.println("is 10 Even:                       " + isEven.test(10));
        
        Predicate<Integer> isNotEven= Predicate.not(isEven);
        System.out.println("is 10 Not Even:                   " + isNotEven.test(10));
        
        Predicate<Integer> isPositive = t -> t>0;
        System.out.println("is -123  Positive:                " + isPositive.test(-123));
        
        Predicate<Integer> isBothEvenAndPositive= isEven.and(isPositive);
        System.out.println("is -123 Both Even And Positive:   " +isBothEvenAndPositive.test(-128));
        
        Predicate<Integer> isEventOrPositive=  isNotEven.or(isPositive);
        System.out.println("is 124 Event Or Positive:         "+ isEventOrPositive.test(124));
        
        BiPredicate<String,Integer> longerThanPredicate= (s,i)-> s.length() > i;
        System.out.println("longer Than Predicate:            " + longerThanPredicate.test("Selamkızlarnasılsınız", 6));
        
        
        BiPredicate<String,Integer> longerThanPredicateNegate= longerThanPredicate.negate();
        System.out.println("longer Than Predicate Negate:     " + longerThanPredicateNegate.test("tr", 6));
        
        
        BiPredicate<String,Integer> sorterThanPredicate= (s,i)-> s.length() < i;
        System.out.println("sorter Than Predicate:            " + sorterThanPredicate.test("Selamkızlarnasılsınız", 6));
        
        
        BiPredicate<String,Integer> longerAndSorterThanPredicate= longerThanPredicate.and(sorterThanPredicate);
        System.out.println("longer And Sorter Than Predicate: " + longerAndSorterThanPredicate.test("Selamkızlarnasılsınız", 4));
        
       BiPredicate<String,Integer> longerOrSorterThanPredicate= longerThanPredicate.or(sorterThanPredicate);
        System.out.println("longer Or Sorter Than Predicate:  " + longerOrSorterThanPredicate.test("Selamkızlarnasılsınız", 4));
        
    }
    
}
