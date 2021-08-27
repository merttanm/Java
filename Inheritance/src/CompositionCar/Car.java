/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositionCar;

/**
 *
 * @author MERT
 */
public class Car {

    private String make;
    private String model;
    private String year;
    private int speed;
    private int distance;
    private int doorCount;

    private Wheel[] wheel = new Wheel[10];
    private Door[] doors;
    private Engine engine;
    private Transmission transmission;

    public Car(String make, String model, String year, int speed, int distance, int doorCount) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.distance = distance;
        this.doorCount = doorCount;

        /*Car içinde aracın parçalarını oluşturmamın sebebi 
         araca bağlı olarak kapılarının motorunun veya tekerlerini oluşmasıdır.
         */
        engine = new Engine(1000, 700);

        transmission = new Transmission();

        this.doorCount = doorCount;
        doors = new Door[this.doorCount];
        doors[0] = new Door("Left-front");
        doors[1] = new Door("Right-front");

        wheel[0] = new Wheel("Sağ ön teker");
        wheel[1] = new Wheel("Sağ arka teker");
        wheel[2] = new Wheel("Sol ön teker");
        wheel[3] = new Wheel("Sol arka teker");

        System.out.println("Araba:  " + make + " " + model + ", " + year + " bulunuyor.\n");
    }
    
    public void start() {
		engine.engineStart();
	}
    
    public void stop() {
		engine.engineStop();
	}


    public String getInfo() {
        return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at "
                + speed + " kmph.";
    }

}
