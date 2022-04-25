package com.cho.app.controller;

import java.util.List;

import com.cho.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {

		ServiceV1 serviceV1 = new ServiceV1();
		serviceV1.makeScore();
		
		// 객체(method) chaining 을 사용하여 코드 줄이기
		System.out.println(serviceV1.getIntList().toString());
		// 위 아래는 같은 코드
		List<Integer> result = serviceV1.getIntList();
		System.out.println(result.toString());
		
	}
}
