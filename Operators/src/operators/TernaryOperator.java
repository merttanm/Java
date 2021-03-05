/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author MERT
 */
public class TernaryOperator {
    
    void trncagır(){
    
        int i=13;
        int j=76;
        int min=(i<=j) ? i: j;
        System.out.println("Min: "+min);
        
        int x=0;
        int y=5;
        int z=6;
        int t = x == 2 ? y : z;
        System.out.println("t: " +t);
        
    }
    
}
