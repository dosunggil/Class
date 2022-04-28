package com.cho.app.primes;

public class Exec71 {

	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for(int i = 0; i <nums.length;i++) {
			int num = (int)(Math.random()*100)+1;
			nums[i] = num;
			//nums[i] = i+2;
		}
		int count = 0;
		for(int num : nums) {
			int index = 0 ;
			for (index = 2 ; index <num ; index++) {
				if(num%index == 0) {
					break;
				}
				
			}
			if (index>=num ) { // if ( !(index<num))
 				count++;
			}
			
		}
		System.out.println(count);
	}
}
