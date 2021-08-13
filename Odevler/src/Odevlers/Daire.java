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
public class Daire {

    int yaricap;
    float pi;

    public Daire(int yaricap, float pi) {
        this.yaricap = yaricap;
        this.pi = pi;
    }

    public static void main(String[] args) {
        Daire daire = new Daire(5, 5);
        float yaricap= daire.pi * daire.yaricap;
        System.out.println("Yarı çap:" +yaricap);

    }
}
