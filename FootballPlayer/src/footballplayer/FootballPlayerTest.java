/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballplayer;

/**
 *
 * @author MERT
 */
public class FootballPlayerTest {

    public static void main(String[] args) {

        FootballPlayer player1 = new FootballPlayer();
        player1.inPlay = false;
        player1.name = "rüştü";
        player1.nimute = 45;
        player1.no = 1;
        player1.numberOfGoals = 0;

        if (player1.inPlay == true) {
            player1.play(30);
            System.out.println(player1.getPlayer());
        }
        System.out.println(player1.getPlayer());
    }

}
