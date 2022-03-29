package com.cho.var;

public class Var_03 {
	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 = Math.random() * 1000 + 1;
		doNum2 = Math.random() * 1000 + 1; 
		
		
		System.out.println(doNum1);
		
		
		  System.out.printf("\t%4.0f + %4.0f = %4.0f\n",doNum1,doNum2,doNum1 + doNum2);
		  System.out.printf("\t%4.0f - %4.0f = %4.0f\n",doNum1,doNum2,doNum1 - doNum2);
		  System.out.printf("\t%4.0f × %4.0f = %4.0f\n",doNum1,doNum2,doNum1 * doNum2);
		  System.out.printf("\t%4.0f ÷ %4.0f = %4.0f\n",doNum1,doNum2,doNum1 / doNum2);
		 
	}

}
