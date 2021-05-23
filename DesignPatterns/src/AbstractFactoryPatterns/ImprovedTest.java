/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPatterns;

/**
 *
 * @author MERT
 */
public class ImprovedTest {

    public static void main(String[] args) {
        AbstactFactory f = new ComponentFactory();
        Product p1 = f.create(ComponentFactory.compType.TextItem);
        Product p2 = f.create(ComponentFactory.compType.Button);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        AbstactFactory s = new ShapeFactory();
        Shape p3 = (Shape) s.create(ShapeFactory.shapeTypeEnum.RECTANGLE);
        Shape p4 = (Shape) s.create(ShapeFactory.shapeTypeEnum.SQUARE);
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }

}
