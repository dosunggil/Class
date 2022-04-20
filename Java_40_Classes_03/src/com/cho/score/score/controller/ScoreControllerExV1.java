package com.cho.score.score.controller;

import com.cho.score.score.service.ScoreExV1;

public class ScoreControllerExV1 {

	public static void main(String[] args) {
		
		String[] stNames = {"홍씨","이씨","장씨","김씨","임씨"};
		ScoreExV1 scEx = new ScoreExV1(stNames);
		
		scEx.makeScore();
		scEx.printScore();
	}
}
