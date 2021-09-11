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
public class Child1 extends Parent {

//    Miras alan sınıflar arasında herhangi bir metod override ediliyorsa polimorfiktir.
//    Static final ve private metodlar override (ezileßez) edilemez
//    static metodlar referansın üzerinde çağırılır.İnstiance metodlar daima runtime zamanda binding edilir.
    public static int i = 2;
    public int j = 6;

    @Override
    protected void make() {
        super.make(); //To change body of generated methods, choose Tools | Templates.
    }

    //	@Override
    private void doThis() {  // yeni bir metod
        System.out.println("Child1 de oluşturulmul doThis metodu...");
    }

//	@Override
    public static void doIt() {
        System.out.println("Child1 de oluşturulmul doIt metodu...");
    }

}
