package com.cho.var;

public class Var_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intGa = 33;
		int intNa = 55;
		
		int intPlus;
		int intMinus;
		int intPro;
		int intDiv;
		
		intPlus = intGa + intNa;
		intMinus = intGa - intNa;
		intPro = intGa * intNa;
		intDiv = intGa / intNa;
		
		System.out.println("\t사칙연산 실습\n");
		
		System.out.printf("\t%d + %d = %d\n",intGa,intNa,intPlus);
		System.out.printf("\t%d - %d = %d\n",intGa,intNa,intMinus);
		System.out.printf("\t%d x %d = %d\n",intGa,intNa,intPro);
		System.out.printf("\t%d / %d = %d\n",intGa,intNa,intDiv);

	}

}
