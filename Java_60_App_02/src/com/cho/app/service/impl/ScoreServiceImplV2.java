package com.cho.app.service.impl;

import com.cho.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1A{
	
	public ScoreServiceImplV2() {
		super();
	}

	@Override
	public void inputScore() {
		while(true) {
			
			System.out.println("학생 이름 입력 (QUIT : 종료) >>  ");
			String stName = scan.nextLine();
			if(stName.equals("QUIT")) {
				System.out.println("QUIT 입력으로 종료합니다.");
				break;
			}
			
			String[] strSubject = {"국어", "영어", "수학"};
			Integer[] intScore = new Integer[3];
			int index = 0 ;
			for(index = 0 ; index < strSubject.length ;  index++) {
				intScore[index] = getScore(strSubject[index]);
				if(intScore[index] == null) {
					/*
					 * 만약 index 값이 0 이라면 "국어점수" 입력화면이 나타난다.
					 * 점수를 숫자로 입력하지 않으면 
					 * "국어점수는 숫자만 입력" 메세지를 보여주고 
					 * null 을 return 한다.
					 * 그러면 index 값을 -1 하여 같은 index 에 대해서 반복문을 시작한다.
					 */
					index--;
					continue;
				}
				if(intScore[index] < 0 ) break;
			}// end for

			if(index <strSubject.length) {
				System.out.println("성적 입력 중 중단하였습니다.");
				break;
			}
			
			/*
			 * Build 패턴을 사용하여 VO 객체 생성하면서 데이터 setting 하기
			 * 1. 생성자 키워드 new 사용하지 않음
			 * 2. 클래스.builder() 시작
			 * 3. VO 클래스에 정의된 변수이름이 method 역할 수행
			 * 4. 변수 이름에 해당하는 method 에 값 전달하여 데이터 저장
			 * 5. build() 호출하여 마감
			 * 
			 * Build 패턴을 사용하는 이유
			 * 1. VO 객체를 생성하고 setter method 를 사용하여 데이터를 저장하는 번거로움을 해결
			 * 2. 필드생성자를 사용할 때 모든 변수의 값을 준비해야하는 번거로움을 해결
			 * 3. 준비된 데이터만 가지고 VO 객체를 생성하면서
			 * 		데이터를 setting 할 수 있다.
			 *
			 *
			 */
			ScoreVO scVO = ScoreVO.builder()
							.stName(stName)
							.stKor(intScore[0])
							.stEng(intScore[1])
							.stMath(intScore[2])
							.build();
			stList.add(scVO);
		} //end while
		
		for(ScoreVO scVO : stList) {
			System.out.println(scVO.toString());
		}
	}
	
	/*
	 * 점수를 정확히 입력했으면 점수를 return 하고,
	 * 잘 못 입력했으면 null return
	 * QUIT 를 입력했으면 -1 return.
	 */
	private Integer getScore(String title) {
		System.out.printf("%s 점수 입력(QUIT : 종료) >> ", title);
		String score = scan.nextLine();
		if(score.equals("QUIT")) {
			return -1;
		}
		
		
		Integer intScore = 0 ;
		try {
			intScore = Integer.valueOf(score);
		} catch (Exception e) {
			System.out.printf("%s 점수는 숫자만 입력해야 합니다.\n", title);
			return null;
		}
		return intScore;
		
		
		
	}
}
