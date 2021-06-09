/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonExample;

/**
 *
 * @author MERT
 */
public class Main {

    public static void main(String[] args) {
        Singleton sing = new Singleton();
        sing.showMessage();
        sing.showMessage();
        sing.showMessage();
        sing.showMessage();
        sing.showMessage();

    }

}
