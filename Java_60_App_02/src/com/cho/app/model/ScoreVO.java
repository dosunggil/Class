package com.cho.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ScoreVO {

	private String stName;
	private int stKor;
	private int stEng;
	private int stMath;
	
	// private int stSum;
	// private float stAvg;
	
	// 필드변수와 관계없이 총점을 계산하여 return 하는 method 정의하기
	// 객체지향에서 이러한 별개의 method 를 메시지 라고 한다.
	// 또는 객체의 행위라고 한다.
	// vo.getIntSum() 를 호출하면 합계점수를 return 한다.
	public int getIntSum() {
		int sum = stKor + stEng + stMath;
		return sum;
	}
	
	// vo.getAvg() 를 호출하면 평균점수를 return 한다.
	public float getAvg() {
		int sum = getIntSum();
		float avg = (float)sum /3;
		return avg;
	}
	
	
	/*
	 * toString() 를 재정의하여 한 학생의 성적리스트를 문자열로 return 하겠다.
	 */
	public String toString() {
		
		String result = "";
		// 전체 5자리의 공간을 만들고 이름 위치를 확보
		result += String.format("%-5s\t", stName);
		result += String.format("%5d\t", stKor);
		result += String.format("%5d\t", stEng);
		result += String.format("%5d\t", stMath);
		result += String.format("%5d\t", getIntSum());
		result += String.format("%5.2f\n", getAvg());
		
		return result;
	}
	
}
