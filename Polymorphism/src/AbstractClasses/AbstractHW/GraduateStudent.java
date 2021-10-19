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
public class GraduateStudent extends Student {

    String advisir;
    String thesis;

    public GraduateStudent(String advisir, String thesis, int no, String name, String year, String date, String major) {
        super(no, name, year, date, major);
        this.advisir = advisir;
        this.thesis = thesis;
        register();
    }

    @Override
    public void study() {
    }

    @Override
    public void register() {
      /*  System.out.println("Öğrenci no:" + no);
        System.out.println("Öğrenci adı:" + name);
        System.out.println("Öğrenci yıl:" + year);
        System.out.println("Öğrenci kayıt tarihi:" + date);
        System.out.println("Öğrenci eğitimi:" + major);*/
        writeTheSis();
        meetWhithAdvisor();
    }

    public void writeTheSis() {

        System.out.println("Öğrenci tez konusu: " + thesis);
    }

    public void meetWhithAdvisor() {

        System.out.println("Öğrenciye dersi veren kişi: " + advisir);
    }

}
