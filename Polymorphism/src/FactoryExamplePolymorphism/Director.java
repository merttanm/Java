/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryExamplePolymorphism;

import java.util.Random;

/**
 *
 * @author merttan
 */
public class Director extends Manager {

   
   public final double bonus;

    public Director(double bonus, String departmentManaged, int no, int years, String name, String department) {
        super(departmentManaged, no, years, name, department);
        this.bonus = bonus;
    }
    
       public double calculateSalary() {
        return super.calculateSalary()+ bonus;
        
    }


}
