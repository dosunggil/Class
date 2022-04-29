package com.cho.app.controller;

import com.cho.app.service.ScoreService;

public class Controller {

	public static void main(String[] args) {
		
		ScoreService scSerivce = new ScoreService();
		
		scSerivce.makeScore(20);
		scSerivce.printScore();
	}
}
