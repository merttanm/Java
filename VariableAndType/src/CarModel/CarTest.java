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
public class CarTest {

    public static void main(String[] args) {
        CarModel car1 = new CarModel();
        car1.marka = "BMW";
        car1.model = "320";
        car1.renk = "Bordo";
        car1.sınıfı = "A class";
        car1.tipi = "Coupe";
        car1.hızlanmaKatsayisi = 1.4;
        car1.kilometre = 10000;
        car1.bilgileri();
        car1.km(33000);
        System.out.println(car1.bilgileri());

        System.out.println("---------------------");

        CarModel car2 = new CarModel();
        car2.marka = "Mercedes";
        car2.model = "cla";
        car2.renk = "Siyah";
        car2.sınıfı = "A class";
        car2.tipi = "Coupe";
        car2.hızlanmaKatsayisi = 1.3;
        car2.kilometre = 20000;
        car2.bilgileri();
        System.out.println(car2.bilgileri());
        System.out.println("***************");

        CarModel tmp = car1;
        car1 = car2;
        car2 = tmp;
        System.out.println("Car1:"+car1.bilgileri()+"\n");
        System.out.println("Car2:"+car2.bilgileri()+"\n");
        System.out.println("Tmp:"+tmp.bilgileri()+"\n");
    }

}
