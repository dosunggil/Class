package com.cho.controller;

import com.cho.service.ServiceV2;

public class ControllerV1 {

	public static void main(String[] args) {
		
//		ServiceV1 serviceV1 = new ServiceV1();
//		
//		serviceV1.guguDan();
		
		ServiceV2 serviceV2 = new ServiceV2();
		
		serviceV2.guDan(9);
	
	}
}
