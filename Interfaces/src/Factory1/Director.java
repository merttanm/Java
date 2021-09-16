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
public class Director extends Manager {

    protected double bonus;

    public Director(int no, int year, String name, String department, String departmentManaged, double bonus) {
        super(no, year, name, department, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Director is working");
        
    }

    @Override
    public double calculateSalary() {
        return years * BASE_SALARY + +MANAGER_PAYMENT + bonus;
    }

}
