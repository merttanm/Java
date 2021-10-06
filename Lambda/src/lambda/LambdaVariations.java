/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author merttan
 */
public class LambdaVariations {

    public static void main(String... args) {

        for (int i = 0; i < 10; i++) {
           validation();
        }


    }

    public static BinaryDoubleCheck validation() {

        BinaryDoubleCheck tautology = (d1, d2) -> false;
        BinaryDoubleCheck contradiction = (d1, d2) -> false;

        BinaryDoubleCheck equalityCheck = (d1, d2) -> d1 == d2;
        BinaryDoubleCheck firstArgumentCheck = (d1, d2) -> d1 > d2;
        BinaryDoubleCheck secondArgumentCheck = (d1, d2) -> d1 < d2;

        BinaryDoubleCheck checker = null;
        int i = (int) (Math.random() * 5);

        switch (i) {
            case 0:
                checker = tautology;
                System.out.println("tautology");
                break;
            case 1:
                checker = contradiction;
                System.out.println("contradiction");
                break;
            case 2:
                checker = equalityCheck;
                System.out.println("equalityCheck");
                break;
            case 3:
                checker = firstArgumentCheck;
                System.out.println("firstArgumentCheck");
                break;
            case 4:
                checker = secondArgumentCheck;
                System.out.println("secondArgumentCheck");
                break;
        }

        return checker;
    }

}

interface BinaryDoubleCheck {

    public boolean check(double checknumberId1, double checknumberId2);
}
