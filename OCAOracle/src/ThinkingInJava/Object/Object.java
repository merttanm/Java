/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkingInJava.Object;

import java.util.Date;



/**
 *
 * @author MERT
 */
public class Object {

    public static void main(String[] args) {
        // Character ch = new Character(c);
        Character ch1 = new Character('a');
        Character ch2 = 'a';
        char c = ch2;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(c);

        String a = new String("Selam");
        OnlyData data =new OnlyData();
        //data.; = 47;
        data.d=2.3;
        data.b=false;
        
        
        System.out.println(new Date());
        
        
    
  
    }
    
    boolean flag()
    {
    return true;
    }
    
    
    double naturelLogBase()
    {
    return 23.1;
    }
    
    void nothing()
    {
    return;
    }
    
    
    void nothing2()
    {
    
    }
    
    
    

}

class ATypeName {

    ATypeName a = new ATypeName();
   

}

class OnlyData{

int i;
double d;
boolean b;

}
