package com.cho.app.exec;

public class Exec21 {

	public static void main(String[] args) {
		int money = 5_223_230;
		div(money);
	}

	public static void div(int mmoney) {

		System.out.println("급여 " + mmoney+ " 원을 다음과 같이 지급하겠습니다.");
		int n = 0;
		int div = 50_000;
		int index = 1;
		while (div > 9) {
			n = mmoney / div;
			mmoney -= n * div;
			System.out.printf("%5d원 : %3d 매\n",div,n);
			
			if (index%2 != 0) {
				div = div / 5;
			} else {
				div = div / 2;
			}
			index++;

		}
	}
}