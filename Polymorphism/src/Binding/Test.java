/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binding;

/**
 *ß
 * @author merttan
 */
public class Test {
    
    public static void main(String[] args) {
    
        Parent parent= new Parent();
        parent.make();
        parent.doThat();
        
        Child1 child1= new Child1();
        child1.make();
        child1.doIt();
        
        
    }
    
}
