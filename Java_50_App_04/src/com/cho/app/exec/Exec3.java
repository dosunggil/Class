package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
			//nums.add(i+1);
		}
		
		int size = nums.size();
		int index = 0;
		//for (index = 0 ; index < size ; index ++) {
		//	if (nums.get(index) >= 55)
		//		break;
		//}
		
		for( Integer num : nums) {
			if(num >= 55) {
				break;
			}
			index++;
		}
		
		System.out.printf("List nums 에서 최초로 정수 55 이상인 수는 \n\n\t\t%d 번째에 위치한 %d 군요!! 대박!",index+1,nums.get(index));
	}
}
