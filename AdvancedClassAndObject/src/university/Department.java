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
public class Department {

    String departmentName;
    int departmentNumber;
    ProfessorUniversity head;
    CourseUniversity[] courses;
    Student[] students;

    public Department(String departmentName, int departmentNumber) {
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
    }



 

}
