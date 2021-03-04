/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballplayertest;

/**
 *
 * @author MERT
 */
public class FootballPlayerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FootballPlayer alex = new FootballPlayer();
        alex.name = "Alex de Souza";
        alex.no = 10;
        alex.minute = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;
        alex.play(12);
        alex.score();
        alex.score();

        System.out.println("Alexin oyunda kaldığı süre: " + alex.minute);
        System.out.println("Alexin attığı gol sayısı: " + alex.numberOfGoals);

        alex.play(12);
        alex.score();
        System.out.println("Alexin oyunda kaldığı süre: " + alex.minute);
        System.out.println("Alexin attığı gol sayısı: " + alex.numberOfGoals);

        alex.play(40);
        alex.score();
        System.out.println("Alexin oyunda kaldığı süre: " + alex.minute);
        System.out.println("Alexin attığı gol sayısı: " + alex.numberOfGoals);

    }

}
