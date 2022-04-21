package com.cho.score.service.impl;

import com.cho.score.controller.domain.StudentVO;
import com.cho.score.service.StudentService;

public class StudentServiceImplV1V1 implements StudentService{

	private StudentVO[] stVO;
	private String stFile;
	
	public StudentServiceImplV1V1() {
	
	}
	
	public StudentServiceImplV1V1(String stFile, int length) {
		this.stFile = stFile;
		this.stVO = new StudentVO[length];
		for(int i = 0 ; i < stVO.length;i++) {
			this.stVO[i] = new StudentVO();
		}
	}
	
	
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudentVO[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
