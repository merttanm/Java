/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractHW;

import PolymorphismHW.*;
import java.util.Date;

/**
 *
 * @author merttan
 */
public class MasterStudent extends GraduateStudent {
    
    public MasterStudent(String advisir, String thesis, int no, String name, String year, String date, String major) {
        super(advisir, thesis, no, name, year, date, major);
    }

    @Override
    public void meetWhithAdvisor() {
        super.meetWhithAdvisor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeTheSis() {
        super.writeTheSis(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void register() {
        super.register(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void study() {
        super.study(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
