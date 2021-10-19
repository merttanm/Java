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
public class Student {

    final private int studentNumber;
    private String studentName;
    private String surnameName;
    private Department department;
    private Professor advisor;
    private Course[] coursesTaken;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSurnameName() {
        return surnameName;
    }

    public void setSurnameName(String surnameName) {
        this.surnameName = surnameName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public String getInfo() {

        String getInfo = " ------ Student ------ \n" + "Student Number: " + studentNumber + " | " + "Student Name: " + studentName
                + " | " + "Surname Name: " + surnameName;

        return getInfo;

    }

}
