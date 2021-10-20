/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceHW2;

/**
 *
 * @author merttan
 */
public class Test {
    
    public static void main(String[] args) {
        
        CivilEngineer ce= new CivilEngineer(1,1,"Ali","Civil Engineer");
        
        Employee e=ce;
        print(e);
        
        
    }
    
    
    
    public static void print (Employee e){
    
    if(e.department=="Civil Engineer"){
        System.out.println(e.name+ " 's department "+ "Civil Engineer");}
    
    }
    
}
