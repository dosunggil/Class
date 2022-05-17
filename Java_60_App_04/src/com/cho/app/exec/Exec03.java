package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.BookVO;

public class Exec03 {

	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		BookVO bookVO;

		for (int i = 0; i < 10; i++) {
			bookVO = new BookVO();
			bookVO.setTitle("DO it 자바");
			bookVO.setComp("이지즈퍼블리시");
			bookVO.setPrice(i + 1);
			bookList.add(bookVO);
		}
		System.out.println(bookList.toString());
	}
}
