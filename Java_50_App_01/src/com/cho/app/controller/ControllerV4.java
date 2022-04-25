package com.cho.app.controller;

import com.cho.app.service.ServiceV4;

public class ControllerV4 {

	public static void main(String[] args) {
		
		int[] scoreList = new int[10];
		
		ServiceV4 sV4 = new ServiceV4(scoreList);
		sV4.makeScore();
	
		for (int aa : scoreList) {
			System.out.println(aa);
		}
		// 배열도 참조형 변수
	}
}
