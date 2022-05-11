package com.cho.todo.service.impl;

import java.util.Scanner;

import com.cho.todo.service.InputService;
import com.cho.utils.Line;

public class InputServiceImplV1 implements InputService{

	protected final Scanner scan;
	
	public InputServiceImplV1() {
		this.scan = new Scanner(System.in);
	}
	
	@Override
	public Integer menu() {
		System.out.println(Line.dLine(50));
		System.out.println("업무를 선택하세요");
		System.out.println(Line.sLine(50));
		
		System.out.println("1. TODO 추가하기.");
		System.out.println("2. TODO List 보기.");
		System.out.println("3. Key 로 검색하기.");
		System.out.println("4. 완료처리하기.");
		System.out.println("5. 종료하기.");
		System.out.println(Line.sLine(50));
		System.out.print("선택 >> ");
		
		String strMenu = scan.nextLine();
		Integer intMenu = 0;
		
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}
		return intMenu;
	}

	@Override
	public String inputContent() {
		
		System.out.println("할일 >> ");
		String content = scan.nextLine();
		
		return content;
	}

	@Override
	public Integer selectTodo() {
		System.out.println(Line.dLine(50));
		System.out.print("할일선택(QUIT:종료)");
		String selectNum = scan.nextLine();
		Integer intNum = 0 ;
		
		if(selectNum.equals("QUIT")) return -1;
		try {
			intNum = Integer.valueOf(selectNum);
		} catch (Exception e) {
			return null;
		}
		return intNum;
	}

}
