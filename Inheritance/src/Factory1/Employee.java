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
public class Employee {

    protected int no;
    protected int year;
    protected String name;
    protected String department;

    public static final int BASE_SALARY = 1001;

    public Employee(int no, int year, String name, String department) {
        this.no = no;
        this.year = year;
        this.name = name;
        this.department = department;
        System.out.println("Employee...");
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public double calculateSalary() {

        return year * BASE_SALARY;
    }

    public void getInfo() {

        System.out.println("No: " + no);
        System.out.println("Year: " + year);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);

    }

    public static int getBaseSalary() {
        return BASE_SALARY;
    }

}
