package com.cho.arrays;

public class ArraysV1 {

	public static void main(String[] args) {

		int[] intNums = new int[10];

		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		intNums[3] = 40;
		intNums[4] = 50;
		intNums[9] = 100;

		System.out.println(intNums[3]);
		System.out.println(intNums[8]);

		int intSum = intNums[1];
		intSum += intNums[2];
		intSum += intNums[9];

		System.out.println(intSum);

		intNums[8] = intSum;
		intNums[7] = intNums[3] + intNums[2] + intNums[0];

		System.out.println(intNums[7]);
		System.out.println(intNums[8]);

		/*
		 * intNums 에 저장된 값을 문자열로 바꾸어서 println 에 전달하고
		 * Console 에 출력하라
		 */
		System.out.println(intNums.toString());
		
		System.out.println(intNums);
	}
}
