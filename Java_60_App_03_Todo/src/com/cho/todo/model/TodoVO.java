package com.cho.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class TodoVO {

	private String tKey;		 // ID 에 해당하는 칼럼
	private String tContent;	 // 할 일 내용
	private String sdate;		 // 추가한(시작한) 날짜
	private String stime;		 // 추가한(시작한) 시각
	
	private String edate;   	 // 완료한 날짜
	private String etime;		 // 완료한 시각
	
	private boolean bComp;		 // 완료 여부
}
