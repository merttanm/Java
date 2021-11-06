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
public class Course {

    int courseId;
    String courseName;
    DepartmentUniversity department;
    ProfessorUniversity teacher;
    Student[] students;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    /* public static String getInfo(){
    
    String getInfo= "courseId: "+ courseId +" "+ "courseName: "+courseName;

    return getInfo;
    
    }*/
}
