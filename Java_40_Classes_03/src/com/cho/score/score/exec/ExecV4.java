package com.cho.score.score.exec;

import com.cho.score.score.domain.ScoreVOv2;

public class ExecV4 {

	
	public static void main(String[] args) {
		
		
		// ScoreVOv2 클래스를 사용하여 100개의 배열객체 선언
		ScoreVOv2[] scs = new ScoreVOv2[100];
		
		//배열개체 모든 요소를 생성자를 호출하여 초기화
		for(int i=0; i <scs.length;i++) {
			scs[i] = new ScoreVOv2();
		}
		
	}
}
