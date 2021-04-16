/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author MERT
 */
public class Task  implements ITask {
    
    void doSometing(int starYears){
    
        System.out.println("Starting Making Someting");
    
    }

    @Override
    public void doSometing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
