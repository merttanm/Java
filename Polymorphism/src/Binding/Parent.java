/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binding;

/**
 *
 * @author merttan
 */
public class Parent {

    public static int i = 22;
    public int j = 44;

    private void doThis() {
        System.out.println("Parent classında oluşturulan doThis metodu!");
    }

    public final void doThat() {
        System.out.println("Parent classında oluşturulan doThat metodu");
    }

    public static void doIt() {
        System.out.println("Parent classında oluşturulan doIt metodu");
    }
    
    protected void make() {
        System.out.println("Parent classında oluşturulan make metodu!");
    }
}


