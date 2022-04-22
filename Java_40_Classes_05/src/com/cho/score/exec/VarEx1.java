package com.cho.score.exec;

import com.cho.score.controller.domain.StudentVO;
import com.cho.score.service.ScoreService;
import com.cho.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {

	public static void main(String[] args) {
		
		// primitive(기본) type keyword
		// primitive type 변수 선언
		int num1 = 100;
		float num2 = 100.3f;
		boolean bYes = true;
		
		// class type keyword
		// class type 변수 선언
		// 참조형 변수 선언
		Integer intNum1 = 100;
		Float fNum2 = 100.3f;
		Boolean bYes1 = true;
		
		String str = "Korea";
		StudentVO stVO = new StudentVO();
		
		StudentVO[] stList = new StudentVO[10];
		
		ScoreService scSerivce = new ScoreServiceImplV1(); 
			
	
		
	}
}
