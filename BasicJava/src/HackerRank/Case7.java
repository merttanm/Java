/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author merttan
 */
public class Case7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String world[]=s.trim().split("[asdf");
        for(String word: world){
            System.out.println(word);
        
        }
        
       /* StringTokenizer kelimeTolken = new StringTokenizer(s);

        while (kelimeTolken.hasMoreElements()) {

            System.out.println(kelimeTolken.nextToken());
        }
        scan.close();*/
   
    }
}
