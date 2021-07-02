/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCAPracticeTestExams;

/**
 *
 * @author MERT
 */
public class Tools {

    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        Tools tools = new Tools();
        int today = 20, tomorrow = 40;
        System.out.println(today+ tools.tomorrow+ tools.yesterday);

    }

}
