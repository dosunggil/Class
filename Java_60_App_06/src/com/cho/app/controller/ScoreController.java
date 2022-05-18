package com.cho.app.controller;

import com.cho.app.service.ScoreService;
import com.cho.app.service.impl.ScoreServiceImplV1;

public class ScoreController {

	public static void main(String[] args) {
		
		
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore(10);
		scService.toString();
		
	}
}
