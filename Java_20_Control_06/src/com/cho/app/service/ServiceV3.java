package com.cho.app.service;

/*
 * 
 */
public class ServiceV3 {

	public int scoreSum() {
		
		int intKor = (int)(Math.random()*100) +1;
		int intEng = (int)(Math.random()*100) +1;
		int intMath = (int)(Math.random()*100) +1;
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	}
	
	public void scorePrint() {
		
		/*
		 * String(문자열) type 의 변수의 실체는
		 * String 클래스 type 의 인스턴스 이다.
		 * String 클래스에는 문자열을 다루는 다양한 method 들이 포함되어 있다.
		 */
		String dLine = "=";
		String sLine = new String("-");
		int intKor = (int)(Math.random()*100) +1;
		int intEng = (int)(Math.random()*100) +1;
		int intMath = (int)(Math.random()*100) +1;
		
		System.out.println(dLine.repeat(50));
		System.out.println("철수의 성적표");
		System.out.println(sLine.repeat(50));
		System.out.println("국어 : \t " + intKor);
		System.out.println("영어 : \t " + intEng);
		System.out.println("수학 : \t " + intMath);
		System.out.println(sLine.repeat(50));

		// 현재 클래스의 총점 계산 method 를 호출하여 총점 받아오기
		int intSum = scoreSum() ;
		System.out.println("총점 : \t" + intSum);
		System.out.println(dLine.repeat(50));
	}
}
