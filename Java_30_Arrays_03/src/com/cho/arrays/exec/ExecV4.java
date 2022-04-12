package com.cho.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		int intScore = 0;

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = (int) (Math.random() * 100) + 1;

		}

		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = (intNums[i] % 2) == 0;
			if (bEven) {
				intScore += intNums[i];
			}

		}
		System.out.println("\tintNums 배열의 요소 중 짝수의 총 합은 " + intScore + " 입니다.");
	}
}
