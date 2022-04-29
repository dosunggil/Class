package com.cho.app.exec;

public class Exec1 {

	/*
	 * 학생은 25명, 피자는 6조각 
	 * 6 4 24
	 * 6 5 30
	 * 6 6 36
	 * 6 7 42
	 * 
	 * 학생수가 25~50 명 가변
	 */
	public static void main(String[] args) {
		
		int stNums = (int)(Math.random()*25) + 25;
	//	int stNums = 43;
		int num = 6;
		int pizza = 0;
		if((stNums%num) != 0){
			pizza = stNums/num + 1;
		} else {
			pizza = stNums/num ;
		}
		
		System.out.println("학생 수가 " +stNums +" 명이니까 피자는 최소한 " + pizza + " 판 시켜야 하겠네요!");
	}
}
