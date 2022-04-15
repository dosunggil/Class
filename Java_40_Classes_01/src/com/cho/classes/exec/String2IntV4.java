package com.cho.classes.exec;

public class String2IntV4 {

	public static void main(String[] args) {
		
		// 숫자 앞에 + , - 는 기호가 아닌 숫자의 양음수 부호이다.
		String strNum ="-3";
		strNum = "+3";
		// +, - 이외의 기호는 오류 발생
		strNum = "*3";
		int intNum = Integer.valueOf(strNum);
	}
}
