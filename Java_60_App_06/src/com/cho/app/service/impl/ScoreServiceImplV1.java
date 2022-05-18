package com.cho.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ScoreVO;
import com.cho.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected final List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<>();
	}
	
	@Override
	public void makeScore(int num) {
		ScoreVO vo = null;
		for(int i = 0; i < num ; i++) {
			int kor = (int)(Math.random()*50)+51;
			int eng = (int)(Math.random()*50)+51;
			int math = (int)(Math.random()*50)+51;
			vo = new ScoreVO();
			vo.setNum("S"+i+1);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			scoreList.add(vo);
		}
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public int sumScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float avgScore() {
		// TODO Auto-generated method stub
		return 0;
	}

}
