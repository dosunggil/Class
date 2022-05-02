package com.cho.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ScoreVO;
import com.cho.app.service.ScoreService;
import com.cho.app.utills.Line;

public class ScoreServiceImplV2 implements ScoreService {

	// protected 는 상속해주기 위해 설계된 클래스에서
	// 상속받은 클래스와 변수를 공유하기 위한 방법이다.
	// 기본 속성은 private 과 같다.
	protected final int stCount;
	protected final List<ScoreVO> scList;
	
	protected final int lineLength;
	protected final String[] sub;
	

	public ScoreServiceImplV2() {
		// TODO Auto-generated constructor stub
		this.scList = new ArrayList<>();
		this.stCount = 20;
		this.sub = new String[]{"학번","국어","영어","수학","총점","평균"};
		lineLength = 50;
		
	}

	private int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		for (int i = 0; i < stCount; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setIntStNum(i + 1);
			scVO.setIntKor(getScore());
			scVO.setIntEng(getScore());
			scVO.setIntMath(getScore());
			scList.add(scVO);
		}

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

		
		System.out.println(Line.dLine(lineLength));
		System.out.println("성적일람표");
		System.out.println(Line.sLine(lineLength));
		for(String su : sub) {
			System.out.print(su+"\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		for(ScoreVO scVO : scList) {
			System.out.printf("%5d\t",scVO.getIntStNum());
			System.out.printf("%5d\t",scVO.getIntKor());
			System.out.printf("%5d\t",scVO.getIntEng());
			System.out.printf("%5d\t",scVO.getIntMath());
			System.out.printf("%5d\t",scVO.getIntSum());
			System.out.printf("%5.2f\n",scVO.getfAvg());
			korTotal += scVO.getIntKor();
			engTotal += scVO.getIntEng();
			mathTotal += scVO.getIntMath();
			sumTotal += scVO.getIntSum();
		}
		System.out.printf("%5d\t",korTotal);
		System.out.printf("%5d\t",engTotal);
		System.out.printf("%5d\t",mathTotal);
		System.out.printf("%5d\t",sumTotal);
	}

}
