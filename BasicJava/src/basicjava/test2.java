/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class test2 {

    /*
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String kelime; //String türünde değişkenimiz
        System.out.print("kelime:"); //kullanıcıdan girmesini kelime girmesini istiyoruz.
        kelime = oku.next(); //boşluğa kadar alıp,büyük harflere çeviriyoruz.

        for (int i = kelime.length() - 1; i >= 0; i--) //i'yi kelime uzunluğu kadar tanımlıyoruz.
        {
            System.out.print(kelime.charAt(i));
        }

    }
     */
    public static String StringChallenge(String str) {
        // code goes here 
        StringBuffer a = new StringBuffer(str);
       
        str= a.reverse().toString();
        System.out.print("Output: ");
        return  str.replaceAll("([^a-zA-Z0-9])", "");
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print("Inpurt: ");
        System.out.print(StringChallenge(s.nextLine()));
    }

}
