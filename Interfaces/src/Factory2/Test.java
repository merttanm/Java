/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory2;

import java.util.Arrays;

/**
 *
 * @author merttan
 */
public class Test {

    public static void main(String[] args) {

        HR h = new HR();

        Employee[] employes = new Employee[10];

        for (int i = 0; i < 10; i++) {
            employes[i] = h.getAnEmployee();
        }

        Arrays.sort(employes);
        for (Employee e : employes) {
              System.out.println(e);
        }

     
    }

}
