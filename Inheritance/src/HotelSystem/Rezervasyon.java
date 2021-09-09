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
public class Rezervasyon {

    Musteri musteri;
    Otel otel;
    String rezervasyonYılı;

    public Rezervasyon(Musteri musteri, Otel otel, String rezervasyonYılı) {
        this.musteri = musteri;
        this.otel = otel;
        this.rezervasyonYılı = rezervasyonYılı;
        

        if (otel == null && musteri == null) {
            System.out.println("Böyle bir otel yada müşteri yok");

        }
    }

    public void print() {

        otel.printInfo();
        /*
        Direk otelin altında otel bilgileleri ve
        oteldeki müşteriler geldiği için tekrar müşteri sınıfı ile bağlantı kurmuyorum
         */
        System.out.println("rezervasyonYılı: " + rezervasyonYılı);

    }

}
