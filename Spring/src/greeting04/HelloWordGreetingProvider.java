/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting04;

import greeting03.*;

/**
 *
 * @author merttan
 */
public class HelloWordGreetingProvider implements GreetingProvider{

    @Override
    public String getGreeting() {
        return "HELLO WORD";
    }
    
   
    
}
