package com.cho.app.exec;

public class Exec7 {

	public static void main(String[] args) {
		int[] intArr = new int[100];
		int intNum = 0;

		for (int i = 0; i < intArr.length; i++) {
			 intArr[i] = (int) (Math.random() * 100) + 2;
			//intArr[i] = i + 1;
		}

		/*
		 * for (int i : intArr) { System.out.println(i); }
		 */

		for (int i = 0; i < intArr.length; i++) {

			if (intArr[i] == 1)
				continue;

			for (int j = 2; j < intArr[i]; j++) {
				if ((intArr[i] % j) == 0) {
					intNum++;
					break;
				} // end if
			} // end for j

		} // end for i

		System.out.println("배열 intArr 에는 " + (100 - intNum) + "개의 소수가 있습니다.");
	}
}
