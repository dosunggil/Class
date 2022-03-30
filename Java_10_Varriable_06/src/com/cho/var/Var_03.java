package com.cho.var;

public class Var_03 {

	public static void main(String[] args) {

		int intNum1 = (int) (Math.random() * 100) + 1;
		
		//boolean 타입 초기화는 true;
		boolean bEven = true;
		
		bEven = (intNum1 % 2) == 0;
		
		
		/*
		 * 비교(조건) 명령문
		 * if(boolean) { }  ==> true 일 때 실행 
		 * else { }  ==> 그렇지 않으면 실행
		 * boolean 의 값이 true 인가 false 인가에 따라서
		 * 명령문을 선택적으로 실행할 수 있다.
		 */
		if(bEven) {
			System.out.println(intNum1 + " 는 짝수");
		}
		else {
			System.out.println(intNum1 + " 는 홀수");
		}
		
		if ( (intNum1 % 3) == 0) {
			System.out.println(intNum1 + " 는 3의 배수");
		}
		else {
			System.out.println(intNum1 + " 는 3의 배수가 아니다");
		}
		
		if( (intNum1 % 4  ) == 0 ) {
			System.out.println(intNum1 + " 는 4의 배수");
		}
		else if ( (intNum1 % 3) == 0 ) {
			System.out.println(intNum1 + " 는 3의 배수");
		} 
		else if ( (intNum1 % 2 ) == 0) {
			System.out.println(intNum1 + " 는 4의 배수 아님");
		System.out.println(intNum1 + " 는 3의 배수도 아님");
		System.out.println(intNum1 + " 는 2의 배수인 것 같음");
	}
	}
}
