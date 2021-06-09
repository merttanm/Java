/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loosecouplingcalculateexample;

/**
 *
 * @author MERT
 */
public class calculateOperations {

    private Shape shape;

    public calculateOperations(Shape shape) {
        this.shape = shape;
    }

    public void calculate(int cal) {

        int c = shape.calculate(cal);
        System.out.println("Alan = " + c + "m2 dir.");

    }

}
