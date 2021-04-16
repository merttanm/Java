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
    
    int start, end; 
    
    void doSometing(int startYeard, int endDate){
    
        System.out.println("Starting Making Someting");
    
    }

    @Override
    public void doSometing() {
        doSometing(start,end);
    }
    
}
