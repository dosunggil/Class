package com.cho.score.exec;

import java.util.List;

import com.cho.score.controller.domain.StudentVO;

public class VarEx3 {

	public static void main(String[] args) {
		
		// primitive type 변수들
		int num1;
		float num2;
		double num3;
		long num4;
		
		boolean bYes;
		char char1;
		
		// 기본형 변수들을 감싸고 있는 class.
		// wrapper 클래스
		Integer num11;
		Float num22;
		Double num33;
		Long num44;
		
		Boolean bYes1;
		Character char11;
		
		/*
		 * <> : Generic(제네릭).
		 * 제네릭에는 Object type 을 선언할 수 있다.
		 * 하지만 그렇게 하지 않는다.
		 * 왜? 메모리 관리, 유효성 관리 등이 어렵기 때문.
		 * 
		 */
		List<Object> objList;
		
		// 데이터의 유효성 검사
		List<Integer> intList;
		// Integer type 만 add 할 수 있다.
		// intList.add(30.0f);
		
		/*
		 * stList 에는 StudentVO type 의 데이터만 추가할 수 있다.
		 * 만약 다른 type 의 데이터가 추가되면 오류가 난다.
		 * 
		 * 이러한 기능을 사용하지 않으면
		 * stList 에 저장된 데이터가 유효한지 잘못 되었는지 걱정해야한다.
		 * 
		 * 사전에 제네릭을 선언함으로써
		 * 개발자는 데이터에 대한 유효성 문제를 걱정하지 않아도 된다.
		 * 
		 * 즉 stList 에 담긴 학생 정보들은 "무결성" 을 유지한다.
		 */
		List<StudentVO> stList;
	}
}
