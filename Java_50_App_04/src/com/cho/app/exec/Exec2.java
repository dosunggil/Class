package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}
		System.out.println("List nums 의 요소 중 55 이상의 정수는 몰까용? ==>> ");
		int size = nums.size();
		for (int i = 0; i < size - 1; i++) {
			if (nums.get(i) >= 55) {
				System.out.printf("%3d 번의 %3d\n", i, nums.get(i));
			}
		}
		//int count = 0;
		//for (count = size-1 ; count >0 ; count --) {
		//	if(nums.get(count) >= 55) {
		//		System.out.println("끝");break;
		//	}
		//}
		

		// 확장문 사용하기
		/*
		 * int index = 0; 
		 * for (int num : nums) { 
		 * if (num >= 55) {
		 * System.out.printf("\t%3d : %3d\n", index, num); 
		 * }
		 * index++; 
		 * }
		 */

		if (nums.get(size - 1) >= 55) {
			System.out.printf("%3d 번의 %3d 가 있네요!", size - 1, nums.get(size - 1));
		}
	}
}
