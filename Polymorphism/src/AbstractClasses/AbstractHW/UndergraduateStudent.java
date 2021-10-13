/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses.AbstractHW;


import java.util.Date;

/**
 *
 * @author merttan
 */
public class UndergraduateStudent extends Student {

    String minor;

    public UndergraduateStudent(String minor, int no, String name, String year, String date, String major) {
        super(no, name, year, date, major);
        this.minor = minor;
    }

    @Override
    public void study() {
    }

    @Override
    public void register() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
