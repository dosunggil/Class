package com.cho.score.score.controller;

import com.cho.score.score.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		String[] stNames = {"홍길동","이몽룡","성춘향","임꺽정","박명자"};
		ScoreServiceV1 scService = new ScoreServiceV1(stNames);
		scService.makeScore();
		scService.printScore();
		
	}
}
