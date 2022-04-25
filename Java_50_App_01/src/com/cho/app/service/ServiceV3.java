package com.cho.app.service;

import java.util.List;

public class ServiceV3 {

	private final List<Integer> intList;
	
	public ServiceV3(List<Integer> intList) {
		this.intList = intList;
	}
	
	public void makeScore(int ll) {
		for (int i = 0 ; i < ll ;  i ++ ) {
			int rnd = (int)(Math.random()*100)+1;
			intList.add(rnd);
		}
	}
	
}
