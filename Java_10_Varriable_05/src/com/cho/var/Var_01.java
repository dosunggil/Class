package com.cho.var;

public class Var_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double douNum1 = 0;
		double douNum2 = 0;

		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;

		System.out.println(douNum1);
		System.out.println(douNum2);
		System.out.println("\t" + (douNum1 + douNum2));
		System.out.println("\t" + (douNum1 - douNum2));
		System.out.println("\t" + (douNum1 * douNum2));
		System.out.println("\t" + (douNum1 / douNum2));

	}

}
