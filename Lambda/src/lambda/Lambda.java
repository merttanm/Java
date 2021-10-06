/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author merttan
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Interface1 interface1 = () -> {
            return 2 * 2;
        };

        System.out.println(interface1.println());
        Interface2 interface2 = (y, b) -> {
            return 10 + 10;
        };
        System.out.println(interface2.println(0, 0));

        Interface3 ınterface3 = () -> System.out.println("Selamlar.");
        ınterface3.println();
        Interface3 ınterface4 = () -> System.out.println("Hello.");
        ınterface4.println();
        getInfo();

    }

    public static Interface4 getInfo() {
        
        Interface4 sl = () -> {System.out.println("ftgh");
        };
        sl.selamla();
        return sl;

     

    }

}

@FunctionalInterface
interface Interface1 {

    public int println();

}

@FunctionalInterface
interface Interface2 {

    public int println(int a, int b);

}

@FunctionalInterface
interface Interface3 {

    public void println();

}

@FunctionalInterface
interface Interface4 {

    public void selamla();

}
