package com.cho.todo.exec;

import java.util.ArrayList;
import java.util.List;

import com.cho.todo.model.TodoVO;
import com.cho.utils.Line;

public class VarEx2 {

	public static void main(String[] args) {
		
		List<TodoVO> todoList = new ArrayList<>();
		
		/*
		 * Builder 패턴을 사용한 VO 객체 생성
		 * 	클래스.builder(0 메서드에 의해서 VO 객체가 선언되고
		 *	필드변수로 선언한 것과 같은 이름의 setter method 를 사용하여
		 * 		VO 객체의 각 변수 값을 채워넣으면서
		 * 		VO 객체를 생성하는 것
		 */
		TodoVO tVO = TodoVO.builder().sdate("2022-05-12").tContent("과제하기").build();
		todoList.add(tVO);
		
		// 기본 생성자를 사용하여 객체 초기화 하고
		// setter method 를 사용하여 각 변수 값을 저장하기
		tVO = new TodoVO();
		tVO.setSdate("2022-05-22");
		tVO.setTContent("목요일 오후");
		todoList.add(tVO);
		
		// 필드 생성자를 사용하여 객체 변수를 저장하면서 객체를 생성하기.
		tVO = new TodoVO("001","생성자","2022-05-22","09:00:00","","",false);
		
		todoList.add(tVO);
		
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		System.out.println(Line.dLine(50));
		// todoList 의 0번째 요소를 getter 하면
		// 한개의 todoVO 를 추출할 수 있다.
		TodoVO todoVO = todoList.get(0);
		todoVO.setTKey("009");
		
		todoList.set(0, todoVO);
		
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		todoList.get(1).setTKey("101");
		System.out.println(Line.dLine(50));
		for(TodoVO vo : todoList) {
			System.out.println(vo.toString());
		}
		
		
	}
}
