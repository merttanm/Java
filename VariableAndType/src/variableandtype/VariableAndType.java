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

        //--------------------------------- İlkel veri tipleri--------------------------------- 
        System.out.println("----------------------- İlkel veri tipleri---------------------------------");
        int sayi1 = 23;
        boolean flag = false;
        boolean creat = true;
        char firstLetter = 'a'; // Negatif almazz!!
        char c;
        float a = 0.1f;
        double d = 1 * a;
        System.out.println("d:" + d);

        //--------------------------------- Altçizgili gözerim--------------------------------- 
        System.out.println("----------------------- Altçizgili gözerim---------------------------------");

        int aInt = 10_000_000;
        System.out.println(aInt);
        int anotherInt = 10_00_00;
        System.out.println(anotherInt);

        int otherInt1 = 10_0_0__0_0;
        System.out.println(otherInt1);

        int otherInt2 = 1______0;
        System.out.println(otherInt2);

        int otherInt3 = 0______0;
        System.out.println(otherInt3);

        Long aLong = 2_143_234_895L;
        System.out.println(aLong);

        float aFloat = 1.23_17F;
        System.out.println(aFloat);

        double aDouble = 3.1_2_5_8;
        System.out.println(aDouble);

        /*-----------------------Altçizgizlerde Hatalı gösterimler--------------------------------- 
        int otherInt2=10__0_0__0_0_; Karakterin sonunda ya da başında " _ " olmaz
        int otherInt3=_10__0_0__0_0;
        long aLong2=2_234_345_888_L; " L " den once veya sonra " _ " olmaz
        float aFloat = 2_147_483_648_F
        
        
        int aHex=0X_56;  Kullanımı yine hatalıdır iki sayının arasında olabilir.
        int anHex = 0_X36;
        int aBinary = 0b_10;
        int aBinary = 0_B10;
         */
        //-----------------------Karakterler--------------------------------- 
        System.out.println("-----------------------Karakterler---------------------------------");

        char ch = 't';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch='T';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch=9;
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch=' ';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch='$';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch='+';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch=(char) -6;
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch=(char) -45657;
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        

        //--------------------------------- Escapes (Kaçış karakterleri)--------------------------------- 
        System.out.println("-----------------------Escapes (Kaçış karakterleri)---------------------------------");

        System.out.println("Naber\nBebeğim");
        System.out.println("Selam\tYavrum");
        System.out.println("Fatih\bSultan");
        System.out.println("Pelkas\f\fAlex");
        System.out.println("Erzinca\nlı");
        System.out.println("ÖlürümTürkğ\\iyem");

    }

}
