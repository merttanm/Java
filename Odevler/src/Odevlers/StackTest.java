/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevlers;

import java.util.Scanner;

/**
 *
 * @author MERT
 */
public class StackTest {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String girilen= scn.next();
        String girilen2= scn.next();
        String girilen3= scn.next();
        String girilen4= scn.next();
        String girilen5= scn.next();
        String girilen6= scn.next();
        
        Stack stack = new Stack();
        
        System.out.println(stack.push(girilen));
        System.out.println(stack.push(girilen2));
        System.out.println(stack.push(girilen3));
        System.out.println(stack.push(girilen4));
        System.out.println(stack.push(girilen5));
        System.out.println(stack.push(girilen6));
        
      /*  System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/
        
        stack.showElements();

        
        
    }
    
}
