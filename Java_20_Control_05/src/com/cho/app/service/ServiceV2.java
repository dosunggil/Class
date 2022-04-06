package com.cho.app.service;

public class ServiceV2 {

	public void guguDan() {
		int intIndex = 100;

		// for (초기화 코드 ; 비교 코드 ; 변화 코드)

		for (intIndex = 1; intIndex < 10; intIndex++) {
			System.out.printf("\t" + 3 + " x %d = %d\n", intIndex, 3 * intIndex);
		}

	} // end guguDan()

	
	
	/*
	 * guguDan(변수선언) 형식으로 method 선언하기
	 * method 의 괄호안에 선언된 변수를 argument 라고 한다.
	 * argument = 매개변수 또는 parameter
	 * 		호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고
	 * 		코드 내에서 변수 값을 사용하여 연산을 수행한다.
	 * argument 가 포함된 method를 호출할때는
	 * 		반드시 argument에 합당한 값을 함께 전달해 주어야 한다.
	 */
	
	public void guguDan(int dan) {

		int intIndex = 1;

		for (intIndex = 1; intIndex < 10; intIndex++) {
			System.out.printf("\t" +  dan + " x %d = %d\n", intIndex, dan * intIndex);
		}
	}
}
