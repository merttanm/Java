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
public class Course {

    private int courseId;
    private String courseName;
    private Department department;
    private Professor teacher;
    private Student students;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getInfo() {

        String getInfo = " ------ Course ------ \n" + "Course Id: " + courseId + " | " + "Course Name: " + courseName
                + "";

        return getInfo;

    }

    public void Course(Course course, Department department, Professor teacher, Student students) {
        course.courseId = courseId;
        course.courseName = courseName;
        this.department = department;
        this.teacher = teacher;
        this.students = students;

        System.out.println("" + course.courseId + " | " + course.courseName + " | " + getDepartment().getDepartmentName() + " | "
                + getDepartment().getDepartmentNumber());

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Department getDepartment() {
        // System.out.println(department);
        return department;

    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getTeacher() {
        return teacher;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

}
