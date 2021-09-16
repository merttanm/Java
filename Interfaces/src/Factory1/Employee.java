/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory1;

/**
 *
 * @author merttan
 */
public class Employee implements Worker {

    int no;
    int years;
    String name;
    String department;
    
    public static final int BASE_SALARY = 1001;

  

    public Employee(int no, int years, String name, String department) {
        this.no = no;
        this.years = years;
        this.name = name;
        this.department = department;
    }
      public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    public double calculateSalary() {
        return years * BASE_SALARY;
    }

}
