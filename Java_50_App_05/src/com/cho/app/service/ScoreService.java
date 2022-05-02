package com.cho.app.service;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ScoreVO;
import com.cho.app.utills.Line;

public class ScoreService {

	private final List<ScoreVO> scList;

	public ScoreService() {
		List<ScoreVO> sclist = new ArrayList<>(); // ScoreVO(배열) 을 배열로 갖는 sclist 선언 후 초기화
		this.scList = sclist;
	}

	public void makeScore(int LL) {

		for (int i = 0; i < LL; i++) {
			ScoreVO scVO = new ScoreVO(); // ScoreVO 클래스 타입의 객체를 인스턴스화 , 그리고 초기화 
			scVO.setStNum(i+1);
			scVO.setStKor((int) (Math.random() * 50) + 50);
			scVO.setStEng((int) (Math.random() * 50) + 50);
			scVO.setStMath((int) (Math.random() * 50) + 50);
			scList.add(scVO);
		}
	}
	
	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t  평균");
		System.out.println(Line.sLine(50));
		
		int intSumKor = 0;
		int intSumEng = 0;
		int intSumMath = 0;
		int intSumSum = 0;
		for (ScoreVO vo : scList) { // scList list 의 요소는 하나하나가 ScoreVO 타입의 객체이므로 ScoreVO 타입의 객체 vo 를 scList 요소 하나하나에 비교해본다
			System.out.printf(" %2d\t",vo.getStNum());
			System.out.printf(" %3d\t",vo.getStKor());
			System.out.printf(" %3d\t",vo.getStEng());
			System.out.printf(" %3d\t",vo.getStMath());
			System.out.printf(" %3d\t",vo.getStMath()+vo.getStKor()+vo.getStEng());
			System.out.printf(" %3.2f\t",(float)(vo.getStMath()+vo.getStKor()+vo.getStEng())/3);
			System.out.println();
			intSumKor += vo.getStKor();
			intSumEng += vo.getStEng();
			intSumMath += vo.getStMath();
			intSumSum += intSumKor;
			intSumSum += intSumEng;
			intSumSum += intSumMath;
		}
		System.out.println(Line.sLine(50));
		System.out.printf(" 총점\t%d\t%d\t%d\t%4d\n",intSumKor,intSumEng,intSumMath,intSumSum);
		System.out.println(Line.dLine(50));
	}
}
