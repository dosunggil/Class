package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.AddressVO;

public class Exec03 {

	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>();
		
		AddressVO aVO = new AddressVO();
		aVO.setName("홍");
		aVO.setAge(30);
		addrs.add(aVO);
		
		addrs.add(AddressVO.builder().name("이").age(20).build());
		addrs.add(AddressVO.builder().name("성").age(25).build());
		addrs.add(new AddressVO());
		
		int size = addrs.size();
		addrs.get(size-1).setName("임");
		addrs.get(size-1).setAge(40);
		
		
		
		
		for(int i = 0 ; i < size ; i ++) {
			for ( int j = i+1 ; j<size ; j++) {
				if(addrs.get(i).getAge() > addrs.get(j).getAge()) {
					AddressVO tVO = addrs.get(i);
					
					addrs.set(i, addrs.get(j));
					
					addrs.set(j,tVO);
				}
			}
		}
	}
}
