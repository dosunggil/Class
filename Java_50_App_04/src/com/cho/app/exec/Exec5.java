package com.cho.app.exec;

import java.util.List;

import com.cho.app.GetValue;

public class Exec5 {

	public static void main(String[] args) {
		
		/*
		 * List<Integer> nums = new ArrayList<>(); for (int i = 0; i < 100; i++) {
		 * nums.add((int) (Math.random() * 100) + 1); //nums.add(i+1); }
		 */

		List<Integer> nums = GetValue.getList(100);
		
		int prime = nums.get(0);
		int primeIndex = 0;
		int size = nums.size();
		for (int i = 1 ; i < size ; i ++) {
			if (nums.get(i) > prime) {
				prime = nums.get(i);
				primeIndex = i;
			}
		}
		System.out.printf("가장 큰 값은 %d 번째에 위치한 %d 였습니다!\n",primeIndex,prime);
		int index = nums.indexOf(prime);
		System.out.println("가장 큰 수가 가장 처음 나타난 위치" + index);
		
		
	}
}
