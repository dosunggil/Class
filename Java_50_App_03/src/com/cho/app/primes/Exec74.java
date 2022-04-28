package com.cho.app.primes;

public class Exec74 {

	public static void main(String[] args) {
		
		int[] nums = new int[100] ;
		
		for (int i = 0 ; i < nums.length ; i ++) {
			nums[i] = (int)(Math.random()*100)+2;
		}
		
		int count = 0;
		for (int num : nums) {
			count += prime(num);
		}
		System.out.println(count);
	}
	
	
	
	// 대입한 변수가 소수이면 1을 return, 소수가 아니면 0을 return.
	public static int prime(int num) {
		
		for (int i = 2; i < num ; i ++) {
			if (num% i == 0)
				return 0;
		}
		return 1;
	}
}
