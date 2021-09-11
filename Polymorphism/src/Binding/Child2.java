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
public class Child2 extends Parent {
//    Miras alan sınıflar arasında herhangi bir metod override ediliyorsa polimorfiktir.
//    Static final ve private metodlar override (ezileßez) edilemez
//    static metodlar referansın üzerinde çağırılır.İnstiance metodlar daima runtime zamanda binding edilir.

    public static int i = 3;
    public int j = 4;

   /*Burada Parentten gelen sadece make metodu overide edilebiliyor*/
    @Override
    protected void make() {
        super.make(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
      //	@Override
    private void doThis() {  // yeni bir metod
        System.out.println("Child2 de oluşturulmul doThis metodu...");
    }

//	@Override
    public static void doIt() {   // yeni bir metod
        System.out.println("Child2 de oluşturulmul doIt metodu...");
    }

}
