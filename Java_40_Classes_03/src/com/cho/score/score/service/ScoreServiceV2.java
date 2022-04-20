package com.cho.score.score.service;

import com.cho.score.score.domain.ScoreVOv2;
import com.cho.score.utills.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {

	
	public ScoreServiceV2() {
	}
	
	public ScoreServiceV2(int i) { //새로운 배열을 선언하고, 그 배열의 길이를 input하고, 그 배열을 초기화
		scores = new ScoreVOv2[i];
		
		for (int a = 0 ; a < scores.length; a++) {
			scores[i] = new ScoreVOv2();
		}
		
		
	}
	
	public ScoreServiceV2(String[] names) { // 여기서 names 는 이름속성만 가지고있는 이름의 배열
		
		int length = names.length;
		scores = new ScoreVOv2[length];
		for(int i = 0 ; i < length;i++) {
			scores[i] = new ScoreVOv2();  // 배열을 초기화 해줘야 사용할 수 있다.
			scores[i].setStName( names[i]);
		
		}
	}
	
	
	
	public void printScore() {
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		float avgResult = 0;
		
		System.out.println(Line.dLine(50));
		System.out.println("\t성적표");
		System.out.println(Line.sLine(50));
		
		System.out.println("이 름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < scores.length;i++) {
			
			System.out.printf("%s\t",scores[i].getStName() );
			System.out.printf("%4d\t",scores[i].getIntKor() );
			System.out.printf("%4d\t",scores[i].getIntEng() );
			System.out.printf("%4d\t",scores[i].getIntMath());
			System.out.printf("%4d\t",scores[i].getIntSum() );
			System.out.printf("%4.2f\n",scores[i].getfAvg() );
			
			korTotal += scores[i].getIntKor();
			engTotal += scores[i].getIntEng();
			mathTotal += scores[i].getIntMath();
			sumTotal += scores[i].getIntSum();
			
			avgResult += scores[i].getfAvg();
		}
		System.out.println(Line.sLine(50));
		System.out.printf("%s","총점");
		System.out.printf("%6d\t",korTotal );
		System.out.printf("%4d\t",engTotal);
		System.out.printf("%4d\t",mathTotal);
		System.out.printf("%4d\t",sumTotal);
		System.out.printf("%4.2f\n",avgResult / scores.length);
		System.out.println(Line.dLine(50));
		
	
	
	}
	
}
