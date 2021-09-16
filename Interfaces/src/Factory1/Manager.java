/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory1;

/**
 *
 * @author MERT
 */
public class Manager extends Employee {

    protected String departmentManager;

    public static final int MANAGER_PAYMENT = 50;

    public Manager(int no, int year, String name, String department, String departmentManager) {
        super(no, year, name, department);
        this.departmentManager = departmentManager;
    }

    @Override
    public double calculateSalary() {
         return years * BASE_SALARY + MANAGER_PAYMENT;
    }

    @Override
    public void work() {
         System.out.println("Manager is working");
        manageof();
    }
    
    public void manageof(){
        System.out.println("Duty: "+ departmentManager);
    }
  

}
