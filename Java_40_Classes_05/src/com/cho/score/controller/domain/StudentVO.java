package com.cho.score.controller.domain;

public class StudentVO {
	// 학번:이름:학년:반:전공:주소
	// 00035:조보성:2:3:역사학:울산광역시 북구 산업로1010
	
	
	private String stNum; 
	private String stName;
	private String stGrade;
	private String stDept;
	private String stAddr;
	// 학생 객체의 추상화 후 정보은닉
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	@Override
	public String toString() {
		return "StundentVO [stNum=" + stNum + ", stName=" + stName + ", stGrade=" + stGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + "]";
	}
	
	
}
