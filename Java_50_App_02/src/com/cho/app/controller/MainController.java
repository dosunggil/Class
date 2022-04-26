package com.cho.app.controller;

public class MainController {

	public static void main(String[] args) {
		MenuController menu = new MenuController();
		StudentControllerV1 stController = new StudentControllerV1();
		
		
		while (true) {

			menu.viewMainMenu();
			Integer select = menu.selectMenu();
			if (select == null) {
				System.out.println("다시해라");
				continue;

			} else if (select == 1) {
				stController.selecMenu();
			} else if (select == 2) {
				while(true) {
				menu.viewScMenu();
				}
			} else if (select == -1) {
				break;
			} else {
				System.out.println("업무 선택을 잘못했습니다.");
			} // end if
		} // end while
		System.out.println("끝");
	} // end main
}// end class
