package com.cho.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {

		int intNum = 0;

		intNum = (int) (Math.random() * 100) + 1;

		if ((intNum % 2) == 0) {
			System.out.println("\t" + intNum + " 은(는) 짝수입니다.");
		} else {
			System.out.println("\t" + intNum + " 은(는) 홀수입니다.");
		}

	}
}
