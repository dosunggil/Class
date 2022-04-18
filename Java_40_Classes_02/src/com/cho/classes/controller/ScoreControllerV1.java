package com.cho.classes.controller;

import com.cho.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		ScoreServiceV1 scSerV1 = new ScoreServiceV1(3);
		
		//scSerV1.input();
		int intResult = scSerV1.input();
		if( intResult <0) {
			System.out.println("입력 도중 중단함");
		} else {
			System.out.println("입력을 모두 마침");
		}
		scSerV1.print();
	}
}
