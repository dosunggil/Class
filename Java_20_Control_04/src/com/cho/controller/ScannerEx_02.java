package com.cho.controller;

import java.util.Scanner;

import com.cho.service.ServiceV1;

public class ScannerEx_02 {

	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 scan 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("나만의 계산기");
		System.out.println("===================");
		
		System.out.print("정수를 입력 후 Enter : ");
		int intNum1 = scan.nextInt();
		
		System.out.print("추가 입력 후 Enter : ");
		int intNum2 = scan.nextInt();
		
		System.out.print("입력한 두 정수의 합 : ");
		System.out.println(intNum1 + intNum2);
			
	}
	
}
