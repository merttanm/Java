/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting04;

/**
 *
 * @author merttan
 */
public class SelamGreetingProvider implements GreetingProvider {

    @Override
    public String getGreeting() {
        return "Selam";
    }
}
