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
public class Car {

    /*
    public String model;
    public String make;
    public String year;
    public int speed;
    public int distance;
    public Person owner;
    String getInfo;
     */
    String make;
    String model;
    String year;
    int speed;
    int distance;
    Person owner;

    public String print() {
        String ekranaBas = "Araç bilgisi:" + year + " " + make + " " + model + " " + speed + " " + distance + " ";

        if(owner!=null)
        {
        ekranaBas+= owner.firstName+ " " +owner.lastName+ " "+owner.tckn;
        }
        else
             ekranaBas+=" Sahibi yok";
        
        return ekranaBas;

    }

}
