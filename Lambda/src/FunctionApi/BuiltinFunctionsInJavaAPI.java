/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 *
 * @author merttan
 */
public class BuiltinFunctionsInJavaAPI {

    public static void main(String[] args) {

        //List<String> names= Arrays.asList("Armut", "Elma","Kavun","Mandalina", "Portakal","Kivi");
        List<String> names = new ArrayList<>();
        names.add("Elma");
        names.add("Armut");
        names.add("Mandalina");
        names.add("Portakal");
        names.add("Kivi");
        names.add("Ananas");
        System.out.println("---- Meyve Listesi ----");
        printList(names);

        System.out.println("--- Alfabetik Sıralama ----");
        Collections.sort(names);
        printList(names);

        System.out.println("---- Meyve Listesi Genişlerse ----");
        names.add("Üzüm");
        names.add("Muz");
        names.add("Karpuz");
        printList(names);

        System.out.println("--- Alfabetik Sıralama ----");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        printList(names);

        System.out.println("--- Uzunluk Sıralaması ----");
        Comparator<String> s = (name1, name2) -> name1.length() - name2.length();
        Collections.sort(names, s);
        printList(names);

        System.out.println("--- fruitNames.length() < 8 ----");
        Predicate<String> prdc = fruitNames -> fruitNames.length() > 8;
        names.removeIf(prdc);
        printList(names);
        System.out.println("--- fruitNames.length() < 7 ----");
        Predicate<String> prdc2 = fruitNames -> fruitNames.length() > 7;
        names.removeIf(prdc2);
        printList(names);

        System.out.println("----UpperCase----");
        int count = 45;
        UnaryOperator<String> uo = ss -> ss.toUpperCase();
        names.replaceAll(uo);
        printList(names);
        
        System.out.println("----LowerCase----");
        UnaryOperator<String> lowercase = slc -> slc.toLowerCase();
        names.replaceAll(lowercase);
        printList(names);

        System.out.println("---- Meyve Listesi Sıfırlanırsa ----");
        names = Collections.emptyList();
        printList(names);
        System.out.println("Size: " + names.size());

    }

    private static void printList(List<String> list) {

        list.forEach(i -> System.out.println(i));

    }

}
