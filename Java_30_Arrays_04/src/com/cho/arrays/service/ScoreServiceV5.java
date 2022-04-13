package com.cho.arrays.service;

import com.cho.arrays.utills.Line;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 
 * 등의 method를 선언하고
 * 임이ㅢ의 성적을 생성하여 intKor 에 저장
 * 성적일람표 출력
 * 총점 계산
 */
public class ScoreServiceV5 {

	private int[] intKor;
	
	public void makeScore(int n) {
		intKor = new int[n];
		for (int i = 0 ; i < n ; i ++) {
			intKor[i] = (int)(Math.random()*100)+1;
		}
		
	}
	
	public void printScore() {
		System.out.println("성적일람표");
		for (int i = 0; i <intKor.length;i++) {
			System.out.printf("%d번 학생의 국어 점수 : " + "%d" + "점.\n",i+1,intKor[i]);
		}
	}
	
	public int sumScore() {
		int intSum = 0;
		for (int i = 0; i < intKor.length;i++) {
			intSum += intKor[i];
		}
		
		return intSum;
	}
	
	
}
