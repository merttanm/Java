/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting07;

import greeting06.*;
import greeting05.*;

/**
 * dependecy manengment frameworkü haline geliyor
 * @author merttan
 */
public class Application {
    // 22:50 dakika

    public static void main(String[] args) {
        
        ObjectProviderFremework framework=new ObjectProviderFremework();
        Factory factory=GreetingFactory.getInstance();

        GreetingRenderer renderer = factory.getGreetingRenderer();
        GreetingProvider provider = factory.getGreetingProvider();
        renderer.setGreetingProvider(provider);
        renderer.render();
        

        
        
        
    }

}
