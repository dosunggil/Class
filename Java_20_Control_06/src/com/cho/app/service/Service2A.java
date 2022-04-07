package com.cho.app.service;

public class Service2A {

	public void print() {
		
		/*
		 * ServiceV2 와 Service2A는 같은 package(c.c.a.service) 이기 때문에 import 하지 않아도 된다.
		 */
		ServiceV2 serviceV2 = new ServiceV2();
		
		/*
		 * sum() 는 private 이기 때문에 호출할 수 없다.
		 * add() 는 한정자를 생략했기 때문에 같은 Package 내에서 호출할 수 있다.
		 */
		//serviceV2.sum();
		serviceV2.add();
	}
}
