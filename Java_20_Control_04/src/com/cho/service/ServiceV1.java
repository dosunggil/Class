package com.cho.service;

public class ServiceV1 {

	/*
	 * void type method를
	 * guguDan 이름으로 선언하기
	 * void type method 는 return 명령이 없어도 된다
	 */
	public void guguDan() {
		int intNum1 = 0;
		int intDan = 0;
		intNum1 = 3;
		intDan = 1;
		
		
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
		intDan ++;
		System.out.printf("\t%d x %d = %d\n",intNum1, intDan, intNum1*intDan);
	}
}
