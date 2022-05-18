package com.cho.app.exec;

import com.cho.app.model.AddressVO;

public class Exec02 {

	public static void main(String[] args) {
		
		AddressVO[] addrs = new AddressVO[3] ;
		
		addrs[0]= new AddressVO();
		addrs[0].setName("홍");
		addrs[0].setAge(30);
		
		addrs[1] = AddressVO.builder().name("이").age(20).build();
		
		addrs[2] = AddressVO.builder().name("성").age(25).build();
		
		int size = addrs.length;
		for(int i = 0 ; i < size ; i ++) {
			for ( int j = i+1 ; j<size ; j++) {
				
				if(addrs[i].getAge() > addrs[j].getAge()) {
					AddressVO aVO = addrs[i];
					addrs[i] = addrs[j];
					addrs[j] = aVO;
				}
			}
		}
	}
}
