/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPolymorphism;

/**
 *
 * @author merttan
 */
public class PaymentService {

    public void paySalary(Employee employee) {
        // Manager ve Director, Employee sınıfından miras aldığı için hepsi bir Employeedir
        double salary = employee.calculateSalary();
        //System.out.println("Maaş: "+salary);

    }

}
