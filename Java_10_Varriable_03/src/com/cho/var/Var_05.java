package com.cho.var;

public class Var_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		
		/*
		 *  아래 명령문이 실행되면 앞에서 num1에 저장된 1이 일단 출력되고
		 *  println() 명령이 실행이 끝나면 비로소 num1++ 가 실행된다
		 */
		System.out.println(num1++);
		
		num1 = 0;
		System.out.println(num1);
		
		num1 += 1;
		System.out.println(num1);

	}

}
