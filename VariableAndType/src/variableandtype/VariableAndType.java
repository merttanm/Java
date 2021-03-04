/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableandtype;

import References.UserModel;

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
        int sayi2 = sayi1;
        sayi1 = 45;
        System.out.println("sayi 1= " + sayi1 + " sayi 2= " + sayi2);
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
        ch = 'T';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch = 9;
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch = ' ';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch = '$';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch = '+';
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch = (char) -6;
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);
        ch = (char) -45657;
        System.out.println("Karakter: " + ch + "  Karaktere karşılık gelen sayı  " + (int) ch);

        //--------------------------------- Escapes (Kaçış karakterleri)--------------------------------- 
        System.out.println("-----------------------Escapes (Kaçış karakterleri)---------------------------------");

        System.out.println("Naber\nBebeğim");
        System.out.println("Selam\tYavrum");
        System.out.println("Fatih\bSultan");
        System.out.println("Pelkas\f\fAlex");
        System.out.println("Erzinca\nlı");
        System.out.println("ÖlürümTürkğ\\iyem");
        /*
        System.out.println("-----------------------var tipi---------------------------------");
        
         int j=6;
         System.out.println("j: "+j);
         byte b=45;
         var jjj=b/4.0;
         System.out.println("jjj:" +jjj);
         */

        System.out.println("-----------------------Tür Dönüşümleri---------------------------------");

        byte byteNumber = 0;
        short shortNumber = 3;
        char chatNumber = 'a';
        int intNumber = 3_1;
        long l = 123_123_123l;
        float floatNumber = 456.34_534_3f;
        double doubleNumber = 12.23_423_5234;

        short shortNumber2 = byteNumber;
        System.out.println("shortNumber2= " + shortNumber2);

        byte byteNumber2 = (byte) shortNumber; // --------------------- Sayı büyürse sonuç saçmalar
        System.out.println("byteNumber2= " + byteNumber2);

        float floatNumber2 = intNumber;
        System.out.println("floatNumber2= " + floatNumber2);

        int intNumber2 = (int) floatNumber; // --------------------- virgülden sonra veri kaybı olur
        System.out.println("intNumber2= " + intNumber2);

        int intNumber3 = (int) 1.245675675789789f;
        System.out.println("intNumber3= " + intNumber3);

        byte bytNumber3 = (byte) 12.12;
        System.out.println("bytNumber3= " + bytNumber3);

        System.out.println("-----------------------final veriable---------------------------------");

        final int i = 89;
        //i = 45;    //-------hata 
        int num1 = 3;
        int num2 = 5;
        final int num3;  // final değişkene tek bir kere değer atanıyor sonra değeri değiştirilemiyor.

        if (num1 > num2) {
            num3 = 6;
        } else {
            num3 = 9;
        }
        final UserModel m1 = new UserModel();
        //  m1=new UserModel(); // -------Hata 

        final UserModel m2;
        m2 = new UserModel();

    }

}
