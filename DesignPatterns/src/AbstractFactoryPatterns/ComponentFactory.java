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
public class ComponentFactory {
    
    enum ComponentType {
        TextItem, Button
    }

    public Component createShape(ComponentType componentType) {
        Component temp = null;
        if (componentType == ComponentType.Button) {
          temp =  new Button();
        } else if (componentType == ComponentType.TextItem) {
            temp = new TextItem();
        }
        return temp;

    }


}

