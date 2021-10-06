/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketsystem;

import java.util.ArrayList;

/**
 *
 * @author merttan
 */
public class CompanyAirline extends Airplane {

    int companyID;
    String companyName;

    int companyCount = 0;
    ArrayList<String> listCompanys = new ArrayList<String>();

    public CompanyAirline(int companyID, String companyName, int airplaneId, int passengerCapacity, String airplaneModel) {
        super(airplaneId, passengerCapacity, airplaneModel);
        this.companyID = companyID;
        this.companyName = companyName;
        //listCompanys.add(this.companyName);

    }

    @Override
    public void getInfo() {
        super.getInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Havayolu şirketi: " + companyName + "\nHavayolu şirket Id:" + companyID);
        //listCompany();
    }

    /* public void addCompany() {
      /*  listCompanys[companyCount] = listCompany;
        companyCount++;
            listCompanys.add(companyName);
            
    }

    public void listCompany() {
        System.out.println("Havayolu şirket listeleri:"+listCompanys);
        
    }
     */
}
