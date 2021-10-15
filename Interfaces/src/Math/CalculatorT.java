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
public class CalculatorT implements Calculator {

    int calculat;

    private int functionCount;
    private int currentCount = 0;
    private MathFunction arrayFunction[];

    SinFunction sf = new SinFunction();
    CosFunction cf = new CosFunction();
    SquaringFunction sq = new SquaringFunction();
    TanFunction tf = new TanFunction();
    LogFunction lf = new LogFunction();

    public CalculatorT(int functionCount) {
        this.functionCount = functionCount;
        arrayFunction = new MathFunction[functionCount];
    }

    @Override
    public void addFunction(MathFunction function) {
        arrayFunction[currentCount] = function;
        currentCount++;

    }

    @Override
    public void listMathFunction() {
        for (int i = 0; i < arrayFunction.length; i++) {
            System.out.println(arrayFunction[i].getName());

        }

    }

    @Override
    public double doCalcultor(String s, Double d) {
        double result = 0.0;
        double ert = d;
        if (s.equals("Sin")) {
            result = sf.calculate(ert);
            System.out.println(result);

        } else if (s.equals("Cos")) {
            result = cf.calculate(ert);
            System.out.println(result);
        } else if (s.equals("Tan")) {
            result = tf.calculate(ert);
            System.out.println(result);
        } else if (s.equals("Log")) {
            result = lf.calculate(ert);
            System.out.println(result);
        } else {
            result = sq.calculate(ert);
            System.out.println(result);
        }

        return result;

    }

}
