/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author MERT
 */
public class BreakAndContinueLabel {
    
    public static void main(String[] args) {
        
    int[][] arrayOfInts = { { 32, 87, 3, 11 }, { 11, 111, 111, 12 }, { 45, 45, 44, 12 } };
		int searchfor = 11;

		int i = 0;
		int j = 0;
		boolean foundIt = false;

		search: for (; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {

				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					System.out.println("Found " + searchfor + " at " + i + ", " + j);
					break search;
				}
			}
		}

		if (!foundIt)
			System.out.println(searchfor + "not in the array");
	}
}