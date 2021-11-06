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
public class Professor {

    int professorNumber;
    String professorName;
    String professorSurname;
    DepartmentUniversity department;
    Student[] advisee;
    CourseUniversity[] coursesGiven;

    public Professor(int professorNumber, String professorName, String professorSurname) {
        this.professorNumber = professorNumber;
        this.professorName = professorName;
        this.professorSurname = professorSurname;
    }
    
    
}
