/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car2;

/**
 *
 * @author MERT
 */
public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.marka = "BMW";
        car1.model = "320";
        car1.years = "10";
        car1.distiance = 0;
        car1.speed = 0;
        String info = car1.getInfo();
        System.out.println(info);

        car1.accelerate(100);
        car1.go(33);
        System.out.println(car1.getInfo());
        car1.go(22);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());
        
        
         car2.marka = "Mercedes";
        car2.model = "AMG";
        car2.years = "2";
        car2.distiance = 0;
        car2.speed = 0;
        String info2 = car2.getInfo();
        System.out.println(info2);

        car2.accelerate(100000);
        car2.go(1000);
        System.out.println(car2.getInfo());
        car2.go(1999);
        System.out.println(car2.getInfo());
        car2.stop();
        System.out.println(car2.getInfo());

    }

}
