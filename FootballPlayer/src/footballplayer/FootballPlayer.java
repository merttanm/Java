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
public class FootballPlayer {

    String name;
    Boolean inPlay;
    int nimute;
    int no;
    int numberOfGoals;

    void play(int nimutesToPlay) {
        nimute += nimutesToPlay;
    }

    void score(int score) {
        score += numberOfGoals;

    }
    
      public String getPlayer() {
        String getInfo = "Name:" + name + "   " + "inPlay:" + inPlay + "   " + "Minute:" + nimute + "   " + "No:" + no + "   " + "numberOfGoals:" + numberOfGoals + "   ";
        return getInfo;
    }

}
