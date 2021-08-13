/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {

        Course courseC = new Course();
        courseC.courseName = "Fizik";

        Department departmentD = new Department();
        departmentD.departmentName = "Mühendislik";

        Student studentS = new Student();
        studentS.name = "mert";

        Professor professorP = new Professor();
        professorP.name = "Numan";

        departmentD.head = professorP;
        departmentD.courses = new Course[100];
        departmentD.courses[0] = courseC;

        professorP.department = departmentD;
        professorP.advisee = new Student[100];
        professorP.advisee[0] = studentS;

        courseC.department = departmentD;
        courseC.department = new Department();
        courseC.department = departmentD;

        courseC.teacher = professorP;
        courseC.teacher = new Professor();
        courseC.teacher = professorP;

        System.out.println("Departmantdaki kurslar: " + departmentD.courses[0].courseName);
        System.out.println("Öğretim görevlilerine bağlı öğrenciler: " + professorP.advisee[0].name);
        System.out.println("Kursların departmanları: " + courseC.department.departmentName);
        System.out.println("Kursu veren profesör hoca: " + courseC.teacher.name);

    }

}
