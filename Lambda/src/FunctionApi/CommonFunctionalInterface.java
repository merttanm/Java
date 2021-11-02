/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi;

/**
 *
 * @author merttan
 */
public class CommonFunctionalInterface {

    @SuppressWarnings("unused")
    public static void main(String[] ars) {

        UniIntegerChecker isZero = (i) -> i == 0;
        System.out.println(isZero.method(5));

        UniIntegerChecker isOne = (i) -> i == 1;
        System.out.println(isOne.method(1));

        UniIntegerChecker isPositive = (i) -> i > 0;
        System.out.println(isPositive.method(345));

        UniIntegerChecker isNegative = (i) -> i < 0;
        System.out.println(isNegative.method(-123));

        BiIntegerChecker isEquals = (i, j) -> i == j;
        System.out.println(isEquals.method(10, 100));

        BiIntegerChecker isNotEquals = (i, j) -> i != j;
        System.out.println(isNotEquals.method(10, 100));

        BiIntegerChecker isGreatThan = (i, j) -> i > j;
        System.out.println(isGreatThan.method(10, 100));

        BiIntegerChecker isLessThan = (i, j) -> i < j;
        System.out.println(isLessThan.method(10, 100));

    }
}

@FunctionalInterface
interface UniIntegerChecker {

    boolean method(int i);
}

@FunctionalInterface
interface BiIntegerChecker {

    boolean method(int i, int j);
}
