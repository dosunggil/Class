package com.cho.controller;

public class Method_02 {

	public static void main(String[] args) {

		int intAdd = 0;
		int intMulti = 0;
		int intPower = 0;

		intAdd = add();
		intMulti = multi();
		intPower = intAdd + intMulti;

		System.out.println(intPower);
	}

	public static int add() {
		int intNum1 = 0;
		int intNum2 = 0;

		intNum1 = (int) ((Math.random() * 100) + 1);
		intNum2 = (int) ((Math.random() * 100) + 1);

		return intNum1 + intNum2;
	}

	public static int multi() {
		int intNum1 = 0;
		int intNum2 = 0;

		intNum1 = (int) ((Math.random() * 100) + 1);
		intNum2 = (int) ((Math.random() * 100) + 1);

		return intNum1 * intNum2;
	}
}
