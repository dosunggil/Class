package com.cho.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = (int) (Math.random() * 100) + 1;

		}

		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = (intNums[i] % 2) == 0;
			System.out.print("\t" + intNums[i]);
			if (bEven) {
				System.out.print(" 은(는) 짝수입니다.\n\n");
			} else {
				System.out.print(" 은(는) 홀수입니다.\n\n");
			}

		}
	}

}