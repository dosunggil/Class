package com.cho.classes.controller;

import com.cho.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1(3);
		scoreServiceV1.input();
		scoreServiceV1.print();
		
	}
}
