package com.cho.app.exec;

import com.cho.utils.Line;

/*
 * 배열, 리스트에 담겨있는 데이터들을
 * 어떤 항목, 값을 기준으로 정렬을 할 필요가 많다.
 * DBMS 와 같은 데이터 관리 도구를 사용하는 경우는
 * SQL 명령으로 쉽게 정렬을 할 수 있다.
 * 
 *  하지만 배열, 리스트에 담긴 데이터들이
 *  그 양이 많지 않기 때문에 코딩으로 데이터를 정렬할 수 있다.
 *  
 * insert 정렬, bubble 정렬, selection 정렬, Quick 정렬
 * merge 정렬, shell 정렬, Radix 정렬 등의 알고리즘이 있다.
 * 
 * 간단한 정렬 코드를 이해하면 쉽게 정렬을 수행할 수 있다.
 * 
 * insert 정렬과 bubble 정렬의 중간쯤 성능을 갖는 알고리즘이다.
 * 이 알고리즘은 정식 정렬 알고리즘으로 인정받지는 않는다.
 * 
 * 전체 배열이나 리스트를 for() 으로 반복하면서
 * 0번 위치와 1 ~ 마지막 위치 까지 비교하면서 큰값은 오른쪽으로 
 * 			작은 값은 왼쪽으로 이동해준다.
 * 
 * insert 정렬과 비교했을 때 비교하는 방법에서 조금 차이가 있다.
 * 큰 데이터가 아닐경우는 insert 정렬에 비해 더 빠르다.
 * 
 */
public class Exec01 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
		
		for(int i = 0; i < nums.length ; i ++) {
			for( int j = i+1 ; j<nums.length ; j++) {
				
				if(nums[i] > nums[j]) {
					
					int _temp = nums[i];
					nums[i] =nums[j];
					nums[j] = _temp;
				}
			}
		}
		System.out.println(Line.dLine(50));
		for(int num : nums) {
			System.out.println(num);
		}
	}
}
