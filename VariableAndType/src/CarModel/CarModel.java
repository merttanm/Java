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
    String marka;
    String model;
    String renk;
    String tipi;
    String sınıfı;
    Double kilometre;
    Double hızlanmaKatsayisi;
    
    public String bilgileri(){
    String bilgileri="Marka:"+marka+ "\n" +"Model:" + model+ "\n"+ "Renk:" + renk +"\n"+"Tipi:"+tipi+"\n"+"Sınıfı:"+sınıfı+"\n"+"Kilometresi:"+kilometre+"\n"+"0-100 hizlanması:"+hızlanmaKatsayisi;
    return bilgileri;
    }
    
    
    
    
    
}
