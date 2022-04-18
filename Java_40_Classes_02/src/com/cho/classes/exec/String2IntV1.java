package com.cho.classes.exec;

public class String2IntV1 {

	public static void main(String[] args) {
		
		
		/*
		 * 문자열 형 타입 변수를 숫자 타입으로 형변환 하기. 
		 */
		String strNum = "33";
		int intNum = Integer.valueOf(strNum);
		
		strNum = "33.2";
		float fNum = Float.valueOf(strNum);
		
		float fSum = intNum + fNum;
		
		System.out.println(fSum);
		
		
	}
}
