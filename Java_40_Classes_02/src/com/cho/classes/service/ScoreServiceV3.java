package com.cho.classes.service;

public class ScoreServiceV3 {

	protected String[] students;
	protected int[] intKor;

	public ScoreServiceV3() {
		this(5);
	}

	public ScoreServiceV3(int i) {
		
		students = new String[i];
		intKor = new int[i];
		
		
	}
	public ScoreServiceV3(String[] students) {
		this.students = students;
		this.intKor = new int[this.students.length];
	}
}
