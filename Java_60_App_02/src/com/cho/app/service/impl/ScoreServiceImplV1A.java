package com.cho.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cho.app.model.ScoreVO;
import com.cho.app.service.ScoreService;

public class ScoreServiceImplV1A implements ScoreService{

	protected final Scanner scan;
	protected final List<ScoreVO> stList;
	
	public ScoreServiceImplV1A() {
		this.stList = new ArrayList<>();
		this.scan = new Scanner(System.in);
	}
	
	@Override
	public void inputScore() {
		ScoreVO stVO;
		
		while(true) {
			stVO = new ScoreVO();			
		
			System.out.print("학생 이름 입력(QUIT : 종료) >> \t");
			String name = scan.nextLine();
			if(name.equals("QUIT")) {
				System.out.println("종료합니다.");
				break;
			} else {
				stVO.setStName(name);
			}
			try {
				System.out.print("국어 >>  ");
				stVO.setStKor(Integer.valueOf(scan.nextLine()));
				System.out.print("영어 >>  ");
				stVO.setStEng(Integer.valueOf(scan.nextLine()));
				System.out.print("수학 >>  ");
				stVO.setStMath(Integer.valueOf(scan.nextLine()));
			} catch (Exception e) {
				System.out.println("숫자만 입력해야 합니다. 처음부터 다시 입력.");
				continue;
			}
			
			stList.add(stVO);
			}
	}

	@Override
	public void saveScore() {
		stList.toString();
	}

}
