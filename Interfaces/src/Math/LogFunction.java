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
public class LogFunction implements MathFunction {

    private static String name="Log";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double calculateFunction) {

        return Math.log(calculateFunction);
    }

}
