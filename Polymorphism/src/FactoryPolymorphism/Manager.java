/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPolymorphism;

import static FactoryPolymorphism.Employee.SALARY;

/**
 *
 * @author merttan
 */
public class Manager extends Employee {

    protected String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 2000;
    
  

    public Manager(String departmentManaged, int no, int years, String name, String department) {
        super(no, years, name, department);
        this.departmentManaged = departmentManaged;
    }
    
    
      public double calculateSalary() {
        return super.calculateSalary()+ MANAGEMENT_PAYMENT;
        
    }
      
   

    
      
      
      
      

}
