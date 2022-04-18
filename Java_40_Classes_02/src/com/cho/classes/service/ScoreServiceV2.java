package com.cho.classes.service;

import java.util.Scanner;

import com.cho.classes.utills.Line;

public class ScoreServiceV2 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV2() {
		this(5);
	}

	public ScoreServiceV2(int i) {
		student = new String[i];
		intKor = new int[i];
		scan = new Scanner(System.in);
		lineLength = 50;

	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("\t\t성적처리 V2");
		System.out.println(Line.sLine(lineLength));
		int index = 0;
		int intKor11 = 0;

		// for(index=0;index<student.length;index++) {
		while (index < student.length) {
			System.out.print("이름 (END : 중단) >> ");
			String strName = scan.nextLine();

			if (strName.equals("END")) {
				return -1;
			}
			System.out.print("점수 >> (END : 중단) ");
			String strKor = scan.nextLine();
			if (strKor.equals("END")) {
				return -1;
			}

			try {
				// exception 이 발생할 수 있는 코드
				intKor11 = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intKor11;
				index++;

			} catch (Exception e) {
				System.out.println("점수 오류 !! (숫자만 입력하세요.)");
			}
		}
		
		/*
		 * 입력을 배열의 개수만큼 모두 마치고 정상 종료하면 0을 return.
		 * 입력 도중 END 를 입력하여 중단하였으면 -1 을 return
		 */
		return 0;

	}

	public void print() {
		while (true) {
			System.out.print("찾을 학생의 번호 (END : 종료) >> ");
			String scanNum = scan.nextLine();
			if (scanNum.equals("END")) {
				break;
			}
			int scanNum2 = Integer.valueOf(scanNum);
			System.out.printf("%d번 %s 학생의 점수 : %d\n", scanNum2, student[scanNum2 - 1], intKor[scanNum2 - 1]);
		}
		System.out.println("종료");
	}
}
