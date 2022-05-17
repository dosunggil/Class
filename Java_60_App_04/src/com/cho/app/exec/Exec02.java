package com.cho.app.exec;

public class Exec02 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100) + 1;
		}

		int index = 0;
		int evenSum = 0;

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) {
				index++;
				evenSum += intArr[i];
			}
		}

		System.out.println("배열 intArr 에 담긴 숫자 중 짝수의 개수 : " + index + "개");
		System.out.println("배열 intArr 에 담긴 숫자 중 짝수들의 합 : " + evenSum);
	}

}
