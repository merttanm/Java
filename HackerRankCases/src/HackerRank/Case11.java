/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.security.Permission;
import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Case11 {

    //static int n;
    // static String s;

    /*static Scanner scn = new Scanner(System.in);
    static String s=scn.next();
    static int n=Integer.parseInt(s);
     */
 /*static {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int n = Integer.parseInt(s);
        try {
            if (n >= -100 & n <= 100) {
                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            }

        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }*/
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            
            String s =String.valueOf(n);
            
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
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
