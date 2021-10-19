/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismHW;

import java.util.Date;

/**
 *
 * @author merttan
 */
public class Student {

    private final int no;
    private final String name;
    private  final String year;
    private final  String date;
    private final String major;

    public Student(int no, String name, String year, String date, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.date = date;
        this.major = major;
       // register();
      
    }

    public void study() {
    }

    public void register() {
        System.out.println("Öğrenci no:" + no);
        System.out.println("Öğrenci adı:" + name);
        System.out.println("Öğrencilik yıl:" + year);
        System.out.println("Öğrenci kayıt tarihi:" + date);
        System.out.println("Öğrenci eğitimi:" + major);

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getInfo(){
    
        return "Öğrenci no:" + no+ "\nÖğrenci adı:" + name+
        "\nÖğrenci yıl:" + year+
        "\nÖğrenci kayıt tarihi:" + date+
        "\nÖğrenci eğitimi:" + major;
        
    }

}
