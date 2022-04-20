package com.cho.score.score.controller;

import com.cho.score.score.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		
		String[] stNames = {"홍씨","이씨","장씨","김씨","임씨"};
		
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2(stNames);
		
		scServiceV2.makeScore();
		scServiceV2.printScore();
		
	}
}
