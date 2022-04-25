package com.cho.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.service.ServiceV3;

public class ControllerV3 {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>() ;
		ServiceV3 sV3 = new ServiceV3(scoreList);
		int ll = 10;
		sV3.makeScore(ll);
		
		System.out.println(scoreList);
	}
}
