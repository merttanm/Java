/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPolymorphism;

import java.util.Random;

/**
 *
 * @author merttan
 */
public class Test {

    public static void main(String[] args) {

        double randm = (double) (Math.random() * 444);

        PaymentService s = new PaymentService();

        Employee e = new Employee(1, 2, "Ali", "Ak");
     //   Employee e2 = new Employee(2, 4, "Tolunay", "Kafkas");
        //  System.out.println("Maaş: " + e.calculateSalary()); // Bu yöntem inheritiance
        s.paySalary(e);
        System.out.println("-----------------------------------");

        Manager m = new Manager("Nakliye", 2, 2, "Numan", "Demir");
       // Manager m2 = new Manager("Nakliye", 3, 3, "Veli", "Fidan");
        //System.out.println("Maaş: " + m.calculateSalary());
        s.paySalary(m);
        System.out.println("-----------------------------------");

        Director d = new Director(randm, "Nakliye", 3, 2, "Ayşe", "Seka");
       // Director d2 = new Director(randm, "Nakliye", 5, 6, "Fatih", "Terim");
        // System.out.println("Maaş: " + d.calculateSalary());
        s.paySalary(d); // S paysalary i çağırır . Paysalary herşeyin bir employee olduğunu bilir.
        System.out.println("-----------------------------------");

        e = d; //Upcasting
        m = d;
        s.paySalary(e);
        s.paySalary(m);

    }

}
