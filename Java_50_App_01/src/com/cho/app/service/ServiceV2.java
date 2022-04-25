package com.cho.app.service;

import java.util.List;

public class ServiceV2 {

	private final List<Integer> intList;

	// intList 를 직접 초기화하지 않고 외부에서 받아온다.
	public ServiceV2(List<Integer> intList) {
		this.intList = intList;
	}

	/*
	 *  length 변수를 매개변수로 받아서
	 *  length 만큼의 random 수를 저장한
	 *  intList 를 return
	 */
	public List<Integer> getScore(int length){
		for (int i = 0 ; i < length ; i++) {
			int rnd = (int)(Math.random()*100) +1;
			intList.add(rnd);
		}
		return intList;
	}
}
