package com.cho.controller;

public class Method_01 {

	public static void main(String[] args) {

		int intNum1 = num();
		System.out.println(intNum1);
	}

	public static int num() {

		int intNum1 = 0;
		int intNum2 = 0;

		intNum1 = (int) ((Math.random() * 100) + 1);
		intNum2 = (int) ((Math.random() * 100) + 1);

		return intNum1 + intNum2;
	}
}
