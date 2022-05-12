package com.cho.todo.exec;

import com.cho.todo.model.TodoVO;

public class VarEx1 {

	public static void main(String[] args) {
		
		//primitive 변수, 기본형 변수
		// 순수하게 값을 저장하는 용도로만 사용하는 변수
		int num1;
		long num2;
		float num3;
		num3 = 3.1f;
		
		// 클래스 Type 변수, 참조형 변수
		// 몇 가지 method 나 속성들이 자동으로 생성되어
		// 사용할 수 있도록 미리 구성된다.
		
		// wrapper 클래스 변수
		Integer num4 = 100;
		System.out.println(num4.toString());
		System.out.println(num4 + "");
		Long num5;
		Float num6;
		
		// TOdoVO클래스 변수
		TodoVO toVO = new TodoVO();
		toVO.setSdate("2022-05-12");
		
		// 배열
		int[] nums = new int[10];
		System.out.println(nums.length);
		
	}
	
}
