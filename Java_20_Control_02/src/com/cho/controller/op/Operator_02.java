package com.cho.controller.op;

public class Operator_02 {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;

		System.out.println(intNum1 += 10);

		System.out.println((intNum1 += 10) > 10);
		System.out.println(intNum1);

		
		/*
		 * Short-circuit Evaluation (SCE)
		 * (최적화된) 단축 평가 값
		 * 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다.
		 * 두 번재 논리연산은 실행하지 않음 ( 첫 번째가 참이므로 뒤에는 무조건 참 == 논리합)
		 */
		System.out.println(
				((intNum1 += 10) > 20) || 
				((intNum2 += 10) > 10)
		);
		System.out.println(intNum1);
		System.out.println(intNum2);
	
		
		
		
		/*
		 * Short-circuit Evaluation (SCE)
		 * (최적화된) 단축 평가 값
		 * 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다.
		 * 두 번재 논리연산은 실행하지 않음 ( 첫 번째가 거짓이므로 뒤에는 무조건 거짓 == 논리곱)
		 */
		System.out.println(
				((intNum1 += 10) < 20) && 
				((intNum2 += 10) < 100)
				);
		System.out.println(intNum2);
	
	
	}
}
