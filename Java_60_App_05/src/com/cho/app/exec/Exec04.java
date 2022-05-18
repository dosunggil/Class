package com.cho.app.exec;

import com.cho.utils.Line;

public class Exec04 {

	public static void main(String[] args) {
		
		String str1 ="A";
		String str2 ="B";
		
		int comp = str1.compareTo(str2);
		System.out.println(comp);
		
		comp = str2.compareTo(str1);
		System.out.println(comp);
		
		comp = str1.compareTo(str1);
		System.out.println(comp);
		
		System.out.println(Line.dLine(50));
		String[] strs = {"F", "A", "C", "B", "D" };

		for(String str : strs) {
			System.out.println(str);
		}
		System.out.println(Line.dLine(50));
		for(int i = 0 ; i < strs.length ; i++) {
			for (int j = i+1 ; j < strs.length ; j++) {
				if(strs[i].compareTo(strs[j]) > 0) {
					String _str = strs[i];
					strs[i] = strs[j];
					strs[j] = _str;
				}
			}
		}
		for(String str : strs) {
			System.out.println(str);
		}
	}
}
