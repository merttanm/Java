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
public class AirplaneTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        cratingCompany();
        cratingPassenger();
    }

    public static void cratingCompany() {
        System.out.println("----- Company ----- ");
        Company c = new Company(1, "Pegasus", 1000, 450, "Boeing 737-400");
        c.getInfo();
    }

    public static void cratingPassenger() {
        System.out.println("----- Passenger ----- ");
        Passenger p = new Passenger(1, "Ali", "Demir", 467);
        p.getInfo();

    }

}
