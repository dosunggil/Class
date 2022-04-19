package com.cho.score.score.service;

import com.cho.score.score.domain.ScoreVOv2;
import com.cho.score.utills.Line;

public class ScoreServiceV1 {

	private ScoreVOv2[] scores;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int i) { //새로운 배열을 선언하고, 그 배열의 길이를 input하고, 그 배열을 초기화
		scores = new ScoreVOv2[i];
		
		for (int a = 0 ; a < scores.length; a++) {
			scores[i] = new ScoreVOv2();
		}
		
		
	}
	
	public ScoreServiceV1(String[] names) { // 여기서 names 는 이름속성만 가지고있는 이름의 배열
		
		int length = names.length;
		scores = new ScoreVOv2[length];
		for(int i = 0 ; i < length;i++) {
			scores[i] = new ScoreVOv2();  // 배열을 초기화 해줘야 사용할 수 있다.
			scores[i].setStName( names[i]);
		
		}
	}
	
	public void makeScore() {
		
		for(int a = 0; a<scores.length; a++) {
			int intKor = (int)(Math.random()*50) +51;
			int intEng = (int)(Math.random()*50) +51;
			int intMath = (int)(Math.random()*50) +51;
			
			scores[a].setIntKor(intKor);
			scores[a].setIntEng(intEng);
			scores[a].setIntMath(intMath);
			
		}
	}
	
	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("\t성적표");
		System.out.println(Line.sLine(50));
		
		System.out.println("이 름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < scores.length;i++) {
			
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n",scores[i].getfAvg());
		}
		
		System.out.println(Line.dLine(50));
		int[] intEx = new int[scores.length];
		for (int n = 0 ; n < intEx.length;n++ ) {
			for (int k = 0 ; k < scores.length; k++) {
				intEx[n] += scores[k];
			}
			
		}
	
	}
	
}
