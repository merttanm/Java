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
abstract class Student {

    int no;
    String name;
    String year;
    String date;
    String major;

    public Student(int no, String name, String year, String date, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.date = date;
        this.major = major;
        // register();

    }

    public abstract void study();

    public abstract void register();

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInfo() {

        return "Öğrenci no:" + no + "\nÖğrenci adı:" + name
                + "\nÖğrencilik yıl:" + year
                + "\nÖğrenci kayıt tarihi:" + date
                + "\nÖğrenci eğitimi:" + major;

    }

}
