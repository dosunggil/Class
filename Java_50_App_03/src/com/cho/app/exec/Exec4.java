package com.cho.app.exec;

public class Exec4 {

	/*
	 * 1~100 까지 임의의 수를 생성하고
	 */
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100)+1;
		int result = 0;
		for(int i = 2 ; i < num ; i ++) {
			if((num%i) == 0) {
				result ++;
			}
		}
		if(result != 0) {
			System.out.println(num + " 은(는) 소수가 아닙니다 ㅋ");
		} else {
			System.out.println(num + " 은(는) 소수입니다 ㅋ");
		}
	}
}
