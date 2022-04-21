package com.cho.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.cho.score.controller.domain.StudentVO;
import com.cho.score.service.StudentService;

public class StudentSeviceImplV1 implements StudentService {

	// 학생데이터들을 저장할 배열변수
	private StudentVO[] stVO;
	// 학생데이터가 저장된 text file 이름
	private String stFile;
	
	/*
	 * private StudentSeviceImplV1() {
	 * 
	 * }
	 */

	public StudentSeviceImplV1(String stNum, int lL) {
		this.stFile = stNum;
		this.stVO = new StudentVO[lL];
		for(int i = 0 ; i < this.stVO.length ; i++) {
			this.stVO[i] = new StudentVO();
		}
	}
	
	@Override
	public void loadStudent() {

		InputStream is = null;
		
		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(stFile+"파일을 찾을 수 없습니다.");
			return;
		}
		Scanner scan = new Scanner(is);
		/*
		 * while(true) {
			boolean bYes = scan.hasNext();
			if (!bYes) {
				break;
			}
			String stLine = scan.nextLine();
			System.out.println(stLine);
		}
		 */
		while(scan.hasNext()) {
			String stLine = scan.nextLine();
			System.out.println(stLine);
			String[] stInfos = stLine.split(":");
			
			System.out.println("학번: "+ stInfos[0]);
			System.out.println("이름: "+ stInfos[1]);
			System.out.println("학년: "+ stInfos[2]);
			System.out.println("학과: "+ stInfos[4]);
			System.out.println("주소: "+ stInfos[5]);
			System.out.println();
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
		}

	}

	@Override
	public StudentVO[] getStudents() {
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		return null;
	}

}
