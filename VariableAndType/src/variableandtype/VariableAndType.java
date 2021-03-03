/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableandtype;

/**
 *
 * @author MERT
 */
public class VariableAndType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //İlkel veri tipleri
        int sayi1 = 23;
        boolean flag = false;
        boolean creat = true;
        char firstLetter = 'a'; // Negatif almazz!!
        char c;
        float a = 0.1f;
        double d = 1 * a;        
        System.out.println("d:" + d);

        //Altçizgili gözerim
        int aInt=10_000_000;
        System.out.println(aInt)
                ;
        int anotherInt=10_00_00;
        System.out.println(anotherInt);

        int otherInt1=10_0_0__0_0;
        System.out.println(otherInt1);
        
        int otherInt2=1______0;
        System.out.println(otherInt2);
        
        int otherInt3=0______0;
        System.out.println(otherInt3);
        
        Long aLong=2_143_234_895L;
        System.out.println(aLong);
        
        
        
        
        //Escapes (Kaçış karakterleri)
        System.out.println("Naber\nBebeğim");
        System.out.println("Selam\tYavrum");
        System.out.println("Fatih\bSultan");
        System.out.println("Pelkas\f\fAlex");
        System.out.println("Erzinca\nlı");
        System.out.println("ÖlürümTürkğ\\iyem");

    }

}
