/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author merttan
 */
public class Case22 {

    private int age;

    public Case22(int initialAge) {
        // Add some more code to run some checks on initialAge
        age = initialAge < 0 ? 0 : initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age >= 18) {
            System.out.println("You are old.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age > 0 && age <= 12) {
            System.out.println("You are young.");
        } else {
            System.out.print("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        // Increment this person's age
        age++;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Case22 p = new Case22(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
