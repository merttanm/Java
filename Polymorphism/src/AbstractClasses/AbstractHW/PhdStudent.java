/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses.AbstractHW;

import PolymorphismHW.*;
import java.util.Date;

/**
 *
 * @author merttan
 */
public class PhdStudent extends GraduateStudent {

    boolean qulityingExamToken;

    public PhdStudent(boolean qulityingExamToken, String advisir, String thesis, int no, String name, String year, String date, String major) {
        super(advisir, thesis, no, name, year, date, major);
        this.qulityingExamToken = qulityingExamToken;
    }

    @Override
    public void meetWhithAdvisor() {
        super.meetWhithAdvisor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeTheSis() {
        super.writeTheSis(); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void register() {
        super.register(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Öğrenci yeterlilik durumu: "+ qulityingExamToken);
        
        if(qulityingExamToken ==true){
        
            System.out.println("NOT: Öğnreci doktora yapma onayı alabilir.");
        }
        else
            System.out.println("NOT: Öğnreci doktora yapma onayı alamaz.");

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
