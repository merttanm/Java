/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem;

import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {

        Musteri m1 = new Musteri("Ali", "yılmaz", "1231245");
        
       
        Personel p1= new Personel("Mustafa","Demir","13212564352");
        Personel p2= new Personel("Alev","Toprak","13212564352");
        ArrayList <Personel> personeller= new ArrayList<Personel>();
        personeller.add(p1);
        personeller.add(p2);
        Otel o1= new Otel("Kervansaray","13212312313",personeller,m1);
        Rezervasyon r1= new Rezervasyon(m1,o1,"1995");

        System.out.println("-------- Müşteri --------\n"+m1.print()+"\n");
        System.out.println("-------- Personel --------\n"+p1.print()+"\n");
        System.out.println("-------- Otel --------");
        o1.printInfo();
        System.out.println("\n"+"-------- Rezervasyon --------");
        r1.print();

    }

}
