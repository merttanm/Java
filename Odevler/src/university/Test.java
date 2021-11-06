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

        CourseUniversity courseC = new CourseUniversity();
        courseC.courseName = "Fizik";

        DepartmentUniversity departmentD = new DepartmentUniversity();
        departmentD.departmentName = "Mühendislik";

        StudentUniversity studentS = new StudentUniversity();
        studentS.name = "mert";

        ProfessorUniversity professorP = new ProfessorUniversity();
        professorP.name = "Numan";

        departmentD.head = professorP;
        departmentD.courses = new CourseUniversity[100];
        departmentD.courses[0] = courseC;

        professorP.department = departmentD;
        professorP.advisee = new StudentUniversity[100];
        professorP.advisee[0] = studentS;

        courseC.department = departmentD;
        courseC.department = new DepartmentUniversity();
        courseC.department = departmentD;

        courseC.teacher = professorP;
        courseC.teacher = new ProfessorUniversity();
        courseC.teacher = professorP;

        System.out.println("Departmantdaki kurslar: " + departmentD.courses[0].courseName);
        System.out.println("Öğretim görevlilerine bağlı öğrenciler: " + professorP.advisee[0].studentName);
        System.out.println("Kursların departmanları: " + courseC.department.departmentName);
        System.out.println("Kursu veren profesör hoca: " + courseC.teacher.name);

    }

}
