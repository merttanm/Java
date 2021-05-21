/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitycase;

/**
 *
 * @author MERT
 */
class Solution {

    public int solution(int N) {
        // write your code in Java SE 8
        int birler, onlar, yuzler, binler, onbinler;

        onbinler = N / 10000;
        N = N - (10000 * onbinler);
        binler = N / 1000;
        N = N - (1000 * binler);
        yuzler = N / 100;
        onlar = (N % 100) / 10;
        birler = (N % 100) % 10;
        
        if (onbinler == 5) {
            System.out.println(binler + " "+yuzler+" " + onlar + " " + birler);
        } 
        else if (binler == 5) {
            System.out.println(yuzler+" " + onlar + " " + birler);
        } 
        else if (yuzler == 5) {
            System.out.println(binler+" " + onlar + " " + birler);
        } else if (onlar == 5) {
            System.out.println(binler+" " + yuzler + " " + birler);
        } else if (birler == 5) {
            System.out.println(binler+" " + yuzler + " " + onlar);
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(50958);
    }

}
