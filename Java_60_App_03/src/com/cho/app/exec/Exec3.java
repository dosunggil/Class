package com.cho.app.exec;

public class Exec3 {

	public static void main(String[] args) {

		int[] intArr = new int[10];
		int index = 0;
		int sum = 0;
		for (index = 0; index < intArr.length; index++) {
			intArr[index] = (int) (Math.random() * 100) + 1;
		}
		
		for(index = 0 ; index < intArr.length ; index ++) {
			System.out.println(index + " 번째 값은 : " + intArr[index]);
		}
		
		for(index = 0 ; index < intArr.length ; index ++) { 
			sum += intArr[index];
		}
		System.out.println("배열의 합은 : " + sum);
		System.out.println("배열의 평균 : " + (float)sum/intArr.length);
	}
}
