package com.cho.var;

public class Var_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
			
		
		/*
		 * ++변수 : 가장 먼저 실행된다
		 * 변수++ : 모든 명령이 실행된 후 마지막에 실행
		 */
		System.out.println(++num1);
		System.out.println(num1++);
		
		System.out.println("-----------------------------");
		num1 = 0;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 = 0;
		num1 = num1++ * 3;
		System.out.println(num1);

	}

}
