package com.cho.todo.controller;

import java.util.List;

import com.cho.todo.model.TodoVO;
import com.cho.todo.service.TodoService;
import com.cho.todo.service.impl.TodoServiceImplV2;

public class TodoControllerV2 {

	public static void main(String[] args) {
		
		TodoService tdS = new TodoServiceImplV2();

		List<TodoVO> todoList = tdS.todoSelectAll();
		
		for(TodoVO vo : todoList) {
			System.out.println(vo);
		}
	
	}

}
