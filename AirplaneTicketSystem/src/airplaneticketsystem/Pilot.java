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
public class Pilot extends Employee{

    int licanceId;

    public Pilot(int employeeId, int id, String name, String surname, int TCKN) {
        super(employeeId, id, name, surname, TCKN);
    }

    public int getLicanceId() {
        return licanceId;
    }

    public void setLicanceId(int licanceId) {
        this.licanceId = licanceId;
    }

    

    

}
