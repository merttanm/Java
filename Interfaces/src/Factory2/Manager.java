/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

/**
 * @
 *
 * @author merttan
 */
public class Manager extends Employee {

    protected String departmentManaged;
    public static double MANAGER_SALARY = 2000;

    public Manager(int no, int years, String name, String department, String departmentManaged) {
        super(no, years, name, department);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("Manager is working!");
        manage();
    }

    public void manage() {
        System.out.println("Manager manages department: " + departmentManaged);
    }

    @Override
    public String toString() {
        return "Manager no=" + no + ", name=" + name + ", year=" + years + ", department=" + department + "";
    }

    @Override
    public double calculateSalary() {
        return years * BASE_SALARY + +MANAGER_SALARY ;
    }
}
