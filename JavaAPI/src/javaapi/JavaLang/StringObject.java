/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapi.JavaLang;

import static java.lang.Math.sqrt;
import java.math.BigInteger;

/**
 *
 * @author merttan
 */
public class StringObject {
    
    public static void main(String[] args) {
        
        String kelime1= new String("Merhaba");
        String kelime2= new String("Merhaba"); 
        String kelime3="Merhaba";
        int sati1;
        
        if(kelime1==kelime2){ // doğru bir yaklaşım değil çünkü ilkel tipte bir object değildir
            System.out.println("kelime1==kelime2");
        }
        else if(kelime1.equals(kelime2)){ // true
          System.out.println("kelime1==kelime2") ;
          
        }
        System.out.println(kelime1.contentEquals(kelime3));

        
        
        
        
    }
    
}
