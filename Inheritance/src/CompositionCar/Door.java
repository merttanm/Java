/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositionCar;

/**
 *
 * @author MERT
 */
public class Door {

    private String name;
    private boolean closed;

    public Door(String name) {
        this.name = name;
        System.out.println(name + " door is created");
    }

    public void open() {
        System.out.println(name + " door is open.");
    }

    public void close() {
        System.out.println(name + " door is closed.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
