package com.cho.score.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {

		List<Integer> nums1 = new ArrayList<Integer>();
		List<Float> nums2 = new LinkedList<Float>();

		nums1.add(10);
		nums1.add(20);
		nums1.add(30);

		int intnum1 = nums1.get(2);
		System.out.println(intnum1);

		System.out.println(nums1.get(1));
		
//		System.out.println(nums1.get(3));
		
//		for (int i = 0 ; i < nums1.size();i++) {
//			System.out.println(nums1.get(i));
//		}
		int numsSize = nums1.size();
		for (int i = 0 ; i < numsSize ;i++) {
			System.out.println(nums1.get(i));
		}
		
		for(Integer num : nums1) {
			System.out.println(num);
		}
	}
}
