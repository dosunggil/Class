package com.cho.app.controller;

import com.cho.app.service.ServiceV2;

public class ControllerV2 {

	public static void main(String[] args) {
		
		int sum = sum();
		System.out.println(sum);
		
		ServiceV2 serviceV2 = new ServiceV2();
		
		
		// ServiceV2 클래스의 sum() 은 private 이기 때문에 호출할 수 없다.
		// num2 = serviceV2.sum();
		
		// ServiceV2 클래스의 add() 는 한정자 생략이기 때문에 다른 Package 에서 호출할 수 없다. (같은 Package 에서만 호출 가능)
		// int add = serviceV2.add();
	}
	
	private static int sum() {
		
		return 30+ 40;
	}
}
