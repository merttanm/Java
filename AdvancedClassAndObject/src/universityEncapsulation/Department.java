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
public class Department {

    private String departmentName;
    private int departmentNumber;
    private Professor head;
    private Course[] courses;
    private Student[] students;

    public Department(String departmentName, int departmentNumber) {
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
    }

    public Department(String departmentName, int departmentNumber, Professor head, Course[] courses, Student[] students) {
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
        this.head = head;
        this.courses = courses;
        this.students = students;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public Professor getHead() {
        return head;
    }

    public void setHead(Professor head) {
        this.head = head;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getInfo() {

        String getInfo = " ------ Department ------ \n" + "Department Name: " + departmentName + " | " + "Department Number: " + departmentNumber
                + "";

        return getInfo;

    }

}
