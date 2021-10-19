/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceHW;



/**
 *
 * @author merttan
 */
public class Test {

    public static void main(String... args) {

          RegistationStudent s1 = new RegistationStudent();


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

        PhdStudent phdStudent1 = new PhdStudent(true, "Prof. Dr. Şenol", "Heykel bölümü", 5, "Dursun", "2021", "2020", "Güzel Sanatlar  Fakültesi");
        if (phdStudent1 instanceof GraduateStudent) {
            System.out.println("--------------- PHD Student Status Graduate ----------------");
            phdStudent1.register();
        }

        MasterStudent masterStudent1 = new MasterStudent("Dr. Şinasi", "Türk Edebiyatı", 6, "Turan", "2021", "2020", "Edebiyat Fakültesi", false);

        if (masterStudent1 instanceof GraduateStudent) {
            System.out.println("--------------- Master Student Status Graduate ----------------");
            masterStudent1.register();
        }

        MasterStudent masterStudent2 = new MasterStudent("Dr. Ebubekir", "İngiliz Edebiyatı", 7, "Turan", "2021", "2020", "Edebiyat Fakültesi", true);

        if (masterStudent2 instanceof GraduateStudent) {
            System.out.println("--------------- Master Student Status Graduate ----------------");
            masterStudent2.register();
        }
        
    }

}
