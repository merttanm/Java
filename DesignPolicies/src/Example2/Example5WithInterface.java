/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *
 * @author MERT
 */
public interface Example5WithInterface {

    interface Flyable{
    
    void fly();
    
    };
    
     interface Swimmerable{
    
    void swim();
    
    };
    
    
    static class Bird {
    }

    static class FlyBird implements Flyable ,Swimmerable{

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    }

    static class Duck implements Flyable ,Swimmerable {

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }


    static class Penguin implements Swimmerable {

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static void main(String[] args) {

        Duck d = new Duck();
        d.fly();
        Penguin p = new Penguin();
        //  p.fly();   Problem

    }


    
}
