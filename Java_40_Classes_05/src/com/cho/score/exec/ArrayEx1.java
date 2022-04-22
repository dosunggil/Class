package com.cho.score.exec;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] intNums = new int[10];
		
		for (int i = 0 ; i < intNums.length ; i ++) {

			intNums[i] = (int)(Math.random()*100)+1;
			System.out.println(intNums[i]);
		}
		for (int i = 0 ; i < intNums.length-2 ; i ++) {
			System.out.printf("%d\t",intNums[i]);
		}
		System.out.println();
		
		// forEach : 확장된 for() 반복문
		// 이 코드는 전체 배열에 연산을 하고자 할 때,
		// 배열 요소에 값을 저장하고자 할 때는 사용할 수 없다.
		
		for (int num : intNums) {
			System.out.printf("%d\t",num);
		}
	}
}
