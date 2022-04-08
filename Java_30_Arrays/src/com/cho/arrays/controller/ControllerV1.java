package com.cho.arrays.controller;

import com.cho.arrays.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {

		ServiceV1 serviceV1 = new ServiceV1();

		int intKorSum = serviceV1.scoreKorSum();

		System.out.println(intKorSum);

	}
}
