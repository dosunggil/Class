package com.cho.todo.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.cho.todo.model.TodoVO;
import com.cho.todo.utills.IndexInfo;

public class TodoServiceImplV2 extends TodoServiceImplV1{

	public TodoServiceImplV2() {
		super();
		loadTodoList();																																														
	}
	
	/*
	 * 저장된 todolist.txt 파일을 읽어서
	 * todoList 에 추가하기
	 */
	protected void loadTodoList() {
		// String fileName = "/Java_60_App_03_Todo/src/com/cho/todo/model/todolist.txt";
		// uuid / 시작날짜 / 시작시간 / 끝날짜/ 끝시간 / content
		
		// InputStream 을 생성하고
		FileInputStream is = null;
		// Scanner 에 연결
		Scanner fileReader = null;
		
		try {
			is = new FileInputStream(saveFileName);
		} catch (Exception e) {
			System.out.println(saveFileName+ "파일을 찾을 수 없습니다.");
			return;
		}
		
		fileReader = new Scanner(is);
		
		while(fileReader.hasNext()) {
			
			String tdLine = fileReader.nextLine();
			String[] tdInfo = tdLine.split(",");
			
			// text 파일에 데이터를 저장하면 마지막에
			// 공백의 Line 이 추가되는 경우가 있다.
			// 이때는 split 으로 분해한 배열의 개수가 부족하게 된다.
			// 이러한 상황을 방지하기 위하여 아래 코드를 추가한다.
			if(tdInfo.length < IndexInfo.TD.TD_CONTENT) continue;
			
			String eDate = tdInfo[IndexInfo.TD.TD_EDATE];
			String eTime = tdInfo[IndexInfo.TD.TD_ETIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			
			String tdId = tdInfo[IndexInfo.TD.TD_ID];
			String tdSDate = tdInfo[IndexInfo.TD.TD_SDATE];
			String tdSTime = tdInfo[IndexInfo.TD.TD_STIME];
			String tdEDate = tdInfo[IndexInfo.TD.TD_EDATE];
			String tdETime = tdInfo[IndexInfo.TD.TD_ETIME];
			String tdContent = tdInfo[IndexInfo.TD.TD_CONTENT];
			
			
			TodoVO todoVO = TodoVO.builder().tKey(tdId)
					.sdate(tdSDate)
					.stime(tdSTime)
					.edate(eDate)
					.etime(eTime)
					.tContent(tdContent)
					.build();
			todoList.add(todoVO);
			try {
				is.close();
			} catch (IOException e) {
			}
		//	fileReader.close();
		}
	}
}
