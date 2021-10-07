/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class AirplaneTicketSystem {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner;
    static ArrayList<String> listCompanys = new ArrayList<String>();
    // static ArrayList<CompanyAirline> listCompanys;

    public static void main(String[] args) {

        cratingCompany();
        cratingPassenger();
        // System.out.println("Havayolu şirket listeleri:" + listCompanys);
        printCompany(listCompanys);

    }

    public static void cratingCompany() {
        try {
            String companyName = null;
            String airplaneModel = null;
            System.out.println("----- Company ----- ");
            System.out.print("Şirket adı giriniz: ");
            Object cmpName = read(companyName);
            System.out.print("Uçak modeli giriniz: ");
            Object airplnName = read(airplaneModel);
            CompanyAirline c = new CompanyAirline(1, (String) cmpName, 1000, 450, (String) airplnName);
            CompanyAirline b = new CompanyAirline(2, "THY", 1000, 450, "AİRBUS-750");

            c.getInfo();
            listCompanys.add(c.companyName);
            b.getInfo();
            listCompanys.add(b.companyName);

            /*
            listCompanys = new ArrayList<>();
            listCompanys.add(new CompanyAirline(2, "THY", 1000, 450, "AİRBUS-750"));
            
            for(CompanyAirline l: listCompanys){
            
                System.out.println(l);
            }*/
            //  c.listCompany();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public static void printCompany(List<String> List) {

        System.out.println("----------------");
        System.out.print("Havayolu şirket listeleri:");
        List.forEach(i -> System.out.println(i));
    }

    public static void cratingPassenger() {
        try {
            String passengerName = null;
            String passengerSurname = null;

            System.out.println("----- Passenger ----- ");
            System.out.print("Yolcu ismi giriniz: ");
            Object psngeName = read(passengerName);
            System.out.print("Yolcu soyismi giriniz: ");
            Object psngeSurname = read(passengerSurname);
            Passenger p = new Passenger(1, (String) psngeName, (String) psngeSurname, 467);
            p.getInfo();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public static void listCompany() {
    }

    public static Object read(String prmp) {
        Scanner s = new Scanner(System.in);
        prmp = s.next();
        return prmp;

    }

}
