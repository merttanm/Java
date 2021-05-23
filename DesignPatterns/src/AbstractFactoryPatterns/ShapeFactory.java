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
public class ShapeFactory implements AbstactFactory {

    enum shapeTypeEnum implements IProductEnum {
        SQUARE,
        RECTANGLE
    }

    public Shape create(IProductEnum shapeType) {
        Shape temp = null;
        if (shapeType == ((shapeTypeEnum)shapeType).SQUARE) {
            temp = new Square();
        } else if (shapeType == ((shapeTypeEnum)shapeType).RECTANGLE) {
            temp = new Rectangle();
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
