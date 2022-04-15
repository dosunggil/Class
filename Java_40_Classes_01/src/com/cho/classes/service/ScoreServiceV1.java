package com.cho.classes.service;

import java.util.Scanner;

import com.cho.classes.utills.Line;

public class ScoreServiceV1 {

	/*
	 * 상속을 염두에 두고 클래스를 선언할 때는
	 * 인스턴스 변수들을 private 이 아닌 protected 로 선언한다
	 * 
	 * protected : private 의 성질을 가지면서,
	 * 		상속받은 클래스에서 사용할 수 있다.
	 */
	protected String[] students;
	protected int[] intKor;
	protected int lineLenght; 
	protected Scanner scan;
	
	public ScoreServiceV1() {
		this(10);
	}
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor= new int[length];
		lineLenght = 50;
		//scan = new Scanner();
		scan = new Scanner(System.in);
	}
	
	public int input() {
		
		System.out.println(Line.dLine(lineLenght));
		System.out.println("빛나라 고교 성적처리 v1");
		System.out.println(Line.sLine(lineLenght));
		
		int index = 0;
		for(index=0 ; index < students.length;index++) {
			int stNum = index + 1;
			System.out.printf("%d 번 학생 이름(END:중단) : ",stNum);
			
			//키보드에서 문자열 입력받기
			String strName = scan.nextLine();
		
			if(strName.equals("END")) {
				break;
			}
			// 학생이름을 배열에 저장할때는 if() 다음에 위치해야 한다.
			// 만약 if() 위에 코드를 위치하면, 중단 되기전에
			// students[index] 요소에 END 문자열이 먼저 저장되기 때문에
			// 학생 이름 중에 END 가 포함된다.
			students[index] = strName;
		
			System.out.printf("%d 번 국어 점수 : ", stNum);
			//int intScore = scan.nextInt();
			//intKor[index] = intScore;
			
			int intScore = 0;
			String strScore = scan.nextLine();
			if(strScore.equals("")) {
				System.out.println("숫자만 입력");
			} else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[index] = intScore;
		}
		
		return 0;
	}
	
	public void print() {
		for(int i = 0; i< students.length ; i++) {
			if(students[i] == null) {
				break;
			}
			System.out.printf("%s\t",students[i]);
		}
		System.out.println();
		
	}
}
