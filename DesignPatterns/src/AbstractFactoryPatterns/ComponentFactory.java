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
public class ComponentFactory implements AbstactFactory {

    enum compType implements IProductEnum {
        Button,
        TextItem,
    }

    public Component create(IProductEnum componentType) {
        Component temp = null;
        if (componentType == ((compType)componentType).Button) {
            temp = new Button();
        } else if (componentType == ((compType)componentType).TextItem) {
            temp = new TextItem();
        }
        return temp;

    }

}
