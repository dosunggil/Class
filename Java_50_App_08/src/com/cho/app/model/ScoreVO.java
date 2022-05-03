package com.cho.app.model;

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
public class ScoreVO {
	
	protected String stNum;
	protected int intKor;
	protected int intEng;
	protected int intMath;
	protected int intSum;
	protected float fAvg;

}
