package com.cho.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ScoreVO;
import com.cho.app.service.ScoreService;
import com.cho.app.utills.Line;

public class ScoreSerivceImplV1 implements ScoreService {
	
	/*
	 * Service 클래스에서 필요한 데이터를 클래스 영역에 선언할 때는
	 * final 키워드를 사용하자.
	 * final 키워드를 사용하면 혹시 모를 데이터 손상을 막을 수 있다.
	 * 또한 초기화 하지 않았을 때 발생하는 오류(NullPointerException)를 예방할 수 있다.
	 */
	
	// 리스트 객체를 final 로 선언하고
	private final List<ScoreVO> scList;
	
	public ScoreSerivceImplV1() {
		// 생성자에서 리스트 객체를 초기화하여
		// NullpointerException 사전에 예방한다.
		this.scList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
		
		for(int i = 0 ; i < 20 ; i ++) {
			
			int intKor =(int)(Math.random()*50)+51;
			int intEng =(int)(Math.random()*50)+51;
			int intMath =(int)(Math.random()*50)+51;
			
			// 생성된 세 과목의 점수를 VO 클래스를 생성하여 저장하기
			ScoreVO scVO = new ScoreVO();
			scVO.setIntStNum(i+1);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			int intSum = intKor + intEng + intMath;
			float fAvg = (float)intSum / 3;
			
			scVO.setIntSum(intSum);
			scVO.setfAvg(fAvg);
			
			scList.add(scVO);
		}
		
	}

	@Override
	public void printScore() {
		int size = scList.size();
		int lineLength = 50;
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("성적일람표");
		System.out.println(Line.sLine(lineLength));
		
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));
		
		int[] intTotal = new int[4];
		int KOR = 0;
		int ENG = 1;
		int MATH = 2;
		int SUM = 3;
		
		for(int i = 0 ; i <size ; i++) {
			
			ScoreVO scVO = scList.get(i);
			System.out.printf("%5d\t",scVO.getIntStNum());
			System.out.printf("%5d\t",scVO.getIntKor());
			System.out.printf("%5d\t",scVO.getIntEng());
			System.out.printf("%5d\t",scVO.getIntMath());
			System.out.printf("%5d\t",scVO.getIntSum());
			System.out.printf("%5.2f\t",scVO.getfAvg());
			
			intTotal[KOR] += scVO.getIntKor();
			intTotal[ENG] += scVO.getIntEng();
			intTotal[MATH] += scVO.getIntMath();
			intTotal[SUM] += scVO.getIntSum();
		}
		System.out.println(Line.sLine(lineLength));
		System.out.printf("%d\t%d\t%d\t%5.2f\n",intTotal[KOR],intTotal[ENG],intTotal[MATH],intTotal[SUM]);
		
		
	}

}
