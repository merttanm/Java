/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses.AbstractHW;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author merttan
 */
public class RegistationStudent {

     public Student getaStudent() {
         
         Student s=null;
         
         return s;
                
    }
    public void registerStudent(Student s) {

    //     String[] log= new String[10];
         
         ArrayList<String> log= new ArrayList<String>();
         int count =0; 
        // for (int i = 0; i <= count; i++) {
             log.add(s.getInfo());
             /*
             log[count]=s.getInfo();
             count++;
             */
        // }
   
         for(String i : log){
             System.out.println(i);
         }
        // System.out.println(log[7]);
        
        /*
        String register = s.getInfo();
        System.out.println(register);*/

    }

}
