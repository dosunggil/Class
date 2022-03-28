package com.cho.var;

public class Var_04 {
	
	public static void main(String[] args) {
		
		double douRnd = Math.random() * 10;
		System.out.println(douRnd);
		double douRnd1 = Math.random() * 1000;
		System.out.println(douRnd1);
		
		
		/*
		 * 강제 형 변환 (실수 - > 정수) 또는 명시적 형 변환
		 * (int)실수값;
		 * 
		 * 
		 * 실수값을 정수변수에 저장하면
		 * 기억장치의 크기때문에 오류가 발생한다.
		 * 
		 * 
		 * 자연 형 변환 ( 정수 -> 실수) 또는 암시적 형 변환
		 */
		int intRnd = (int)douRnd1;
		System.out.println(intRnd);
		
		
		
	}

}
