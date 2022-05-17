package com.cho.app.exec;

import com.cho.utils.Line;

public class Exec07 {

	public static void main(String[] args) {
		int dan = 7;
		System.out.println(Line.dLine(20));
		System.out.printf("%d 단 구구단\n",dan);
		System.out.println(Line.sLine(20));
		
		for (int i=2 ; i < 10 ; i ++) {
			System.out.printf("%d x %d : %d\n",dan,i,dan*i);
		}
		System.out.println(Line.dLine(20));
	}
}
