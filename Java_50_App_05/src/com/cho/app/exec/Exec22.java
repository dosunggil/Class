package com.cho.app.exec;

public class Exec22 {

	public static void main(String[] args) {
		int money = 3_136_510;
		div(money);
	}
	
	
	
	public static void div(int mmoney) {
	
		
		int fiveM = 0; // 5만원권
		int oneM = 0; // 1만원권
		int fiveS = 0; // 5천원권
		int oneS = 0; // 1천원권
		int fiveH = 0; // 500원권
		int oneH = 0; // 100원권
		int fiveT = 0; // 50원권
		int oneT = 0; // 10원권 
		
		fiveM = mmoney/50_000;
		mmoney -= fiveM*50_000;
		oneM = mmoney/10_000;
		mmoney -= oneM*10_000;
		fiveS = mmoney/5_000;
		mmoney -= fiveS*5_000;
		oneS = mmoney/1_000;
		mmoney -= oneS*1_000;
		fiveH = mmoney/500;
		mmoney -= fiveH*500;
		oneH = mmoney/100;
		mmoney -= oneH*100;
		fiveT = mmoney/50;
		mmoney -= fiveT*50;
		oneT = mmoney/10;
		mmoney -= oneT*10;
		
		System.out.println("급여 %d 원을 다음과 같이 지급합니다.\n50,000원 : " + fiveM +"매");
		
	}
}
