package com.cho.app.exec;

public class Exec2 {

	/*
	 * 정수형 배열 10개를 생성하고
	 * 각 요소에 1~100 까지 임의정수를 생성하여 저장하고
	 * 배열에 저장된 요소의 값을 모두 합산하여 출력
	 */
	public static void main(String[] args) {
		
		int[] intAr = new int[10];
		int intSum = 0;
		int intSum2 = 0;
		for(int i = 0 ; i < intAr.length ; i++) {
			intAr[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i =0 ; i < intAr.length ; i ++) {
			intSum += intAr[i];
		}
		
		for(int i : intAr) {
			intSum2 += i;
		}
		
		System.out.println(intSum);
		
		System.out.println(intSum2);
	}
}
