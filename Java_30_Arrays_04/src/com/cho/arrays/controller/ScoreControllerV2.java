package com.cho.arrays.controller;

import com.cho.arrays.service.ScoreServiceV2;

public class ScoreControllerV2 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2();
		
		scoreServiceV2.makeScore();
		scoreServiceV2.printScore();
		
		
	}
}
