package com.cho.score.controller;

import com.cho.score.controller.domain.StudentVO;
import com.cho.score.service.impl.ScoreServiceImplV1;
import com.cho.score.service.impl.StudentSeviceImplV1;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		
		String stFile = "student.txt";
		int stLength = 50;
		
		StudentSeviceImplV1 stService1 = new StudentSeviceImplV1(stFile, stLength);
		stService1.loadStudent();
		StudentVO[] stList = stService1.getStudents();
		StudentVO stNo1 = stService1.findByNum("0001");
				
		ScoreServiceImplV1 scSV1 = new ScoreServiceImplV1();
		
		scSV1.makeScore();
		int intSum = scSV1.returnSum();
		float fAvg = scSV1.returnAvg();
		scSV1.printScore();
	
	}

}
