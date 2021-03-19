/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author MERT
 */
public class Person {


    String tckn;
    String firstName;
    String lastName;

    // Car of the person
    Car vehicle;
    
    public String kisiBilgisi()
    {
    String kisiBas="Kişisel bilgileri: "+ firstName+ " "+ lastName+ " " + tckn;
    if(vehicle!=null)
    {
        kisiBas += " "+ vehicle.make + " " + vehicle.model+ " " + vehicle.year +" " + vehicle.distance+ " " +vehicle.speed;
    }
    else
         kisiBas += " Arac yok";
    
    return kisiBas;
    
    }
    
    
    
}
