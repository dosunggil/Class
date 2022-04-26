package com.cho.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cho.app.domain.StudentVO;
import com.cho.app.service.StudentService;
import com.cho.app.utills.IndexInfo;

public class StudentServiceImplV1 implements StudentService {

	private final List<StudentVO> stList;
	private final String stFileName;

	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}

	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {
		this.stList = stList;
		this.stFileName = stFileName;

	}

	@Override
	public void loadStudent() {
		
		// is 객체선언
		InputStream is = null;
		
		try {
			// stFileName 파일을 open 하여 InputStream 으로 변환한 후
			// is 객체에 저장
			is = new FileInputStream(this.stFileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(stFileName + "파일을 찾을 수 없습니다.");
			return;
		}
		/*
		 * file 정보가 담긴 is 객체를 Scanner 와 연결
		 */
		Scanner fileReader = new Scanner(is); //System.in 이 아니라 scanner 에 file 을 연결하기
		
		// scanner 를 통하여 file 을 읽어오기
		// file 에 읽을 내용이 있는지 확인하면서 while() 반복문 실행
		while(fileReader.hasNext()) {
			
			// file 에서 한 라인의 문자열 읽기
			String stLine = fileReader.nextLine();
			
			// 읽은 문자열을 : 을 기준으로 분해하기
			// 분해된 문자열들을 배열로 저장하기
			String[] stInfo = stLine.split(":");
			
			// 분해된 문자열이 담긴 배열에서 각 요소값을 읽어 변수에 담기
			String stNum = stInfo[IndexInfo.ST.ST_NUM];
			String stName = stInfo[IndexInfo.ST.ST_NAME];
			String stDept = stInfo[IndexInfo.ST.ST_DEPT];
			String stGrade = stInfo[IndexInfo.ST.ST_GRADE];
			int intGrade = Integer.valueOf(stGrade);
			String stAddr = stInfo[IndexInfo.ST.ST_ADDR];
			String stTel = stInfo[IndexInfo.ST.ST_TEL];
			/**
			 * 
			 * @param stNum
			 * @param stName
			 * @param stDept
			 * @param stAddr
			 * @param intGrade
			 * @param stTel
			 */
			
			// 각 변수에 담긴 학생정보의 요소들을 VO 객체에 담기
			// VO 클래스의 필드생성자를 사용하여 값이 담긴 stVO 생성
			StudentVO stVO = new StudentVO(stNum, stName, stDept, stAddr, intGrade, stTel);
			
			// VO 객체에 담긴 학생의 정보를 stList 에 추가
			stList.add(stVO);
		}//end while
		try {
			
			// 열린 file 을 닫기
			is.close();
		} catch (IOException e) {
		}
		
		// 열린 scanner resource 반납하기
		fileReader.close();
	}

	@Override
	public List<StudentVO> getStudents() {
		return this.stList;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}

}
