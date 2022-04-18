package com.cho.classes.exec;

import java.util.Scanner;

public class String2IntV3 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.printf("정수를 입력 > ");
		String strNum = sca.nextLine();
		
		int intNum = 0;
		try {
			intNum = Integer.valueOf(strNum);
			boolean bEven = intNum%2 ==0;
			if (bEven) {
				System.out.printf("정수 %d 는 짝수.",intNum);
			} else {
				System.out.printf("정수 %d 는 홀수.",intNum);
			}
		} catch (Exception e) {
			System.out.println("오류1");
		}
		
		
		
	}
	
}
