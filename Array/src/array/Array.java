/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.lang.annotation.ElementType;
import java.util.Random;

/**
 *
 * @author MERT
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ElementType[] arrayName = new ElementType[2];
        Random random = new Random();
        int arrayM [] = new int[34];
        double dArray[] = new double[31];
        
        for (int i = 0; i < dArray.length; i++) {
           
            int dArray4= random.nextInt();
            int sayi=dArray4 %10;
            dArray[i]=sayi;
            System.out.println(dArray[i]);
            
        }
        
       
        
        
        
        
    }
    
}
