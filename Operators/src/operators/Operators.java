/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.Random;

/**
 *
 * @author MERT
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        
        int k = 2;
        System.out.println(i / k); //-----------Yanlış sonuç---------------------

        double kk = (double) i / k;
        System.out.println(kk); //-----------Doğru sonuç---------------------

        byte h1 = 12;
        byte h2 = 34;
 //     byte h3=byte h1+byte h2;//-----------Hatalı yazım şekli---------------------
        byte h3 = (byte) (h1 + h2);
        System.out.println(h3); //----------true---------------------------
        
        short s1=2;
        short s2=6;
        short s3= (short)(s1+s2);
        System.out.println(s3);//----------true---------------------------
        
        short s4=6;
        byte b4=77;
        int i4= (int) s4+b4;
        System.out.println(i4);
        
        
        short s5=6;
        byte b5=77;
        byte i5= (byte) ((byte) s4+b4);
        System.out.println(i4);
        
        short s6=40;
        double d6=30;
        double d7=(double)d6/s6;
        System.out.println(d7);
        
        System.out.println(-i++); //-5
        System.out.println(-i);   //-6
        System.out.println(i--);  //6
        System.out.println(i);   //5
        System.out.println(++i); //6
        System.out.println(i);   //6
        System.out.println(i++); // 6
  //    System.out.println(i+++); //----Hata
  //    System.out.println(i---); //----Hata
  //    System.out.println(i-+); //----Hata
  //    System.out.println(i+-); //----Hata
        System.out.println("i:"+i);
        System.out.println(+9-+-i); //16
        System.out.println(--i);  //6
        
        int j=++i;  
        System.out.println("j:"+j); //7
        j=i++;
        System.out.println("j:"+j); //7
        j=--i;
        System.out.println("j:"+j); //7
        j=i--;
        System.out.println("j:"+j); //7
        
        int t=0;
        System.out.println("ok");
        t=++t;
        System.out.println("t:"+t);
        t=++t +2;
        System.out.println("t:"+t);
        t=0;
        System.out.println("not ok");
        t=t++;
        System.out.println("t:"+t); // kendisine atayıp ++ durumunda değeri değişmiyor ters köşe
        t=t++ +2;
        System.out.println("t:"+t); // kendisine atayıp ++ durumunda değeri değişmiyor ters köşe
        System.out.println("ok");
        
        RelationalOperators opr= new RelationalOperators();
         Random rand= new Random();
        int number1=rand.nextInt() %10;
        int number2=rand.nextInt() %10;
        opr.operatorCagır(number1, number2, 's', 'ı', true, false, "Fatih Sultan Mehmet", "Fatih Sultan Mehmet");
        
        
        ConditionalOperators copr = new ConditionalOperators();
        copr.operatorCagır2(true, false);
        
        TernaryOperator trn= new TernaryOperator();
        trn.trncagır();
        
       

    }

}
