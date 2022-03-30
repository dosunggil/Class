package com.cho.var;

public class Var_01 {
	public static void main(String[] args) {

//		1~1000까지 임의의 정수 중 하나를 저장
		int intNum1 = (int) (Math.random() * 1000) + 1;
		int intNum2 = (int) (Math.random() * 1000) + 1;

		System.out.printf("\tintNum1 : %d\n", intNum1);
		System.out.printf("\tintNum2 : %d\n", intNum2);

		System.out.println("\tnum1 > num2 : " + (intNum1 > intNum2));

		System.out.println("\tnum1 < num2 : " + (intNum1 < intNum2));

		System.out.println("\tnum1 == num2 : " + (intNum1 == intNum2));

		/*
		 * 두 개의 비교대상에 담긴 값이 같지 않냐고 물어보는 비교연산자
		 */
		System.out.println("\tnum1 <> num2 : " + (intNum1 != intNum2));

		/*
		 * literal : 값을 정확히 확인할 수 있는 값 
		 * 일반적인 숫자값, "문자열" 
		 * Java에서 리터럴과 리터럴을 비교연산 하는것은 의미가
		 * 없다. 때문에 이클립스에서 오류 또는 경고를 보여준다
		 */
		System.out.println(30 == 30);
		System.out.println(30 > 30);

	}

}
