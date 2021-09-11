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
public class HR {

    public Employee personelSelected() {
        Employee e=null;
        Random r = new Random();
        int s = r.nextInt(3);

        switch(s)
        {

            case 0:
            e=new Employee(1, 2, "Muhammet", "Dumrul");
            break;
            case 1:
            e=new Manager("İdari işler", 2, 2, "Servan", "Dumrul");
            break;
            case 2:
            e= new Director(1, "Nakliye", 3, 2, "Serhat", "Dumrul");
            break;
          
    }
        return e;
    }
    
}
