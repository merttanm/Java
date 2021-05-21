/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author MERT
 */
public class Task implements ITask {

    int year;

    void doSomething() {
        System.out.println("Starting Making Something...");
    }

    @Override
    public void doSomething() {

        doSomething(year);
    }

}
