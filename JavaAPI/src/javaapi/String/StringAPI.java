/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapi.String;

/**
 *
 * @author merttan
 */
public class StringAPI {

    public static void main(String[] args) {

        String kelime = "Selamın Aleyküm";

        System.out.println(kelime);
        System.out.println("Kelimenin uzunluğu: " + kelime.length());
        System.out.println("1. index: " + kelime.charAt(1));
        System.out.println("1. index Unicod numarası: " + kelime.codePointAt(1));
        System.out.println("2. indexden önceki değerin Unicod numarası:" + kelime.codePointBefore(2));
        System.out.println("İndexler arasındaki unikodları sayısı: " + kelime.codePointCount(0, 15));
        System.out.println(kelime.offsetByCodePoints(0, 7));
        System.out.println(kelime.getBytes());
        char kelimeTest[] = new char[10]; //GetChars[] 
        kelime.getChars(0, 10, kelimeTest, 0); // İlk parametre kopyalanacak 1. karakter 2. parametre kopyalanacak son karakter 3. parametre array son parametre arrayin başlangıç değeri
        System.out.println(kelimeTest);
        System.out.println(kelime.indexOf(0, 4));
        System.out.println(kelime.lastIndexOf(kelime));
        System.out.println("Seçilen indexi güncelleme: "+kelime.replace('S','8')); 
      
        
        

    }

}
