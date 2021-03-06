package com.cho.app.domain;

/*
 * 클래스 정의(class prototype define)
 * java 파일을 생성하고 
 * class 키워드를 시작으로 만든 코드
 */
public class StudentVO {

	private String stNum;
	private String stName;
	private String stDept;
	private String stAddr;
	private int intGrade;
	private String stTel;

	/*
	 * VO 클래스에 기본생성자와
	 * 모든 인스턴스 변수(클래스 영역의 변수) 를
	 * 매개변수로 받아 초기화 하는 임의생성자를 만든다.
	 * 
	 * JDK 를 사용하여 프로젝트를 수행할 때
	 * 다양한 도구들을 연결할 필요가 있는데
	 * 도구들마다 VO 객체에 접근하는 방법이 조금씩 다르다.
	 * 
	 * 어떤 도구는 getter, setter 를 통하여 접근하기도 하고,
	 * 어떤 도구는 필드생성자를 통하여 접근하기도 한다.
	 * 
	 * 최근에는 getter, setter 를 만들지 말자라는 의견이 있지만
	 * 다양한 JDK 도구를 사용할때는 필요하기도 하므로
	 * 표준 Java 코딩의 VO 클래스 작성 패턴에서는
	 * 모든 변수는 private 으로 선언하고 getter, setter 를 정의해둔다.
	 */
	public StudentVO() {
		
		
	}
	/**
	 * 
	 * @param stNum
	 * @param stName
	 * @param stDept
	 * @param stAddr
	 * @param intGrade
	 * @param stTel
	 */
	public StudentVO(String stNum, String stName, String stDept, String stAddr, int intGrade, String stTel) {
		this.stNum = stNum;
		this.stName = stName;
		this.stDept = stDept;
		this.stAddr = stAddr;
		this.intGrade = intGrade;
		this.stTel = stTel;
	}


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

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStTel() {
		return stTel;
	}

	public void setStTel(String stTel) {
		this.stTel = stTel;
	}

	// VO 객체에 데이터를 저장한 후 
	// 데이터가 잘 저장되었는지 확인하기 위하여 toString() 을 재정의.
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stAddr=" + stAddr
				+ ", intGrade=" + intGrade + ", stTel=" + stTel + "]";
	}
}
