package com.cho.classes.exec;

public class Stirng2IntV1 {

	public static void main(String[] args) {
		
		String strAge ="";
		int intAge = 33;
		
		// 숫자형 변수 + "문자열" = 숫자값을 문자열형 으로 저장
		strAge = ""+intAge;
		
		// Integer 클래스에 선언된 toString() 에게 정수값을 전달하여 문자열로 return
		strAge = Integer.toString(intAge);
		
		System.out.println(strAge);
		
		strAge = "5";
		intAge = Integer.valueOf(strAge);
		System.out.println(intAge);
		
		System.out.println(Integer.toBinaryString(5522));
		
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
		int intSum = num1 + num2;
		
		String strSum = Integer.toBinaryString(intSum);
		
		int intBinNum1 = Integer.valueOf(strBinNum1);
		int intBinNum2 = Integer.valueOf(strBinNum2);
		
		
		
		System.out.printf("   %s\n",strBinNum1);
		System.out.printf(" + %s\n ", strBinNum2);
		System.out.println("-".repeat(20));
		System.out.println("   " + strSum);
	}
}
