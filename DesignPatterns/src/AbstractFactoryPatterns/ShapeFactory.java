/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPatterns;

import FactoryPattern.*;

/**
 *
 * @author MERT
 */
public class ShapeFactory {

    enum ShapeType {
        SQUARE, RECTANGLE
    }

    public Shape createShape(ShapeType shapeType) {
        Shape temp = null;
        if (shapeType == ShapeType.RECTANGLE) {
            temp = new Rectangle();
        } else if (shapeType == ShapeType.SQUARE) {
            temp = new Square();
        }
        return temp;

    }

    public Shape createShapeWihtStringParameter(String shapeType) {

        Shape temp = null;
        if (shapeType.equals("RECTANGLE")) {
            temp = new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            temp = new Square();
        }
        return temp;

    }

}
