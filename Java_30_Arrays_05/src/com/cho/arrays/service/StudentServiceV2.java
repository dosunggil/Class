package com.cho.arrays.service;

import java.util.Scanner;

import com.cho.arrays.utills.Line;

/*
 * ServiceV2 에서 ServiceV1 을 상속받았다.
 * 상속을 받으면 ServiceV1 에 선언된 변수와 method 를 물려받는다.
 * 단, 생성자 제외
 * 
 * 상속키워드가 extends 인 것에 주목
 */
public class StudentServiceV2 extends StudentServiceV1{
	
	public StudentServiceV2() {
		
		this(10);
	}

	
	public StudentServiceV2(int i) {
		strStudents = new String[i];
		scan = new Scanner(System.in);
	}


	/*
	 * Override : 재 정의
	 * ServiceV1 에 선언된 method 중에서,
	 * inputStudent() 를 다시 정의하겠다 라는 뜻.
	 */
	@Override
	public int inputStudent() {
		
		System.out.println(Line.dLine(50));
		System.out.println("학생 정보 입력");
		System.out.println(Line.sLine(50));
		
		int index = 0;
		for(index=0;index<strStudents.length;index++) {
			System.out.printf("%d 번 학생입력(Q : 중단) >",index+1);
			String strName = scan.nextLine();
			if(strName.equals("Q")) {
				break;
			}
			strStudents[index] = strName;
		}
		/*
		 * for() 가 시작되기 전에 선언된 index 는 
		 * for() {} 가 종료되어도 값을 유지하고 있다.
		 * 
		 * 만약 for () 명령문이 모두 수행되지 않고 중단되면
		 * 
		 * index < strStudent.length 
		 */
		if(index == strStudents.length) {
			System.out.println("입력완료");
		}else{
			System.out.println("입력중단");}
		
		System.out.println(index);
		System.out.println("종료");
		
		
		return 0;
	}
	
	
	
		
	
}
