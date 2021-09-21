/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author merttan
 */
public class SquaringFunction implements MathFunction {

    private static String name = "Squaring";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double calculateFunction) {
        return Math.pow(calculateFunction, 2);
    }
}
