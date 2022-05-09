package com.cho.app.service.controller;

import com.cho.app.service.ScoreService;
import com.cho.app.service.impl.ScoreServiceImplV4;

public class ScoreControllerV4 {

	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV4();
		scService.inputScore();
		scService.saveScore();
	}
}
