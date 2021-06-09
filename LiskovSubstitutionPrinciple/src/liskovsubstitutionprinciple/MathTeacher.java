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
public class MathTeacher extends SchoolStaf implements CourseIntructor{
    
    @Override
    public void teach() {
        System.out.println("Math Science...");
    }
    
}
