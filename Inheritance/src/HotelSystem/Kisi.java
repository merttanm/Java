/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelSystem;

/**
 *
 * @author MERT
 */
public class Kisi {

    String adi;
    String soyadi;
    String tckn;

    public Kisi(String adi, String soyadi, String tckn) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.tckn = tckn;
    }
    
    public String print(){
    
        String getInfo= "Adı:"+adi+"  Soyadı:"+soyadi+"  TC Kimlik no:"+tckn;
        return getInfo;
    
    }
    
    

  
    
    
    

}
