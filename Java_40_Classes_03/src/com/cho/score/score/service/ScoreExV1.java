package com.cho.score.score.service;

import com.cho.score.score.domain.ScoreVOExV1;
import com.cho.score.utills.Line;

public class ScoreExV1{

	private ScoreVOExV1[] scores;
	
	public ScoreExV1() {
		this(10);
	}
	
	public ScoreExV1(int i) { //새로운 배열을 선언하고, 그 배열의 길이를 input하고, 그 배열을 초기화
		scores = new ScoreVOExV1[i];
		
		for (int a = 0 ; a < scores.length; a++) {
			scores[i] = new ScoreVOExV1();
		}
		
		
	}
	
	public ScoreExV1(String[] names) { // 여기서 names 는 이름속성만 가지고있는 이름의 배열
		
		int length = names.length;
		scores = new ScoreVOExV1[length];
		for(int i = 0 ; i < length;i++) {
			scores[i] = new ScoreVOExV1();  // 배열을 초기화 해줘야 사용할 수 있다.
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
		
		System.out.println("이름\t  국어\t  영어\t  수학\t  총점\t  평균\t");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < scores.length;i++) {
			
			System.out.printf("%s\t",scores[i].getStName());
			System.out.printf("%5d\t",scores[i].getIntKor() );
			System.out.printf("%5d\t",scores[i].getIntEng());
			System.out.printf("%5d\t",scores[i].getIntMath());
			System.out.printf("%6d\t",scores[i].getIntSum() );
			System.out.printf("%6.2f\n",scores[i].getfAvg());
		}
		
	
		
		 System.out.println(Line.dLine(50)); 
		 
		 float[] intEx = new float[scores.length];
		 
		 
			 for (int k = 0 ; k < scores.length; k++) {
				 intEx[0] += scores[k].getIntKor(); 
				 intEx[1] += scores[k].getIntEng(); 
				 intEx[2] += scores[k].getIntMath(); 
				 intEx[3] += scores[k].getIntSum(); 
				 intEx[4] += (float)(scores[k].getfAvg() / (float)scores.length); 
				 
			 }
			 System.out.print("총점\t");
			 for (int k = 0 ; k < scores.length-1; k++) {
				 System.out.printf("%5.0f\t",intEx[k]);
			 }
			 System.out.printf("%6.2f\n",intEx[intEx.length-1]);
			 System.out.println(Line.dLine(50));
	}
	
}
