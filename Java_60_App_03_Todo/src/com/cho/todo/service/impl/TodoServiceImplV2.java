package com.cho.todo.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.cho.todo.model.TodoVO;
import com.cho.todo.utills.IndexInfo;

public class TodoServiceImplV2 extends TodoServiceImplV1{

	private final String tdFileName;
	public TodoServiceImplV2() {
		super();
		this.tdFileName = "src/com/cho/todo/model/todolist.txt";
		loadTodoList();																																														
	}
	
	/*
	 * 저장된 todolist.txt 파일을 읽어서
	 * todoList 에 추가하기
	 */
	private void loadTodoList() {
		// String fileName = "/Java_60_App_03_Todo/src/com/cho/todo/model/todolist.txt";
		// uuid / 시작날짜 / 시작시간 / 끝날짜/ 끝시간 / content
		
		InputStream is = null;
		
		try {
			is = new FileInputStream(this.tdFileName);
		} catch (Exception e) {
			System.out.println(tdFileName + "파일을 찾을 수 없습니다.");
			return;
		}
		Scanner fileReader = new Scanner(is);
		
		while(fileReader.hasNext()) {
			
			String tdLine = fileReader.nextLine();
			String[] tdInfo = tdLine.split(",");
			
			String tdId = tdInfo[IndexInfo.TD.TD_ID];
			String tdSDate = tdInfo[IndexInfo.TD.TD_SDATE];
			String tdSTime = tdInfo[IndexInfo.TD.TD_STIME];
			String tdEDate = tdInfo[IndexInfo.TD.TD_EDATE];
			String tdETime = tdInfo[IndexInfo.TD.TD_ETIME];
			String tdContent = tdInfo[IndexInfo.TD.TD_CONTENT];
			
			
			TodoVO todoVO = TodoVO.builder().tKey(tdId)
					.sdate(tdSDate)
					.stime(tdSTime)
					.edate(tdEDate)
					.etime(tdETime)
					.tContent(tdContent)
					.build();
			
			todoList.add(todoVO);
			try {
				is.close();
			} catch (IOException e) {
			}
			//fileReader.close();
		}
	}
}
