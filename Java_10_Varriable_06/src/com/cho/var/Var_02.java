package com.cho.var;

public class Var_02 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 10) + 1;
		int intNum2 = (int) (Math.random() * 10) + 1;

		/*
		 * boolean type 변수 : 값으로 true 또는 false 를 가진다.
		 */
		boolean bYes = intNum1 >= intNum2;
		System.out.println(bYes);
		
		
		/*
		 * 산술연산과 비교연산을 포함하는 연산식 (expression)
		 * 1. intNum1 % 2 가 연산되고 
		 * 2. 그 결과가 0과 같은지 비교 연산을 수행한다.
		 * 3. 최종적으로 비교 연산 결과를 bEven 변수에 저장
		 * 이 연산식의 최종결과가 담기는 bEven 의 값은 짝수냐 아니냐로 갈림
		 */
		boolean bEven = (intNum1 % 2) == 0;
		
		/*
		 * intNum1 에 저장된 값이 3의 배수인가?
		 */
		boolean drainge3 = (intNum1 % 3) == 0;
		System.out.println(drainge3);
	}

}
