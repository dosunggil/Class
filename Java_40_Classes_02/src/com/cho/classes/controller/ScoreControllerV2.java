package com.cho.classes.controller;

import com.cho.classes.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {

		ScoreServiceV2 scSerV2 = new ScoreServiceV2(3);
		
		int intResult = scSerV2.input();
		if(intResult < 0) {
			System.out.println("입력을 중단했습니다.");
		} else {
			System.out.println("입력 완료");
		}
		scSerV2.print();
	 	
	
	}}

	
