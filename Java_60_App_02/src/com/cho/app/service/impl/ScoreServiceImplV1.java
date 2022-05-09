package com.cho.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ScoreVO;
import com.cho.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	
	private List<ScoreVO> stList;
	
	public ScoreServiceImplV1() {
		this.stList = new ArrayList<>();
	}
	
	@Override
	public void inputScore() {
		ScoreVO stVO = new ScoreVO();
		stVO.setStKor((int)(Math.random()*50)+51);	
		stVO.setStEng((int)(Math.random()*50)+51);	
		stVO.setStMath((int)(Math.random()*50)+51);	
		stList.add(stVO);
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

}
