package com.cho.controller;

public class Boolean_04 {

	public static void main(String[] args) {

		boolean bYes1 = true;
		boolean bYes2 = true;
		
		/*
		 * int intNum1 = (int)(Math.random() *1000) +1; int intNum2 =
		 * (int)(Math.random() *1000) +1;
		 */
	
		
		 int intNum1 = 33; int intNum2 = 55;
		
		
		bYes1 = intNum1 == intNum2; // false
		bYes2 = intNum1 < intNum2; // true

		/*
		 * || : boolean 데이터의 논리합 (OR) 
		 * && : boolean 데이터의 논리곱 (AND)
		 */
		boolean bWhat = bYes1 || bYes2; // true
		bWhat = bYes1 && bYes2; // false

		// intNum1 == intNum2 Or intNum2 < intNum2
		if (bYes1 || bYes2) {
			System.out.printf("\t%d 는 %d 보다 작거나 같다.\n",intNum1,intNum2);
		}
		else {
			System.out.printf("\t%d 는 %d 보다 크다.\n",intNum1,intNum2);
		}
		
		bWhat = !(bYes1 || bYes2);
		System.out.println(bWhat);
		
		// !(f AND t) 
		bWhat = !(bYes1 && bYes2); // true
				
	}

}
