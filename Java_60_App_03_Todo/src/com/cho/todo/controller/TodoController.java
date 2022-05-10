package com.cho.todo.controller;

import java.util.List;

import com.cho.todo.model.TodoVO;
import com.cho.todo.service.TodoService;
import com.cho.todo.service.impl.TodoServiceImplV1;

public class TodoController {

	public static void main(String[] args) {
		
		TodoService tdService = new TodoServiceImplV1();
		tdService.todoInsert("메모");

		List<TodoVO> todoList = tdService.todoSelectAll();
		
		for(TodoVO tVO : todoList) {
			System.out.println(tVO.toString());
		}
	}
}
