package com.cho.score.score.exec;

import com.cho.score.score.domain.ScoreVOv2;

public class ExecV3 {

	public static void main(String[] args) {
		
		// vo 클래스를 사용하여 배열 선언하기
		ScoreVOv2[] scs = new ScoreVOv2[10];
		
		/*
		 * 배열로 선언된 객체는 아직 사용할 수 없다.
		 * 아래처럼 각각 생성자로 초기화시켜야 한다. (인스턴스화)
		 */
		scs[0] = new ScoreVOv2();
		scs[1] = new ScoreVOv2();
		scs[2] = new ScoreVOv2();
		scs[3] = new ScoreVOv2();
		
		
		
		scs[0].setStName("홍진영");
		scs[1].setStName("이춘향");
		scs[2].setStName("박명수");
		scs[3].setStName("서장훈");
	}
}
