package com.cho.arrays;

public class ArryasV5 {

	public static void main(String[] args) {

		int[] intScore = new int[100];

	
		 for (int i = 0; i < intScore.length; i++) { 
			 intScore[i] = (int)(Math.random() * 100) + 1; }
	
		 /* for (int n = 1; n < (intScore.length/5); n++)
		 * 
		 * for (int i = 1; i < 6; i++) {
		 * 
		 * System.out.print(intScore[i * n]); System.out.print(", ");
		 * 
		 * } System.out.println(" ");
		 */
		for (int i = 0; i < intScore.length; i++) {
			System.out.print(intScore[i]+ ",");
			if ((i+1)%5 == 0) {
				System.out.println("");
		}
}
	}
}
