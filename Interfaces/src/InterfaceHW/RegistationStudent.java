/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceHW;


import java.lang.reflect.Array;

/**
 *
 * @author merttan
 */
public class RegistationStudent {

     public AbstractStudent getaStudent() {
         
         AbstractStudent s=null;
         
         return s;
                
    }
    public void registerStudent(AbstractStudent s) {

        /*String[] register= new String[10];
         
         for (int i = 0; i < 10; i++) {
             register[i]=s.getInfo();
         }
         
         System.out.println(register[5]);
         */
        
        String register = s.getInfo();
        System.out.println(register);

    }

}
