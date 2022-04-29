package com.cho.app.model;

public class ScoreVO {
	private int stNum;
	private int stKor;
	private int stMath;
	private int stEng;
	private int stSum;
	private float stAvg;
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getStKor() {
		return stKor;
	}
	public void setStKor(int stKor) {
		this.stKor = stKor;
	}
	public int getStMath() {
		return stMath;
	}
	public void setStMath(int stMath) {
		this.stMath = stMath;
	}
	public int getStEng() {
		return stEng;
	}
	public void setStEng(int stEng) {
		this.stEng = stEng;
	}
	public int getStSum() {
		return stSum;
	}
	public void setStSum(int stSum) {
		this.stSum = stSum;
	}
	public float getStAvg() {
		return stAvg;
	}
	public void setStAvg(float stAvg) {
		this.stAvg = stAvg;
	}
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", stKor=" + stKor + ", stMath=" + stMath + ", stEng=" + stEng + ", stSum="
				+ stSum + ", stAvg=" + stAvg + "]";
	}
	
	


}
