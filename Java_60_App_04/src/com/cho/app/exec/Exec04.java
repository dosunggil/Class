package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.BookVO;

public class Exec04 {

	public static void main(String[] args) {

		List<BookVO> intList = new ArrayList<>();

		BookVO bookVO = new BookVO();
		for (int i = 0; i < 10; i++) {
			String title = ((int) (Math.random() * 1000) + 100) + "";
			bookVO.setTitle(title);
			intList.add(bookVO);
		}
		for (BookVO vo : intList) {
			System.out.println(intList.toString());
		}
	}

}
