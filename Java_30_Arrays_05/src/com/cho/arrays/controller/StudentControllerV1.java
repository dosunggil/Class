package com.cho.arrays.controller;

import com.cho.arrays.service.StudentServiceV1;

public class StudentControllerV1 {
	
	public static void main(String[] args) {

		// 기본 생성자를 호출하여 인스턴스 생성
		/* StudentServiceV1 sServiceV110 = new StudentServiceV1(); */
		
		
		// 임의 생성자를 호출하여 인스턴스 생성
		StudentServiceV1 sServiceV1 = new StudentServiceV1(2);
		sServiceV1.inputStudent();
		/* sServiceV1.printStudent(); */
		
		
	}

}

	