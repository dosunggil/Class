package com.cho.controller.op;

public class Operator_03 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 100) + 1;

		
		/*
		 * SCE 코드
		 * random으로 생성된 값이 60 이상이면 합격 출력
		 * 그렇지 않으면 intNum1 에 60을 저장하고 합격 출력
		 */
		if (intNum1 >= 60 || (intNum1 = 60) >= 60) {
			System.out.println("합격");
		}
	}
}
