package com.cho.controller;

/*
 * com.cho.service.ServiceV1 클래스의 method 를 여기에서 사용하겠다는 선언
 */
import com.cho.service.ServiceV1;

public class Method_03 {

	public static void main(String[] args) {
		
		// ServiceV1 클래스에서 선언된 add()와 multi() 를 호출
		int intSum = ServiceV1.add();
		int intMulti = ServiceV1.multi();
		System.out.println(intSum + intMulti);
	}
}
