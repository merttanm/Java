/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author MERT
 */
public class Test {
    public static void main(String[] args) {
        
        Employee e= new Employee.Builder().firstname("Mert").lastname("Tan").build();
        
        System.out.println("İsim: "+ e.firstname+"\n"+ "Soyisim: "+ e.lastname);
        
    }
    
}
