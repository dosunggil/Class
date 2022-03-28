package com.cho.var;

public class Var_05 {
	
	public static void main(String[] args) {
		
		// 기본 실수 타입(소수점 이하 13자리)
		double douNum = 30;
		int intNum = (int)douNum ; //실수형 값을 강제로 정수형에 저장
		
		// 실수타입의 변수가 필요하기는 한데
		// 굳이 소수점 이하 13자리 까지는 필요 없다.
		// float 는 소숫점 7자리 까지만 표현
		float floNum = 30;
		
		floNum = (float) Math.random();
		System.out.println(floNum);
		
	}

}
