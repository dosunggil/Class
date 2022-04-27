package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec1 {

	/*
	 * 10개의 정수형 배열을 생성하고 1 ~ 100 까지 임의의 정수를 생성하여 각 배열의 요소에 저장하시오
	 */
	public static void main(String[] args) {
		int[] intAr = new int[10];
		List<Integer> intAr2 = new ArrayList<>();
		
		
		for(int i = 0 ; i < intAr.length ; i++) {
			int rnd = (int)(Math.random()*100)+1;
			intAr[i] = rnd;
		}
		
		for(Integer i : intAr) {
			int rnd = (int)(Math.random()*100)+1;
			intAr2.add(rnd);
		}
		
		Integer[] intAr3 = new Integer[5];
	
		System.out.println(intAr3[3]);
		
		int[] intAr4 = new int[5];
		
		System.out.println(intAr4[2]);
		/*
		 * for(int i = 0 ; i<intAr.length ; i++) { System.out.println(intAr[i]); }
		 * 
		 * 
		 
		 for (int i : intAr) { System.out.println(i); }
		System.out.println("위가 1");
		
		for(int i = 0 ; i<intAr2.size() ; i++) {
			System.out.println(intAr2.get(i).toString());
		}
		System.out.println("\t\t" + intAr2.size());
		
		for (Integer i : intAr2) {
			System.out.println(i + ",");
		}
		System.out.println("\t\t" + intAr2.size());
		
		System.out.println(intAr2);
		 */
	}
}
