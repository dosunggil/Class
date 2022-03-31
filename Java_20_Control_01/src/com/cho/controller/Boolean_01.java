package com.cho.controller;

public class Boolean_01 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 1000) + 1;
		int intNum2 = (int) (Math.random() * 1000) + 1;

		boolean bEq = intNum1 == intNum2;
		boolean bNotEq = intNum1 != intNum2;

		boolean bGT = intNum1 > intNum2;
		boolean bLT = intNum1 < intNum2;
		
		
		
		/*
		 * 논리적 오류(문제)가 있는 코드
		 * 아래 코드는 intNum1 과 intNum2 의 같음과 크기를 비교하여 그 결과를 보여주고 있다.
		 * bGT와 bLT 코드는 없어도 되는 코드 (절대 실행되지 않음)
		 */
		if (bEq) {
			System.out.printf("\t%d 와 %d 는 같다.\n", intNum1, intNum2);
			/*
			 * } else if (bNotEq) { System.out.println("\t두 수는 서로 다르다");
			 */
		} else if (bGT) {
			System.out.printf("\t%d 가 %d 보다 크다.\n", intNum1, intNum2);
		} else if (bLT) {
			System.out.printf("\t%d 가 %d 보다 작다.\n", intNum1, intNum2);
		}
	}

}
