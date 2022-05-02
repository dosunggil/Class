package com.cho.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.ExecVO;
import com.cho.app.service.ExecSerivce;

public class ExecServiceImplV1 implements ExecSerivce{

	private final List<ExecVO> exList; 
	
	// VO 객체를 사용할 준비하기
	
	public ExecServiceImplV1() {
		this.exList = new ArrayList<>();
	}
	
	// TODO Auto-generated method stub
	@Override
	public void makeScore() {
		ExecVO exVO = new ExecVO();
		
		for(int i = 0 ; i < 5 ; i ++) {
			int iKor = (int)(Math.random()*50)+51;
			int iEng= (int)(Math.random()*50)+51;
			int iMath= (int)(Math.random()*50)+51;
			exVO.setExKor(iKor);
			exVO.setExEng(iEng);
			exVO.setExMath(iMath);
			int iSum = iKor + iEng + iMath;
			exVO.setExSum(iSum);
		}
		
		for(int i = 0 ; i < 5 ; i ++ ) {
			for(int j = i+1 ; j < 5; j ++) {
				if(exVO.getExSum() > exVO.getExSum()) {
					
				}
			}
		}
		
	}

	// TODO Auto-generated method stub
	@Override
	public void printScore() {
		
	}


}
