/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.haftasonucalismasi;

/**
 *
 * @author MERT
 */
public class Car {

    public String model;
    public String marka;
    public String renk;
    public Boolean kazalimi;
    public String sase;
    public Integer km;
    public Integer ilkKm;
    public Boolean ilkKmArttırıyormusun;
    public Integer yası;

    
    
    public String yazdir() {
        String info = "Marka: " + marka
                + "\n" + "Model: " + model
                + "\n" + "Renk: " + renk
                + "\n" + "Kazalımı: " + kazalimi
                + "\n" + "Şase numarası: " + sase
                + "\n" + "Kilometresi: " + km
                + "\n" + "Yaşı: " + yası;

        System.out.println("-----------------------------");
        if (kazalimi == false) {
            System.out.println(sase + " Şase umaralı arac kazali değil");
            System.out.println("-----------------------------");
        }
        üstKalite(kazalimi, yası);
       // ilkKm(ilkKm);
        return info;
    }
    
    
    

    public Integer kilometreArtisi(int arttir , boolean ilkKmArttırıyormusun) {
        km += arttir;
        return km;
    }
    
    
    
    
    void ilkKm(int ilkKm){
        if(ilkKmArttırıyormusun = false){
            ilkKm =km;
            System.out.println("İlk km"+ilkKm);
        }
        else
         System.out.println("Kilometre artmıştır");
    }

    
    
    
    
    void üstKalite(Boolean kazalimi, Integer yası) {
        if (kazalimi == false && yası < 5) {
            System.out.println("Yaşı 5 den küçük olduğu için bu araç tercih edilebilir...");
        }
    }
    
}
