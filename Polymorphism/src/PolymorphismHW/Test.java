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

        GraduateStudent graduateStudent1 = new GraduateStudent("Ali Nizam", "Web app", 3, "Mehmet", "2020", "4 Ocak 2001", "Mühendislik");
        if (graduateStudent1 instanceof Student) {
            System.out.println("--------------- Student Status Graduate ----------------");
            s1.registerStudent(graduateStudent1);
        }
        UndergraduateStudent udergraduateStudent1 = new UndergraduateStudent("Ali Nizam", 4, "Mobil app", "Mehmet", "2020", "4 Ocak 2001");   
         if (graduateStudent1 instanceof Student) {
            System.out.println("--------------- Student Status Undergraduate ----------------");
             s1.registerStudent(udergraduateStudent1);
        }
        
        System.out.println("-------------------------------");

        PhdStudent phdStudent1 = new PhdStudent(true, "Prof. Dr. Şenol", "Heykel bölümü", 5, "Dursun", "2021", "2020", "Güzel Sanatlar  Fakültesi");
   //     phdStudent1.register();
        
          if (phdStudent1 instanceof GraduateStudent) {
            System.out.println("--------------- PHD Student Status Graduate ----------------");
            phdStudent1.register();
        }
        
        System.out.println("-------------------------------");

        MasterStudent masterStudent1 = new MasterStudent("Dr. Şinasi", "Java", 4, "Mobil app", "Mehmet", "2020", "Edebiyat Fakültesi", false);
        masterStudent1.register();

    }

}
