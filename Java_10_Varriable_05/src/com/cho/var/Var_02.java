package com.cho.var;

public class Var_02 {
	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 = Math.random() * 1000;
		doNum2 = Math.random() * 1000;
		
		double doSum = doNum1 + doNum2;
		double doDes = doNum1 - doNum2;
		double doMul = doNum1 * doNum2;
		double doDiv = doNum1 / doNum2;
		
		/*
		 *  printf() 를 사용하여 3개 변수에 담긴 데이터를 출력하기
		 *  %d = decimal(10진수) 정수형 데이터를 불러온다
		 *  %f = 실수형 데이터를 불러온다
		 *  
		 *  System.out.printf("%d + %d = %d",doNum1,doNum2,doSum);
		 */
		  System.out.printf("\t%f + %f = %f\n",doNum1,doNum2,doSum);
		  System.out.printf("\t%.2f - %.2f = %.2f\n",doNum1,doNum2,doDes);
		  System.out.printf("\t%f x %f = %f\n",doNum1,doNum2,doMul);
		  System.out.printf("\t%f / %f = %f\n",doNum1,doNum2,doDiv);
		 
		
		  System.out.println("=====================================================");
		  System.out.printf("\t%.2f + %.2f = %.2f\n",doNum1,doNum2,doSum);
		  System.out.printf("\t%.2f x %.2f = %.2f\n",doNum1,doNum2,doMul);


		  //숫자를 오른쪽으로 정렬
		  //9.2 : 정수자릿수 + . + 소수점 이하 2자리 까지 모두 합해서 9개
		  System.out.println("=====================================================");
		  System.out.printf("\t%.2f + %.2f = %9.2f\n",doNum1,doNum2,doSum);
		  System.out.printf("\t%.2f x %.2f = %9.2f\n",doNum1,doNum2,doMul);
		  
	}

}
