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
public class Cube implements Shape {

    @Override
    public int calculate(int i) {
        System.out.println("Küp alanı hesapalanıyor");
        return i * i * i;
    }

}
