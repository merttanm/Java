/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting08;

import greeting07.*;
import greeting06.*;
import greeting05.*;

/**
 *
 * @author merttan
 */
public class HelloWordGreetingProvider implements GreetingProvider{


    public String getGreeting() {
        return "Hello Word ";
    }
    
}
