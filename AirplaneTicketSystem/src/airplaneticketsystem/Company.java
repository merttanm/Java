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
public class Company extends Airplane {

    int companyID;
    String companyName;

    public Company(int companyID, String companyName, int airplaneId, int passengerCapacity, String airplaneModel) {
        super(airplaneId, passengerCapacity, airplaneModel);
        this.companyID = companyID;
        this.companyName = companyName;
    }


    @Override
    public void getInfo() {
        super.getInfo(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Company Name: " + companyName + "\nCompany ID:" + companyID);
    }
}
