/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Case21 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        /*if(N==3){
           System.out.println("Weird");
        }
        else if(N<=5 && N>=2){
            System.out.println("Not Weird");
        }
        else if(N<=20 && N>=6){
        System.out.println("Weird");
        }
        
        else
            System.out.println("Not Weird");
        
         */
        if (N % 2 == 0) {

            if (N <= 5 && N >= 2) {
                System.out.println("Not Weird");
            } else if (N <= 20 && N >= 6) {
                System.out.println("Weird");

            } else {
                System.out.println("Not Weird");
            }

        } else if (N % 1 == 0) {
            System.out.println("Weird");
        }
        bufferedReader.close();
    }
}
