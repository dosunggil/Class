package com.cho.arrays.controller;

import com.cho.arrays.service.ScoreServiceV4;

public class ScoreControllerV4 {

	public static void main(String[] args) {
		
		ScoreServiceV4 scoreServiceV4 = new ScoreServiceV4(2000);
		
		scoreServiceV4.makeScore();
		scoreServiceV4.printScore();
	}
}
