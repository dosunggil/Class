package com.cho.arrays.controller;

import com.cho.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {

	public static void main(String[] args) {
		
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5();
		
		int intSum = 0;
		scoreServiceV5.makeScore(19);
		scoreServiceV5.printScore();
		intSum = scoreServiceV5.sumScore();
		
		System.out.println("학생들의 국어점수의 합은 " + intSum + "점 입니다.");
	}
}
