package com.cho.arrays.controller;

import com.cho.arrays.service.ScoreServiceV1;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1() ;
		scoreServiceV1.makeScore();
		scoreServiceV1.printScore();
		
		
	}
}
