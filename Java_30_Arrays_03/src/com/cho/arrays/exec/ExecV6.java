package com.cho.arrays.exec;

public class ExecV6 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		int index = 0;

		System.out.println("===========================================");
		System.out.println("짝수 리스트");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = (int) (Math.random() * 100) + 1;
			
			if((intNums[i]%2)==0) {
				System.out.print(intNums[i]+",\t");
				index++;
				if((index%5)==0) {
					System.out.println("\n");
				}
			}
		}
		System.out.println("\n===========================================");
	}
}