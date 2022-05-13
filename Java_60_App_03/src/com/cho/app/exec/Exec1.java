package com.cho.app.exec;

public class Exec1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 100) + 1;
			if (num1 % 2 == 0) {
				System.out.println(num1 + "은(는) 짝수입니다.\n");
			} else if (num1 % 2 == 1) {
				System.out.println(num1 + "은(는) 홀수입니다.\n");
			}
		}
	}
}
