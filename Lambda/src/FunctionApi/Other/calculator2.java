/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.Other;

import java.util.function.BiFunction;

/**
 *
 * @author merttan
 */
public class calculator2 {

    private BiFunction<Double, Double, Double> adder = (arg1, arg2) -> arg1 + arg2;
    private BiFunction<Double, Double, Double> subtracter = (arg1, arg2) -> arg1 - arg2;
    private BiFunction<Double, Double, Double> multiplier = (arg1, arg2) -> arg1 * arg2;
    private BiFunction<Double, Double, Double> devider = (arg1, arg2) -> arg1 / arg2;

    public double add(double arg1, double arg2) {
        return adder.apply(arg1, arg2);
    }

    public double sub(double arg1, double arg2) {
        return subtracter.apply(arg1, arg2);
    }

    public double mul(double arg1, double arg2) {
        return multiplier.apply(arg1, arg2);
    }

    public double div(double arg1, double arg2) {
        return devider.apply(arg1, arg2);
    }

    /*
    34.933530000000005
-12.202360000000002
268.32815500000004
0.4800313101609935
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(11.32123, 23.6123));
        System.out.println(calculator.sub(11.3433, 23.54566));
        System.out.println(calculator.mul(11.353, 23.635));
        System.out.println(calculator.div(11.3453, 23.6345));

    }

}
