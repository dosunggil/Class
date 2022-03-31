package com.cho.controller;

public class Boolean_03 {
	
	public static void main(String[] args) {
		
		boolean bYes = true;
		boolean bWhat = bYes;
		
		// bYes에 저장된 값이 false 냐 물어보는 연산이 실행되고
		// 그 결과가 bWhat에 저장된다.
		bWhat = bYes == false;
		
		// bYes 에 저장된 값이 true가 아니냐? 라고 물어보는 연산
		// 결과는 false
		bWhat = bYes != true;
		
		// ! : Not 연산기호
		// boolean 형 데이터를 반전 시키는 연산
		// true가 담겨있으면 false, false 가 담겨있으면 true
		bWhat = !bYes;
		
		// ! 를 사용하여 변수 값을 반전
		bWhat = !bWhat;
		bWhat = !bWhat;
	}

}
