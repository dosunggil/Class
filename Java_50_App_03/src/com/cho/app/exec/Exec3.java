package com.cho.app.exec;

public class Exec3 {

	/*
	 * 임의의 정수 10개를 만들어
	 * 각각의 수를 even() 메서드에 매개변수로 전달하고
	 * even() 는 매개변수로 전달받은 값이 
	 * 짝수이면 전달받은 값, 아니면 0을 return
	 * even() return 한 값을 합산하여 출력
	 */
	public static void main(String[] args) {
		int intnum = 0;
		int result = 0;
		
		int intnum1 = (int)(Math.random()*100) +1 ;
		int intnum2 = (int)(Math.random()*100) +1 ;
		int intnum3 = (int)(Math.random()*100) +1 ;
		int intnum4 = (int)(Math.random()*100) +1 ;
		int intnum5 = (int)(Math.random()*100) +1 ;
		int intnum6 = (int)(Math.random()*100) +1 ;
		int intnum7 = (int)(Math.random()*100) +1 ;
		int intnum8 = (int)(Math.random()*100) +1 ;
		int intnum9 = (int)(Math.random()*100) +1 ;
		int intnum10 = (int)(Math.random()*100) +1 ;
		
		int result1 = 0;
		
		result1 += even(intnum1);
		result1 += even(intnum2);
		result1 += even(intnum3);
		result1 += even(intnum4);
		result1 += even(intnum5);
		result1 += even(intnum6);
		result1 += even(intnum7);
		result1 += even(intnum8);
		result1 += even(intnum9);
		result1 += even(intnum10);
		
		System.out.printf("%d + %d + %d + %d + %d + %d + %d + %d + %d + %d\n = " , intnum1,intnum2,intnum3,intnum4,intnum5,intnum6,intnum7,intnum8,
				intnum9,intnum10);
		System.out.println(result1);
		
		int i = 0;
		while(i<10) {
			intnum = (int)(Math.random()*100)+1;
			int numResult = even(intnum);
			result += numResult;
			i++;
		}
		System.out.println(result);
	}
	
	
	
	public static int even(int num) {
		if((num%2) == 0) {
			return num;
		} else {
		return 0;
		}
		
	}
}
