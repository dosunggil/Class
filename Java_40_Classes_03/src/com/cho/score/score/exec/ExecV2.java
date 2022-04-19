package com.cho.score.score.exec;

import com.cho.score.score.domain.ScoreVOv2;

public class ExecV2 {

	public static void main(String[] args) {
		
		ScoreVOv2 stNum1 = new ScoreVOv2();
		stNum1.setStName("홍길동");
		System.out.println(stNum1.getStName()); 	
		

		ScoreVOv2 stNum2 = new ScoreVOv2();
		stNum2.setStName("이춘향");
		System.out.println(stNum2.getStName()); 	
		
		stNum1.setIntKor(90);
		stNum2.setIntKor(100);
		stNum1.setIntEng(40);
		stNum2.setIntEng(30);
		stNum1.setIntMath(80);
		stNum2.setIntMath(60);
		
		System.out.println(stNum1.toString());
		System.out.println(stNum2.toString());
		
	}
}
