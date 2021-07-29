/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odevlers;

/**
 *
 * @author MERT
 */
public class Stack {

    public static int maxStackSize = 5;
    boolean full = false;
    boolean empty = true;
    String array[] = new String[maxStackSize];
    int counter = 0;

    public boolean push(String newElement) {

        if (!full) {
            array[counter] = newElement;
            counter++;
            empty=false;
            if (counter == 5) {
                full = true;
            }
            return true;
        }

        return false;
    }

    public void clear() {
    }

    public String pop() {
        String lastItem = null;
        if (!empty) {
            lastItem = array[counter - 1];
            counter--;
            if (counter == 0) {
                full = false;
            }
        }

        return lastItem;
    }

    public boolean isEmpty() {
        return empty;
    }

    public int getCapacity() {
        return maxStackSize;
    }

}
