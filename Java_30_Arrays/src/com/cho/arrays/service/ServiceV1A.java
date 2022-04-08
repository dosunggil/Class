package com.cho.arrays.service;

public class ServiceV1A {

	
	/*
	 * private 으로 선언된 makeScore() 는 
	 * ServiceV1A 클래스 블럭({}) 에서만 호출할 수 있다.
	 * local method 라고 한다.
	 */
	private int makeScore() {
		return (int) (Math.random() * 100) + 1;

	}


	/*
	 * public 으로 선언된 scoreKorSum() 은
	 * 이 프로젝트 어디에서나 호출할 수 있다.
	 */
	public int scoreKorSum() {
		
		/*
		 * V1에서 Math.random() 를 사용하여 점수를 생성하는 코드를
		 * makeScore() 로 이전하고, 점수 생성이 필요한 경우
		 * makeScore() 를 호출하여 결과를 사용한다.
		 */
		int intKor1 = makeScore();
		int intKor2 = makeScore();
		int intKor3 = makeScore();
		int intKor4 = makeScore();
		int intKor5 = makeScore();

		int intKorSum = intKor1;
		intKorSum += intKor2;
		intKorSum += intKor3;
		intKorSum += intKor4;
		intKorSum += intKor5;

		return intKorSum;
	}
}
