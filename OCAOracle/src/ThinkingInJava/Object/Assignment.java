/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkingInJava.Object;

/**
 *
 * @author MERT
 */
public class Assignment {

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level = 12;
        tank2.level = 13;

        System.out.println("tank1 level:" + tank1.level + "\n" + "tank2 level:" + tank2.level);
        tank1 = tank2;
        System.out.println("*********");
        System.out.println("tank1 level:" + tank1.level + "\n" + "tank2 level:" + tank2.level);

    }

}
