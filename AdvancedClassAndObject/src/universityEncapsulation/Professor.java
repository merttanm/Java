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
public class Professor {

    final private int professorNumber;
    private String professorName;
    private String professorSurname;
    private Department department;
    private Student[] advisee;
    private Course[] coursesGiven;

    public Professor(int professorNumber, String professorName, String professorSurname) {
        this.professorNumber = professorNumber;
        this.professorName = professorName;
        this.professorSurname = professorSurname;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorSurname() {
        return professorSurname;
    }

    public void setProfessorSurname(String professorSurname) {
        this.professorSurname = professorSurname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Student[] getAdvisee() {
        return advisee;
    }

    public void setAdvisee(Student[] advisee) {
        this.advisee = advisee;
    }

    public Course[] getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(Course[] coursesGiven) {
        this.coursesGiven = coursesGiven;
    }

    public String getInfo() {

        String getInfo = " ------ Professor ------ \n" + "Professor Number: " + professorNumber + " | " + "Professor Name: " + professorName + " | "
                + "Professor Surname: " + professorSurname;

        return getInfo;

    }

}
