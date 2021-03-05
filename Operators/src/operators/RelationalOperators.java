/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.Random;

/**
 *
 * @author MERT
 */
public class RelationalOperators {
    
    
    
    public void operatorCagır(int number1, int number2, char char1, char char2,boolean bool1, boolean bool2 ,String string1, String string2){
 
        System.out.println("number1: "+number1);
        System.out.println("number2: "+number2);
        System.out.println("number1 >  number2: "+ (number1>number2));
        System.out.println("number1 <  number2: "+ (number1<number2));  
        System.out.println("number1 >= number2: "+ (number1>=number2));       
        System.out.println("number1 <= number2: "+ (number1<=number2));      
        System.out.println("number1 == number2: "+ (number1==number2));
        System.out.println("char1   >  char2  : "  + (char1>char2));
        System.out.println("char1   <  char2  : "  + (char1<char2));
        
        if(bool1==bool2){
            System.out.println("bool1 == bool2");}
        else
            System.out.println("bool1 != bool2");
        
        if(string1==string2){
            System.out.println("string1==string2");
        }else
            
         System.out.println("string1!=string2");
        
  
       
    }
    
}
