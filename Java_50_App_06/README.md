# 성적처리 프로젝트

* 학생의 국어, 영어, 수학 점수를 저장할 model.ScoreVO 클래스 작성
* service.ScoreService 클래스를 작성하여
* List<ScoreVO> 리스트를 선언하고
* makeScore() method 에서 각 과목에 50 ~ 100 까지 임의의 정수를 생성하여 저장하고 List 를 20개 작성
* scorePrint() 에서 성적리스트 출력


### 업무 순서
* 1. [VO클래스](https://github.com/dosunggil/Class/blob/master/Java_50_App_06/src/com/cho/app/model/ScoreVO.java)를 만들어서 데이터를 선언해준다. :  ```추상화```
* 2. [ScoreService 인터페이스](https://github.com/dosunggil/Class/blob/master/Java_50_App_06/src/com/cho/app/service/ScoreService.java)를 선언한다.
* 3. 인터페이스를 implements 할 [ScoreServiceImplV1 클래스](https://github.com/dosunggil/Class/blob/master/Java_50_App_06/src/com/cho/app/service/impl/ScoreSerivceImplV1.java) 선언.
* 3-1. ImplV1 에서는 makeScore(), scorePrint() 를 재정의.(주석확인)
* 4. ImplV2, ImplV3 참고


## 성적의 합계로 성적 정렬하기
* [Exec]()