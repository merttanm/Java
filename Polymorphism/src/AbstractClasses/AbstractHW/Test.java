/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses.AbstractHW;

/**
 *
 * @author merttan
 */
public class Test {

    public static void main(String... args) {

        RegistationStudent s1 = new RegistationStudent();

        System.out.println("-------------------------------");

        VocationalStudent vocationalStudent1 = new VocationalStudent(1, "Numan", "2020", "4 Ocak 2001", "Mühendislik Fakültesi");
        s1.registerStudent(vocationalStudent1);

        System.out.println("-------------------------------");

        GraduateStudent graduateStudent1 = new GraduateStudent("Dr. Ali Nizam", "Web app", 2, "Mehmet", "2020", "4 Ocak 2001", "Mühendislik Fakültesi");
        s1.registerStudent(graduateStudent1);

        System.out.println("-------------------------------");

        UndergraduateStudent udergraduateStudent1 = new UndergraduateStudent("Dr. Ali Nizam", 3, "Mustafa", "2014", "1998", "Mimarlık Fakültesi");
        s1.registerStudent(udergraduateStudent1);

        System.out.println("-------------------------------");

        MasterStudent masterStudent1 = new MasterStudent("Dr. Şinasi", "Java", 4, "Mobil app", "Mehmet", "2020", "Edebiyat Fakültesi", false);
        //    masterStudent1.register();

        s1.registerStudent(masterStudent1);
        System.out.println("-------------------------------");

        PhdStudent phdStudent1 = new PhdStudent(true, "Prof. Dr. Şenol", "Heykel bölümü", 5, "Dursun", "2021", "2020", "Güzel Sanatlar  Fakültesi");
        //      phdStudent1.register();
        s1.registerStudent(phdStudent1);

    }

}
