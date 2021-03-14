/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkingInJava.Object;

/**
 *
 * @author MERT
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("***************");
        System.out.println(System.getProperty("user.name"));
        System.out.println("***************");
        System.out.println(System.getProperty("java.library.path"));
        System.out.println("***************");
        System.out.println(System.getProperty("os.name"));
        
    }
    
}
