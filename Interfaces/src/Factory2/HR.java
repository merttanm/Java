/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

import java.util.Random;

/**
 *
 * @author merttan
 */
public class HR {

    public Employee getAnEmployee() {

        Employee e = null;

        int i = (int) (5 * Math.random());
        int no = new Random().nextInt(1000);

        switch (i) {

            case 0 ->
                e = new Employee(no, 2, "Muhammet", "Dumrul");

            case 1 ->
                e = new Manager(no, 1, "Murat", "Driver", "Duty of drivers");
            case 2 ->
                e = new Secretary(no, 1, "Alev", "Evrak Dairesi");
            case 3 -> 
                e = new Director(no, 2, "Muhammet", "Yazılımcı", "Yazılım Departmanı", 1200);
            case 4 ->
                e = new Employee(no, 3, "Muhammet", "Dumrul");
        }
        return e;

    }

}
