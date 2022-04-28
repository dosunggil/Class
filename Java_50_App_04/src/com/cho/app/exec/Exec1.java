package com.cho.app.exec;

public class Exec1 {

	public static void main(String[] args) {
		int[] nums = new int[100] ;
		
		System.out.print("배열 nums 의 요소 중 정수 55 이상인 수는 ==> \n");
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*100)+1;
			int num = 55;
			if(nums[i] >= num) {
				System.out.print(nums[i] + ",  ");
			}
		}
		
		/*
		 * for ( int i =0 ; i < nums.length ; i++) { int num = 55; if(nums[i] >= num) {
		 * System.out.print(nums[i] + ",  "); } }
		 */	}
}
