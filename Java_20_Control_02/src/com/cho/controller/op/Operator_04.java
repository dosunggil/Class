package com.cho.controller.op;

public class Operator_04 {

	public static void main(String[] args) {
		
		int intNum1 = 100;
		int intNum2 = -intNum1; 
		
		intNum1 = 100;
		intNum2 = intNum1 * (-1);
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		
		// bit 연산자
		// intNum1 을 2진수로 정수 2를 2진수로 변환
		// 각 bit 를 OR 연산
		intNum2 = intNum1 ^ 2;
		intNum2 = intNum1 | 2;
		
		// intNum1 을 2진수로 정수 2를 2진수로 변환
		// 각 bit 를 AND 연산
		intNum2 = intNum1 & 2;
		
		intNum2 = intNum1 * intNum1 ; // 제곱 계산
	}
}
