package com.cho.classes.exec;

public class String2IntV2 {

	public static void main(String[] args) {

		String strNum = "";
		int intNum = 0;
		
		if (strNum.equals("")) {
			System.out.println("오류1");

		} else {
			intNum = Integer.valueOf(strNum);
		}
		
		/*
		 * 만약 키보드 등을 사용하여 값을 입력할 때,
		 * 변수값 내에 공백이 포함되는 경우가 있을 것이다.
		 */
		if(strNum.equals("   ")) {
			System.out.println("오류2");
		}
	}
}
