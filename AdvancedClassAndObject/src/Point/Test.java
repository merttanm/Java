/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point;

/**
 *
 * @author MERT
 */
public class Test {
    public static void main(String[] args) {
        
        Point p= new Point();
        double orjineUzaklık= p.uzaklık(2, 1);
        System.out.println(""+orjineUzaklık);
        p.klon();
        
    }
    
}
