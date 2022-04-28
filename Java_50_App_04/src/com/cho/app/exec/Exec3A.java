package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3A {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
			//nums.add(i+1);
		}
		
		int size = nums.size();
		int index = size;
		
	//	for (index = size-1 ; index > -1 ; index --) {
	//		if (nums.get(index) >= 55)
	//			break;
	//	}
		
		int result = 0;
		for (int i = 0 ; i < size ; i ++) {
			if (nums.get(i) >= 55) {
				result = i;
			}
		}
		System.out.printf("%3d : %3d",result,nums.get(result));
		
	
		
		
		//System.out.printf("List nums 에서 정수 55 이상인 요소 중 마지막 요소는 \n\n\t\t%d 번째에 위치한 %d 군요!! 대박!",index+1,nums.get(index));
	}
}
