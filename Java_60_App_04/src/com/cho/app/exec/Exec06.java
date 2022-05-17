package com.cho.app.exec;

public class Exec06 {

	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for(int i = 0 ; i < nums.length ; i ++) {
			nums[i] = (int)(Math.random()*91) +10;
		}
		
		for( int j = 0 ; j < nums.length ; j++) {
			int index = 0 ;
			for(index = 2; index < nums[j]; index++) {
				
				if(nums[j] % index ==0) {
					System.out.printf("%2d번째 값 : %d 은(는) 소수가 아닙니다.\n" , j, nums[j]);
					break;
				}
				if(index == nums[j]-1) {
					System.out.printf("%2d번째 값 : %d 은(는) 소수입니다.\n" , j, nums[j]);
				}
			}
		}
	}
}
