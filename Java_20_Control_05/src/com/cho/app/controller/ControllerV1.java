package com.cho.app.controller;

import com.cho.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {
		
		/*
		 * ServiceV1 클래스의 method 를 사용하기 위한 준비
		 * 
		 * ServiceV1 클래스의 인스턴스 생성
		 * 		1. 클래스를 사용하여 변수처럼 객체(object)를 선언
		 * 		2. new 키워드와 생성자 method를 사용하여
		 * 		3. 객체를 인스턴스화 시킨다.
		 */
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intSum = 0;
		intSum = serviceV1.scoreSum();
		
		System.out.println(intSum);
		
		// void type 의 method 는 항상 단독으로 호출한다.
		// 결과를 변수에 담을 수 없다.
		serviceV1.scorePrint();
		
		/*
		 * scoreSum() 는 return type 이 int 형이다
		 * 아래의 코드는 결과(return)를 받아 수행하는 코드가 없다.
		 * 그래서 결과를 확인할 수 없다.
		 */
		serviceV1.scoreSum();
		
		// scoreSum() 이 return 한 결과를
		// 어딘가의 기억장소에 저장하고 내용을 Console 에 출력
		System.out.println(serviceV1.scoreSum());
		
		
	}
}
