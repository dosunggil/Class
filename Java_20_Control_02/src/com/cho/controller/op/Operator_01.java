package com.cho.controller.op;

public class Operator_01 {

	public static void main(String[] args) {
		
		/*
		 * 명령문 (statement)
		 * java 코드에서 명령문은 반드시 세미콜론으로 끝난다.
		 * 명령문의 시작은 keyword와 변수만 올 수 있다.
		 * 키워드로 시작하는 명령문은 어떤 기능을 수행하는 경우이고,
		 * 변수로 시작하는 경우는 연산자가 따라온다
		 * 변수의 바로 다음에 오는 연산자에는 
		 * 대입연산자(=), 단항연산자(++,--), 복합연산자(+=,*=,-=,%=), 삼항연산자 등이 있다.
		 * 
		 */

		int intNum1 = 10;
		int intNum2 = 0;
		
		//대입연산자 : 리터럴 100을 변수 intNum2 에 대입하라
		intNum2 = 100;
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		// 단항연산자 
		intNum2++;
		System.out.println(intNum2);
		
		
		intNum2 = ++intNum1;
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		intNum1 = intNum1 + 10;
		intNum2 = intNum1;
		System.out.println(intNum2);
		
		// 복합연산자
		intNum1 += 10;
		intNum2 = intNum1;
		System.out.println(intNum2);

		intNum2 = intNum1 = intNum1 + 10;
		System.out.println(intNum2);
		
	}
}
