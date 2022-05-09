package com.cho.app.service.controller;

import com.cho.app.service.ScoreService;
import com.cho.app.service.impl.ScoreServiceImplV2;

public class SocreControllerV1 {

	public static void main(String[] args) {

		ScoreService scService = new ScoreServiceImplV2();
		
		scService.inputScore();
	}
}
