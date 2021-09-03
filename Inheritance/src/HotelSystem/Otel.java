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
public class Otel {

    String otelAdı;
    String vergino;
    ArrayList<Personel> personel;
    Musteri musteri;

    public Otel(String otelAdı, String vergino, ArrayList personel, Musteri musteri) {
        this.otelAdı = otelAdı;
        this.vergino = vergino;
        this.personel = personel;
        this.musteri = musteri;
    }

    public void printInfo() {
        System.out.println("Otel Adı: " + otelAdı);
        System.out.println("Vergi Kimlik No:" + vergino);
        for (int i = 0; i < personel.size(); i++) {
            System.out.println("Personel: " + personel.get(i).print());
        }
        System.out.println("Musteri: " + musteri.print());
    }

}
