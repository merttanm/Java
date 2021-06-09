/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonExample;

/**
 *
 * @author MERT
 */
public class Singleton {
    
    public static Singleton instiance;

    public Singleton (){}
    
    public static Singleton getInstiance(){
    
    if(instiance==null){
        instiance = new Singleton();
        System.out.println("Creating new İnstiance...");
    }
    return instiance;
    }
    
    public void showMessage(){
        System.out.println("Creat Singleton Object...");
    }
    
}
