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
public class Test {

    public static void main(String[] args) {

        Worker w1 = new Employee(1, 1, "Murat", "Şöför");
        w1.work();

        if (w1 instanceof Employee e) {
            System.out.println("Employee Salary: " + e.calculateSalary() + " TL");
            System.out.println("------------------------------------------------");
        }

        Worker w2 = new Manager(1, 1, "Murat", "Driver", "Duty of drivers");

        //       Manager m1 = (Manager) w2;
        // m1.work();
        w2.work();

        if (w2 instanceof Manager m) {
            System.out.println("Manager Salary: " + m.calculateSalary() + " TL");
            System.out.println("------------------------------------------------");
        }

        Worker w3 = new Director(1, 1, "Murat", "Driver", "Duty of drivers", 500);
        w3.work();
        if (w3 instanceof Director d) {
            System.out.println("Director Salary: " + d.calculateSalary() + " TL");
            System.out.println("------------------------------------------------");
        }
        Worker w5 = new Boss();
        w5.work();

    }

}
