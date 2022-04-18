package com.cho.classes.controller;

import com.cho.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3 = new ScoreServiceV3(20);
		
		/*
		 * String[] strNames = new String[5]; 
		 * strNames[0] = "홍길동";
		 */
		String[] strNames = {"홍길동","이몽룡","성춘향","김삿갓","이순신"};
		
		scServiceV3 = new ScoreServiceV3(strNames);
	}
}
