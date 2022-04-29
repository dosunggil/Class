package com.cho.app.exec;

public class Exec2 {

	public static void main(String[] args) {
		
		int money = 3_130_510;
		System.out.println(money);
		int fiveM = 0; // 5만원권
		int oneM = 0; // 1만원권
		int fiveS = 0; // 5천원권
		int oneS = 0; // 1천원권
		int fiveH = 0; // 500원권
		int oneH = 0; // 100원권
		int fiveT = 0; // 50원권
		int oneT = 0; // 10원권 
		
		fiveM = money / 50_000;
		System.out.println(fiveM);
		
		money -= 50_000 * fiveM;
		System.out.println(money);
		
		oneM = money / 10_000;
		System.out.println(oneM);
		
		money -= 10_000 * oneM;
		System.out.println(money);
		
		 
	}
}
