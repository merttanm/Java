/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LazySingletonPattern;

import EagleSingletonPattern.*;

/**
 *
 * @author MERT
 */
public class SingletonClass {

    /**
     * @param args the command line arguments
     */
    /*
    Bu patterndeki kullanma şekli yanlızca bir nesne kullanmayı sağlıyor,
    mesela bir connection tanımladıkysay 2. bir connection açmaya izin vermiyor.
    */
    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        return instance;
    }

    static {
        instance = new SingletonClass();

    }

    public SingletonClass() {
    }
}
