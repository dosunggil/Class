package com.cho.arrays.exec;

public class ExecV5 {

	public static void main(String[] args) {

		int[] intSum = new int[100];
		int intSum2 = 0;
		int intSum3 = 0;

		for (int i = 0; i < intSum.length; i++) {

			intSum[i] = i+1;
		}

		for (int i = 0; i < intSum.length; i++) {

			intSum2 += intSum[i];
		}
		
		for (int i = 1; i< 101 ; i++) {
			intSum3 += i ;
		}
		System.out.println(intSum2);
		System.out.println(intSum3);
	}
	
}


/*






*/