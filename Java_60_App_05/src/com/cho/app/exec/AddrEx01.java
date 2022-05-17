package com.cho.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.cho.app.model.AddressVO;
import com.cho.app.service.AddrServiceV1;

public class AddrEx01 {

	
	public static void main(String[] args) {
	/*
	 * 데이터를 저장할 때 VO 클래스를 선언하고 객체를 만드는 이유
	 * 주소록 관리 애플리케이션을 만든다고 하면
	 * 각각 주소데이터에는 이름, 주소, 전화번호, 나이, 취미 등이 필요할 것이다.
	 * 이 데이터들을 개별적인 변수로 선언을 하여 사용할 수 있다.
	 * 또는 각각의 배열로 선언하여 사용할 수도 있다.
	 * 
	 * 개별적인 변수로 선언을 하거나, 배열로 선언을 하게 되면
	 * 이름 - 주소 - 전화번호 - 나이 - 취미 등의 데이터 연결이 
	 *		매우 불편하게 될 수 있다.
	 * 경우에 따라서는 서로 완전히 다른 데이터가 저장되거나
	 * 		출력될 수 있다.
	 * 
	 * 객체지향에서는 이러한 개별적인 변수들을 하나의 클래스(VO) 로 묶고
	 * 클래스를 사용하여 객체를 생성하면
	 * 객체와 함께 묶음으로 데이터를 관리할 수 있기 때문에
	 * 데이터가 서로 다른 값이 저장되는 것을 방지할 수 있다.
	 * 
	 * 또한 어떤 연산을 하기 위해서 method 에 매개변수로 전달하거나
	 * 연산결과를 return 할때도 객체단위로 이동이 가능하다.
	 * 
	 */
	List<AddressVO> adList = new ArrayList<>();
	AddressVO[] adArr = new AddressVO[4];
	
	AddressVO sung = new AddressVO();
	
	AddressVO hong = AddressVO.builder().name("홍길동").tel("010-3673-2216").addr("서래마을").age(34).hobby("도적질").build();
	sung.setName("성춘향");
	sung.setTel("010-0000-0000");
	sung.setAddr("광양");
	sung.setAge(21);
	sung.setHobby("영화감상");
	AddressVO lee = AddressVO.builder().name("이몽룡").tel(null).addr(null).age(0).hobby(null).build();
	
	AddrServiceV1  addService = new  AddrServiceV1 ();
	//addService.printAddr(hong);
	
	adList.add(lee);
	adList.add(hong);
	adList.add(sung);
	
	adArr[0] = hong;
	adArr[1] = lee;
	adArr[2] = sung;
	
	
	addService.printAddrList(adArr);
	addService.printAddrList(adList);
	
	}
	
}
