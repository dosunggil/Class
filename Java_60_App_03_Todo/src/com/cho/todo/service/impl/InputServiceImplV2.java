package com.cho.todo.service.impl;

public class InputServiceImplV2 extends InputServiceImplV1{


	/*
	 * V1 클래스의 생성자를 호출하여 scan 을 초기화 실행
	 * 
	 */
	public InputServiceImplV2() {
		super();
	}
	
	

	@Override
	public String inputContent() {
		
		System.out.println("할일(QUIT : 종료) >> ");
		String content = scan.nextLine();
		
		return content;
	}

}
