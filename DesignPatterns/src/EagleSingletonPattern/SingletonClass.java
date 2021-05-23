/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EagleSingletonPattern;

/**
 *
 * @author MERT
 */
public class SingletonClass {

    /**
     * @param args the command line arguments
     */
    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        return instance;
    }

    static {
        instance = new SingletonClass();

    }

    private SingletonClass() {
    }
}
