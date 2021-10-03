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
public class Passenger extends Person  {


    public Passenger(int id, String name, String surname, int TCKN) {
        super(id, name, surname, TCKN);
    }

    @Override
    public void getInfo() {
        super.getInfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void bookFight(){}

}
