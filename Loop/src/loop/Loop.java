/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Random;

/**
 *
 * @author MERT
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------------- While ---------------");
        double number1 = Math.random();
        System.out.println("number1: " + number1);

        while (number1 < 0.2) {
            number1 = Math.random();
            System.out.println("in while: " + number1);
        }
        System.out.println("After while");

        System.out.println("--------------- Do - While ---------------");
        
        double dw;
        do{
            dw=Math.random();
            System.out.println("dw: "+dw);
        }while(dw < 0.2);
        {
            System.out.println("dw < 0.2 ,End looop");
        }
        
        System.out.println("---------------If - Else---------------");
        int number2 = (int) (5 * Math.random());
        int number3 = (int) (5 * Math.random());

        if (number2 > number3) {
            System.out.println("number2 > number3");
        } else {
            System.out.println("number2 < number3");

        }
        System.out.println("--------------- For ---------------");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        System.out.println("\n\n\n");
        
        int col=5;
        int row=5;
         for (int i = 0; i < row; i++) {
             if(i==1){
                 for (int j = 0; j < 4; j++) {
                     System.out.println("*   *");                    
                 }                   
                 System.out.println("*****");
                 break;
             }             
            for (int j = 0; j < 5; j++) {
                
                System.out.print("*");
                
                if(j==col-1){
                    System.out.println("");}

            }
            
        }
         
         System.out.println("\n\n\n");
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 System.out.print("*");
             }
             
        }
         
         
         
         
         
         
        System.out.println("\n\n\n");
        
        
        
        
        

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("-");
            }
            System.out.println("");

        }

        for (int k = 5; k >= 0; k--) {
            
            for (int l =0; l < k ; l++) {
              
                System.out.print("-");
               
            }
            System.out.println("");
        }
         

        
       
        
        
        
        
    }

}
