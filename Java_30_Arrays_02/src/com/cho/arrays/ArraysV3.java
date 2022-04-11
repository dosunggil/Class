package com.cho.arrays;

public class ArraysV3 {

	public static void main(String[] args) {
		
		int[] intNums = new int[5];
		
		int index = 0;
		/*
		intNums[index++] = (int)(Math.random()*100) +1 ; 
		intNums[index++] = (int)(Math.random()*100) +1 ; 
		intNums[index++] = (int)(Math.random()*100) +1 ; 
		intNums[index++] = (int)(Math.random()*100) +1 ; 
		intNums[index++] = (int)(Math.random()*100) +1 ; 
*/
	
		for (index= 0; index<5 ; index ++) {
			intNums[index] = (int)(Math.random()*100)+1;
		}
		
		int[] intScore = new int[100];
		for(index=0;index<100;index++) {
			
			intScore[index] = (int)(Math.random()*100)+1;
			
		}
		
		// .lenght : 배열 만들 때 자동으로 생성되는 변수 (배열의 속성 이라고 함)
		int[] intScore2 = new int[200];
		for(index=0;index < intScore2.length ; index++) {
			intScore2[index] = (int)(Math.random()*100)+1;
		}
		
		int intSum = intScore2[0];
		intSum += intScore2[1];
		intSum += intScore2[2];
		System.out.println(intSum);
		
		intSum = 0;
		
		/*
		 * intScore3 배열의 모든 요소를 intSum 에 합쳐서 출력
		 */
		
		int[] intScore3 = new int[500];		
		
		for (index=0;index < intScore3.length; index++) {
			
			intScore3[index] = (int)(Math.random()*100) +1;
		}
		
		for (index=0; index < intScore3.length; index++) {
			intSum += intScore3[index] ;
		}
		
		System.out.println(intSum);
		
		int intSum4 = 0;
		int[] intScore4 = new int[100];		
		
		for (index=0;index < intScore4.length; index++) {
			
			intScore4[index] = (int)(Math.random()*100) +1;
		}
		
		for (index=0; index < intScore4.length; index++) {
			intSum4 += intScore4[index] ;
		}
		
		System.out.println(intSum4);
		
		intSum4 /= intScore4.length;
		System.out.println("평균 : " + intSum4);
		
	}
	
	
}
