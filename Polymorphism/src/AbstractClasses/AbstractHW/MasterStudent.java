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
public class MasterStudent extends GraduateStudent {
    
    private boolean studentIsGraduate;
    
    public MasterStudent(String advisir, String thesis, int no, String name, String year, String date, String major,boolean studentIsGraduate) {
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
     //   super.register(); //To change body of generated methods, choose Tools | Templates.
      System.out.println("Öğrenci yeterlilik durumu: "+ studentIsGraduate);
        
        if(studentIsGraduate ==true){
        
            System.out.println("Öğrenci mezun olmuştur yüksek lisans hakkı vardır");
        }
        else
            System.err.println("Öğrenci mezun olamamıştır yüksek lisans hakkı yoktur");
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
