/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceHW2;
/**
 *
 * @author merttan
 */
public class Employee {

    int no;
    int years;
    String name;
    String department;

    public static final int SALARY = 5000;

    public Employee(int no, int years, String name, String department) {
        this.no = no;
        this.years = years;
        this.name = name;
        this.department = department;
        getInfo();
    }


    public double calculateSalary() {
        double maas = SALARY * years;
        return maas;
    }

    public void getInfo() {
        System.out.println("Adı: " + name);
        System.out.println("Departman: " + department);
        System.out.println("ID: " + no);
        System.out.println("Çalıştığı yıl: " + years);
    }

}
