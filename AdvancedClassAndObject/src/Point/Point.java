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
public class Point {

    double x, y;
    Point uzaklık;

    public double uzaklık(double x, double y) {
       double uzaklık=(double) (Math.sqrt(( x*x )+(y*y)));
       return uzaklık;
    }
    
    public void klon(){
        Point p= new Point();
        for (int i = 0; i < 10; i++) {
            double uzaklık=(double) p.uzaklık.x ;
            System.out.println("Uzaklık" +uzaklık+ " --- "+i+". Çağrılma Sayısı");
        }
        
    }  

}
