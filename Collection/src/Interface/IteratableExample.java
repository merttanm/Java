/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Util.CollectionUtil;
import java.util.Collection;

/**
 *
 * @author merttan
 */
public class IteratableExample {

    public static void main(String[] args) {

        Collection collec = CollectionUtil.getCollection();
        System.out.println(collec);
    }

}
