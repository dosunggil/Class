package com.cho.app;

import java.util.ArrayList;
import java.util.List;

public class GetValue {

	public static List<Integer> getList(int max) {
		List<Integer> list  = new ArrayList<>();
		
		for (int i = 0 ; i < max ; i ++ ) {
			
			list.add((int)(Math.random()*100)+1);
			
		}
		return list;
	}
	
	public static int[] getArray(int max) {
		int[] nums = new int[max] ;
		for (int i = 0 ; i < max ; i++) {
			nums[i] = (int)(Math.random()*100)+1;
		}
		return nums;
	}
}
