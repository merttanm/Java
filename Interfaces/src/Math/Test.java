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
public class Test {

    public static void main(String... args) {

        SinFunction s= new SinFunction();
        CosFunction c= new CosFunction();
        
        CalculatorT t =new CalculatorT(2);
        t.addFunction(s);
        t.addFunction(c);
        t.listMathFunction();
        
        t.doCalcultor("Cos", 5.6);
        t.doCalcultor("Sin", 2.1);
        t.doCalcultor("Squaring", 2.3);

    }

}
