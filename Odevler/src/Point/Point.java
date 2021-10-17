/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point;

/**
 *
 * @author merttan
 */
public class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToTheCenter(double x, double y) {
        double distanceToOrigin = Math.pow(x, 2) + Math.pow(x, 2);
        System.out.println("x:" + x + " y:" + y);
        System.out.print("Orjine olan uzaklığı: ");
        return Math.sqrt(distanceToOrigin);
    }

}
