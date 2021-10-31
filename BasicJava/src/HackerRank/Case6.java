/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Case6 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();
        int result;
        
        if(N>=2 && N<=20){
        for (int i = 1; i <= 10; i++) {
            result=N*i;
            System.out.println(N+"*"+i+"="+result );
        }
    }
    
    }
    
}
