package com.cho.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ExecVO {

	private int exKor;
	public int getExKor() {
		return exKor;
	}
	public void setExKor(int exKor) {
		this.exKor = exKor;
	}
	public int getExEng() {
		return exEng;
	}
	public void setExEng(int exEng) {
		this.exEng = exEng;
	}
	public int getExMath() {
		return exMath;
	}
	public void setExMath(int exMath) {
		this.exMath = exMath;
	}
	public int getExSum() {
		return exSum;
	}
	public void setExSum(int exSum) {
		int iSum = exKor + exEng + exMath;
		
		this.exSum = iSum;
	}
	private int exEng;
	private int exMath;
	private int exSum;
}
