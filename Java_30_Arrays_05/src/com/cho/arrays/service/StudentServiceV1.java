package com.cho.arrays.service;

import java.util.Scanner;

import com.cho.arrays.utills.Line;

public class StudentServiceV1 {

	// 상속 준비
	// 클래스 변수의 접근제한자를 protected 로 변경
	protected String[] strStudents;
	protected Scanner scan;

	// 기본 생성자
	public StudentServiceV1() {
		/*
		 * strStudents = new String[10]; 
		 * scan = new Scanner(System.in);
		 */
		
		/*
		 * strStudents, scan 두개의 변수는 초기화가 되어야 하는데,
		 * 생성자에서 초기화 시키는 코드를 작성한다.
		 * 하지만 현재 ServiceV1 클래스에는 두개의 생성자가 있다.
		 * 그래서 기본 생성자에서는 초기화 코드를 사용하지 않고
		 * 임의 생성자에서 작성한 코드를 이용하는
		 * this(10) (임의 생성자에게 정수 10을 전달하면서 두 개의 변수를 초기화)
		 * 키워드를 사용한다.
		 */
		this(10);
	}

	// 임의 생성자
	// 클래스 개발자가 필요에 의해 임의로 선언하는 생성자 메서
	public StudentServiceV1(int i) {
		strStudents = new String[i];
		scan = new Scanner(System.in);
	}
	
	public int inputStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("학생 이름 입력");
		System.out.println(Line.sLine(50));
		for(int i = 0; i < strStudents.length; i++) {
			System.out.printf("** \t%d 번 학생 이름 > ",i+1);
			String strName = scan.nextLine();
			strStudents[i] = strName;
			printStudent();
			System.out.println(Line.sLine(50));
			
		}
		System.out.println("입력완료");
		System.out.println(Line.dLine(50));
		return 0;
		
		
		
	}
	public void printStudent() {
		for(int i = 0; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if(bYes) {break;}
			System.out.printf("%s\t",strStudents[i]);
		}		
		System.out.println();
	}
}
