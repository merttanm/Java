/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractHW;


import java.util.Date;

/**
 *
 * @author merttan
 */
public class VocationalStudent extends Student {

    public VocationalStudent(int no, String name, String year, String date, String major) {
        super(no, name, year, date, major);
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
