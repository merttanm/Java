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
public class TanFunction implements MathFunction {

    private static String tanFuntion = "Tan";

    @Override
    public String getName() {
        return tanFuntion;
    }

    @Override
    public double calculate(double calculateFunction) {
        return Math.tan(calculateFunction);

    }

}
