/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author MERT
 */
public class Engine {
    
    private int cc;
    private int horsePower;

    public Engine(int cc, int horsePower) {
        this.cc = cc;
        this.horsePower = horsePower;
    }
    
    public void engineStart(){
        System.out.println("engine is start");
    }
    
    
    public void engineStop(){
        System.out.println("engine is stop");
    }
    
    
}
