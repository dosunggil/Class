package com.cho.arrays.exec;

public class StringEx {

	public static void main(String[] args) {
		
		/*
		 * 문자열형 변수는 숫자형, boolean 형 변수와 저장방식이 다르다.
		 * 때문에 문자열형 변수에 저장된 문자열을 EQ(==) 비교를 하는것은 매우 위험한 코드가 될 수 있다.
		 * 
		 * 문자열형 변수는 절대 EQ 또는 NotEQ 를 사용하여 비교하지 않는다.
		 */
		String strNation = "KOREA";
				System.out.println(strNation == "KOREA");
		String strName = new String("홍길동");
		System.out.println(strName=="홍길동");
		
		System.out.println(strNation.equals("KOREA"));
		System.out.println(strName.equals("홍길동"));
		
		boolean bYes = strNation.equals("KOREA");
		if(bYes) {
			System.out.println("strNation 변수에는 'KOREA'가 담겨있다."); 
		}
		boolean bYes2 = strName.equals("홍길동");
		
		strNation= "RE KRR";
		bYes = strNation.equals("re krr");
		
		// 밑의 코드를 한 문장의 명령으로 완성하기
		String upString = strNation.toUpperCase();
		bYes = upString.equals("RE KRR");
		// method Chaining 
		bYes = strNation.toUpperCase().equals("RE KRR");
		bYes = strNation.toLowerCase().equals("re krr");
		
		bYes = strNation.equalsIgnoreCase("rE KRr");
	}
}
