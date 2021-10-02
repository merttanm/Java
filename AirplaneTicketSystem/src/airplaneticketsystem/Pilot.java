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
public class Pilot extends Person{

    int licanceId;

    public Pilot(int licanceId, int id, String name, String surname, int TCKN) {
        super(id, name, surname, TCKN);
        this.licanceId = licanceId;
    }
        public int getLicanceId() {
        return licanceId;
    }

    public void setLicanceId(int licanceId) {
        this.licanceId = licanceId;
    }

    

}
