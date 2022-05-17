package com.cho.app.service;

import java.util.List;

import com.cho.app.model.BookVO;

public class BookServiceImplV1 implements BookService {

	/*
	 * protected 제한자
	 * 
	 * protected 는 기본적으로 private 성질을 가지면서
	 * 상속받은 클래스에서는 public 처럼 변수에 접근할 수 있다.
	 */
	protected List<BookVO> bookList;
	
	@Override
	public void inputBook() {
		// TODO Auto-generated method stub
	}

	@Override
	public void bookList() {
		// TODO Auto-generated method stub
	}

}
