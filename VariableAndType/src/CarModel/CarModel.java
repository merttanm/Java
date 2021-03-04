/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarModel;

/**
 *
 * @author MERT
 */
public class CarModel {
    public String marka;
    public String model;
    public String renk;
    public String tipi;
    public String sınıfı;
    public int kilometre;
    public Double hızlanmaKatsayisi;
    
    public String bilgileri(){
    String bilgileri="Marka:"+marka+ "\n" +"Model:" + model+ "\n"+ "Renk:" + renk +"\n"+"Tipi:"+tipi+"\n"+"Sınıfı:"+sınıfı+"\n"+"Kilometresi:"+kilometre+"\n"+"0-100 hizlanması:"+hızlanmaKatsayisi;
    return bilgileri;
    }
    
    public void km(int newKilometre){
    kilometre += newKilometre ;
        
    }

   
    
    
    
}
