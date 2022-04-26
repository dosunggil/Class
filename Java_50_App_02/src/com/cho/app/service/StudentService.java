package com.cho.app.service;

import java.util.List;

import com.cho.app.domain.StudentVO;

public interface StudentService {

	public void loadStudent();
	public List<StudentVO> getStudents();
	public StudentVO findByStNum(String stNum); // 한 학생의 데이터만 뽑을수잇다
	
	public List<StudentVO> findByStName(String stName); // 여러 학생의 데이터가 나올 수 있기에 List 로 선언
}
