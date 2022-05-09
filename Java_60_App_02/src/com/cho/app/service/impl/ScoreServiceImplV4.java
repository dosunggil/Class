package com.cho.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.cho.app.model.ScoreVO;

public class ScoreServiceImplV4 extends ScoreServiceImplV3{

	public ScoreServiceImplV4() {
		super();
	}
	
	@Override
	public void saveScore() {

		FileWriter fileWriter = null;
		PrintWriter print = null;
		
		try {
			fileWriter = new FileWriter(saveFileName);
			print = new PrintWriter(fileWriter);
			for(ScoreVO scVO : stList) {
				print.printf("%s:", scVO.getStName());
				print.printf("%d:", scVO.getStKor());
				print.printf("%d:", scVO.getStEng());
				print.printf("%d\n", scVO.getStMath());
				
			} // end for
			print.close();
			fileWriter.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
