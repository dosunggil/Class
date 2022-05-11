package com.cho.todo.controller;

import java.util.List;

import com.cho.todo.model.TodoVO;
import com.cho.todo.service.InputService;
import com.cho.todo.service.TodoService;
import com.cho.todo.service.impl.InputServiceImplV2;
import com.cho.todo.service.impl.TodoServiceImplV1;
import com.cho.utils.Line;

public class TodoControllerV12 {

	public static void main(String[] args) {

		TodoService toService = new TodoServiceImplV1();
		InputService inService = new InputServiceImplV2();

		while (true) {

			Integer mainMenu = inService.menu();
			if (mainMenu == null) {
				System.out.println("업무선택을 다시 하세요.");
				continue;
			}
			if (mainMenu == 1) {
				while (true) {
					String content = inService.inputContent();
					if (content.equals("QUIT")) {
						break;
					}
					toService.todoInsert(content);
				} // end while
			} else if (mainMenu == 2) {
				List<TodoVO> todList = toService.todoSelectAll();
				printTodo(todList);

			} else if (mainMenu == 4) {
				List<TodoVO> todList = toService.todoSelectAll();
				printTodo(todList);
				System.out.println(Line.dLine(50));
				while (true) {
					System.out.println("완료할 할 일을 선택하세요.");
					Integer num = inService.selectTodo();
					if (num == null) {
						System.out.println("숫자로만 선택하세요.");
						continue;
					}
					if (num == -1)
						return;
					toService.compTodo(num);
					printTodo(todList);

				} // end while
			} // end if
		} // end while
	} // end main

	private static void printTodo(List<TodoVO> toVO) {
		System.out.println(Line.dLine(50));
		System.out.print("No\t");
		System.out.print("시작일자\t");
		System.out.print("시작시간\t");
		System.out.print("할일\t");
		System.out.println("상태");
		System.out.println(Line.sLine(50));
		int siz = toVO.size();
		for (int i = 0; i < siz; i++) {
			System.out.printf("%d\t", i + 1);
			System.out.printf(toVO.get(i).getSdate() + "\t");
			System.out.printf(toVO.get(i).getStime() + "\t");
			System.out.printf(toVO.get(i).getTContent() + "\t");

			String comp = toVO.get(i).getEdate() == null || toVO.get(i).getEdate().isBlank() ? "진행중" : "완료됨";
			System.out.println(comp);
		}
	}
}
