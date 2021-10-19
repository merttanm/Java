/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityEncapsulation;

/**
 *
 * @author MERT
 */
public class Test {

    public static void main(String[] args) {

        Course courseC = new Course(1, "Fizik");

        Department departmentD = new Department("Eğitim Fakültesi", 101);

        Student studentS = new Student(123123123, "Helin");

        Professor professorP = new Professor(99, "Reha", "Demir");

        System.out.println(courseC.getInfo());
        System.out.println(departmentD.getInfo());
        System.out.println(studentS.getInfo());
        System.out.println(professorP.getInfo());

        courseC.Course(courseC, departmentD, professorP, studentS);
    }

}
