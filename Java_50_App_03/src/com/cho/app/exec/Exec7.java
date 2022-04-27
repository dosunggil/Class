package com.cho.app.exec;

public class Exec7 {

	public static void main(String[] args) {
		int[] intArr = new int[100];
		int intScore = 0;
		int intNum = 0;

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < intArr.length; i++) {

			for (int j = 2; j < intArr[i]; j++) {
				if ((intArr[i] % j) == 0) {
					intNum++;
					break;
				} //end if
			} // end for j

		} // end for i
		
		System.out.println(100-intNum);
	}
}
