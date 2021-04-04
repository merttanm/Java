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

    String model;
    String marka;
    String renk;
    Boolean kazalimi;
    String sase;
    Integer yası;

    void yazdir(String model, String marka, String renk, Boolean kazalimi, String sase, Integer yası) {
        System.out.println("--------Araç bilgileri--------");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Renk: " + renk);
        System.out.println("Kazalımı: " + kazalimi);
        System.out.println("Şase numarası: " + sase);
        System.out.println("Yaşı: " + yası);
        
        if(kazalimi==false)
        {
            System.out.println("arac kazali değil");
        
        }
        
        üstKalite(kazalimi,yası);

    }
    
    void üstKalite(Boolean kazalimi, Integer yası){
    
    if(kazalimi== false && yası<5){
        System.out.println("Arac alınabilir...");
    }
    
    }

   
}
