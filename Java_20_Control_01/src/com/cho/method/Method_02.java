package com.cho.method;

public class Method_02 {
	public static void main(String[] args) {
		
		
		/*
		 * 명령문 해석
		 * 1. num() 를 실행하여 => num()를 호출하여 실행하고
		 * 2. num() 가 return 하는 데이터를 intNum1 변수에 저장하라
		 */
		
		int intNum1 = num();
		System.out.println(intNum1);

		double douNum1 = doNum();
		System.out.println(douNum1);

		long longNum1 = longNum();
		System.out.println(longNum1);

		float fNum1 = floatNum();
		System.out.println(fNum1);

		boolean bYes = bYes();
		System.out.println(bYes);
		
		String str = nation();
		System.out.println(str);
		
		
	}
	
	public static int num() {
		return 100;
	}
	public static double doNum() {
		return 100.0;
	}
	public static long longNum() {
		return 100l;
	}
	public static float floatNum() {
		return 100.0f;
	}
	public static boolean bYes() {
		return true;
	}
	public static String nation() {
		return "대한민국";
	}

}
