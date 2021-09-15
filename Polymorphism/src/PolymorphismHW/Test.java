/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismHW;

/**
 *
 * @author merttan
 */
public class Test {

    public static void main(String... args) {

        RegistationStudent s1 = new RegistationStudent();

        Student student1 = new Student(1, "Akın", "2021", "23 Ekim 2001", "Mühendislik");
        s1.registerStudent(student1);

        System.out.println("-------------------------------");

        VocationalStudent vocationalStudent1 = new VocationalStudent(2, "Numan", "2020", "4 Ocak 2001", "Mühendislik");
        s1.registerStudent(vocationalStudent1);

        System.out.println("-------------------------------");

        GraduateStudent graduateStudent1 = new GraduateStudent("Ali Nizam", "Web app", 3, "Mehmet", "2020", "4 Ocak 2001", "Mühendislik");
        s1.registerStudent(graduateStudent1);

        System.out.println("-------------------------------");

        UndergraduateStudent udergraduateStudent1 = new UndergraduateStudent("Ali Nizam", 4, "Mobil app", "Mehmet", "2020", "4 Ocak 2001");
        s1.registerStudent(udergraduateStudent1);

        System.out.println("-------------------------------");

        MasterStudent masterStudent1 = new MasterStudent("Ali Nizam", "Java", 5, "Mobil app", "Mehmet", "2020", "4 Ocak 2001");
        masterStudent1.register();
        System.out.println("-------------------------------");

        PhdStudent phdStudent1 = new PhdStudent(true, "Şenol", "Java", 5, "Mobil app", "Mehmet", "2020", "4 Ocak 2001");
        phdStudent1.register();
        
    }

}
