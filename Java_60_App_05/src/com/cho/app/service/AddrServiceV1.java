package com.cho.app.service;

import java.util.List;

import com.cho.app.model.AddressVO;

public class AddrServiceV1 {

	public void printAddr(AddressVO adVO) {
		System.out.println(adVO.toString());
	}
	
	public void printAddrList(List<AddressVO> adVO) {
		for(AddressVO vo : adVO) {
			System.out.println(vo);
		}
	}
	
	public void printAddrList(AddressVO[] advo) {
		for(AddressVO vo : advo) {
			System.out.println(vo);
		}
	}
}
