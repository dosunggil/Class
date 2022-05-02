package com.cho.app.controller;

import com.cho.app.service.ScoreService;
import com.cho.app.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();
	}

}
