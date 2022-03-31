package com.cho.method;

public class Method_01 {
	
	public static void main(String[] args) {
		
		System.out.println(num());
		System.out.println(add());
		
		System.out.println(Math.random());
		
		double num1 = doNum();
		
		
	} // end main()
	
	/*
	 * num() 선언
	 * num()를 선언할 때는 public static int 키워드가 선행된다
	 * 		num()의 이름은 변수 이름짓기 규칙과 동일하다.
	 */
	public static int num() {
		
		return 100;
	}
	
	public static double doNum() {
		
		return 100.0;}

	public static int add() {
		
		int num1 = 200;
		int num2 = 300;
		return num1 + num2;
	}
	}
