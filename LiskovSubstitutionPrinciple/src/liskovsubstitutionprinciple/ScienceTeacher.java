/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubstitutionprinciple;

/**
 *
 * @author MERT
 */
public class ScienceTeacher extends SchoolStaff implements CourseIntructor{

    @Override
    public void teach() {
        System.out.println("Taught Science...");
    }
    
}
