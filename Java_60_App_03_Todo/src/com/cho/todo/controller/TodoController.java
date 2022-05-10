package com.cho.todo.controller;

import com.cho.todo.service.TodoService;
import com.cho.todo.service.impl.TodoServiceImplV1;

public class TodoController {

	public static void main(String[] args) {
		
		TodoService tdService = new TodoServiceImplV1();
		tdService.todoInsert("메모");
		tdService.toString();
	}
}
