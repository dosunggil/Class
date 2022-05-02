package com.cho.app.service.impl;

import com.cho.app.model.ScoreVO;
import com.cho.app.utills.Line;

/*
 * V2 클래스를 상속받는 순간
 * makeScore(), printScore() 를 기본으로 사용할 수 있
 */
public class ScoreServiceImplV3 extends ScoreServiceImplV2{

	public ScoreServiceImplV3() {
		
		/*
		 * super() :
		 * 상속받은(V2) 클래스의 기본생성자를 호출하여 protected 로 선언된 변수들을 초기화한다.
		 */
		super();
	}
	
	@Override
	public void printScore() {

		System.out.println(Line.dLine(lineLength));
		System.out.println("성적일람표");
		System.out.println(Line.sLine(lineLength));
		
		for(String su : sub) {
			System.out.print(su + "\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		
		for(ScoreVO scVO : scList) {
			System.out.print(scVO.toString());
			korTotal += scVO.getIntKor();
			engTotal += scVO.getIntEng();
			mathTotal += scVO.getIntMath();
			sumTotal += scVO.getIntSum();
		}
		System.out.println(Line.sLine(lineLength));
		System.out.printf("%5d",korTotal);
		System.out.printf("%5d",engTotal);
		System.out.printf("%5d",mathTotal);
		System.out.printf("%5d\n",sumTotal);
		System.out.println(Line.dLine(lineLength));
	}
}
