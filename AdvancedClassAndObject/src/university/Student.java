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
public class Student {

    int studentNumber;
    String studentName;
    String surnameName;
    DepartmentUniversity department;
    ProfessorUniversity advisor;
    CourseUniversity[] coursesTaken;


    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;

    }
    

}
