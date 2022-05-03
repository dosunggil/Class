package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ScoreVO;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		// 한사람의 성적을 저장할 VO 객체 생성
		ScoreVO scVO = new ScoreVO();
		scVO.setStNum("1");
		scVO.setIntKor(90);
		scVO.setIntEng(80);
		scVO.setIntMath(85);
		
		// 5명의 학생의 성적을 저장할 VO 배열 선언
		ScoreVO[] scVOs = new ScoreVO[5];
		
		// scVOs 배열의 0번 요소를 객체로 생성하기(초기화하기) 
		// 이게 빠지면 nullpointException
		scVOs[0] = new ScoreVO();
		
		scVOs[0].setStNum("2");
		scVOs[0].setIntKor(99);
		scVOs[0].setIntEng(85);
		scVOs[0].setIntMath(70);
		
		scVOs[1] = new ScoreVO();
		scVOs[1].setStNum("3");
		scVOs[1].setIntKor(80);
		scVOs[1].setIntEng(77);
		scVOs[1].setIntMath(89);
		
		// 다수의 학생의 성적을 저장할 VO List 를 생성
		List<ScoreVO> scList = new ArrayList<>();
		ScoreVO scVO1 = new ScoreVO();
		scVO1.setStNum("4");
		scVO1.setIntKor(90);
		scVO1.setIntEng(10);
		scVO1.setIntMath(60);
		scList.add(scVO1);
		
		scVO1 = new ScoreVO();
		scVO1.setStNum("5");
		scVO1.setIntKor(80);
		scVO1.setIntEng(70);
		scVO1.setIntMath(60);
		scList.add(scVO1);
		
	}
}
