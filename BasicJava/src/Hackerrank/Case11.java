/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;

import java.security.Permission;
import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Case11 {

    static String s = "Good Job";
    //  static Scanner scn = new Scanner(System.in);
    //  static int number = scn.nextInt();
    static int number = 44;
    static int n;

    static {
        if (number <= 100 && number >= -100) {
            System.out.println(s);
        }

    }

    static {
        try {
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    class DoNotTerminate {

        class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1;
        }

        public void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }

}
