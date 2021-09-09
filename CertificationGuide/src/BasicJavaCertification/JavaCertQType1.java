/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaCertification;

/**
 *
 * @author merttan
 */
public class JavaCertQType1 {

    /**
     * @param args the command line arguments
     */
    
    /*public static void main(String ... cmd) {
        main("private",cmd); ------------------------------COMPAİLER ERROR
        
    }*/
    
    public static void main(String type,String[] args) { ///Runtime error çünkü artık bu bir main değil main adında bir metod
        System.out.println(args[0] +args[1]);
        
    }
    
    
}
