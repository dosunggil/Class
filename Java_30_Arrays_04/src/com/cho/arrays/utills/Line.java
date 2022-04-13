package com.cho.arrays.utills;

public class Line {

	/*
	 * 클래스 영역에 dLine, sLine 문자열형 변수를 선언 static : 프로젝트 코드가 실행되는 순간 항상 자동으로 사용할 준비가
	 * 되도록 선언하는 키워드
	 */
	
	/*
	 * final : 변수에 final 키워드가 부착되면, 한 번 저장된 값을 변경할 수 없다.
	 */
	public static final String dLine = "=".repeat(90);
	public static final String sLine = "-".repeat(90);

	/*
	 * return type 이 문자열형(String 형, String type) 인 dLine method 선언 위의 dLine 은 변수고,
	 * 아래는 메서드이다.
	 */
	public static String dLine(int count) {
		String dLine = "=";
		return dLine.repeat(count);
	}

	/*
	 * int type argument 가 1개 있고
	 * return type 이 String type 인 sLine method 선언
	 */
	public static String sLine(int count) {
		String sLine = "-";
		return sLine.repeat(count);
	}
}
