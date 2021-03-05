/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author MERT
 */
public class ConditionalOperators {

    void operatorCagır2(boolean bool1, boolean bool2) {
        boolean bool3 = bool1 & bool2;
        boolean bool4 = bool1 | bool2;
        boolean bool5 = bool1 ^ bool2;
        System.out.println("bool1 & bool2: " + bool3);
        System.out.println("bool1 | bool2: " + bool4);
        System.out.println("bool1 ^ bool2: " + bool5);
        System.out.println("!bool1:        " + bool1);
        if ((getOne() == 2) & (getTwo() == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }

        if ((getOne() == 1) | (getTwo() == 2)) {
            System.out.println("value1 is 1 OR value2 is 2");
        }
    }

    private int getOne() {
        System.out.println("In getOne()");
        return 1;
    }

    public static int getTwo() {
        System.out.println("In getTwo()");
        return 2;
    }

}
