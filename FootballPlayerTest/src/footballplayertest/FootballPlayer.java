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
public class FootballPlayer {

    public Integer no;
    public String name;
    public Boolean inPlay;
    public Integer minute;
    public Integer numberOfGoals;

    void play(int nimutesToPlay) {
        minute = minute + nimutesToPlay;

    }

    void score() {
        numberOfGoals ++;

    }

}
