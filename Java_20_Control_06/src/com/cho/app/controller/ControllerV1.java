package com.cho.app.controller;

import com.cho.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {
		
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intSum = serviceV1.scoreSum();
		
		System.out.println("\t점수의 총 합은 " + intSum + "점 입니다.");
	}
}
