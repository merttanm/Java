/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketsystem;

/**
 *
 * @author merttan
 */
public class Airplane {

    int airplaneId;
    int passengerCapacity;
    String airplaneModel;

    public Airplane(int airplaneId, int passengerCapacity, String airplaneModel) {
        this.airplaneId = airplaneId;
        this.passengerCapacity = passengerCapacity;
        this.airplaneModel = airplaneModel;
    }

    public void getInfo() {

        String getInfo
                = "Airplane Model: " + airplaneModel + "\nPassenger Capacity:" + passengerCapacity
                + "\nAirplane Id:" + airplaneId;
        System.out.println(getInfo);
    }

}
