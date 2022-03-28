package com.cho.var;

public class Var_02 {

	public static void main(String[] args) {
		
		int intNum1 = 0;
		intNum1 = num1();
		
		System.out.println(intNum1);
		
		int intNum2 = 0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 + 100;
		
		/*
		 * add() 를 실행하여 결과를 intNum2 에 저장
		 */
		intNum2 = add();
		
		System.out.println(intNum2);
		
	} // end main()
	
	/*
	 * add() 선언하기
	 */
	public static int add() {
		// 정수 55와 33을 덧셈하여 return 하기
		return 55 + 33;
	}
	
	/*
	 * num1() 선언하기
	 */
	public static int num1() {
		return 100;
		
	}
}
