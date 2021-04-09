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
    public Integer kmarttir;
    public Integer yası;

    public String yazdir() {
        /*System.out.println("--------Araç bilgileri--------");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Renk: " + renk);
        System.out.println("Kazalımı: " + kazalimi);
        System.out.println("Şase numarası: " + sase);
        System.out.println("Kilometresi: " + km);
        System.out.println("Yaşı: " + yası);*/
        String info = "Marka: " + marka
                +"\n"+ "Model: " + model 
                +"\n"+ "Renk: " + renk 
                +"\n"+ "Kazalımı: " + kazalimi
                +"\n" + "Şase numarası: " + sase 
                +"\n"+"Kilometresi: " + km 
                +"\n"+ "Yaşı: " + yası ;
        System.out.println("-----------------------------");
        if(kazalimi==false)
        {
            System.out.println( sase +  " Şase umaralı arac kazali değil");
          System.out.println("-----------------------------");
        }
        
        üstKalite(kazalimi,yası);
        return info;
    }
    
   public Integer kilometreArtisi(int arttir){
        km += arttir;
        return km;
    }
    
    void üstKalite(Boolean kazalimi, Integer yası){
    
    if(kazalimi== false && yası<5){
        System.out.println("Arac alınabilir...");
    }
    }

   
}
