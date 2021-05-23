/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class Example4 {

    interface IShape {

        int area();
    }

    static class Circle implements IShape {

        int p, r;

        public int area() {
            return p * r * r;

        }
    }

    static class Square implements IShape {

        int r;

        public int area() {
            return r * r;
        }

    }

    static class Screen {

        ArrayList<IShape> object = new ArrayList();

        int calculateArea() {
            int totalArea = 0;
            for (IShape object : object) {
                totalArea += ((Circle) object).area();
            }
            return totalArea;
        }

    }
}
