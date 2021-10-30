/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Util.CollectionUtil;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author merttan
 */
public class IteratorExample {

    public static void main(String[] args) {
        Collection collec = CollectionUtil.getCollection();
        ıteretorExample1();

    }

    public static void ıteretorExample1() {

        Collection collec = CollectionUtil.getCollection();

        System.out.println("Collection: " + collec);

        System.out.println("----------");
        collec.add("dört");

        Iterator iterator = collec.iterator();
        collec.add("dört");

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            String str = (String) obj;
            System.out.println("Collection: " + str);
            if (str.startsWith("d")) {
                iterator.remove();
            }

        }
        System.out.println("----------");
        collec.add("altmış beş");
        iterator = collec.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            String str = (String) obj;
            System.out.println("Collection: " + str);

        }

    }

}
