# 데이터가 있는 프로젝트
* CRUD 를 구현한다.
## CREATE : 데이터 추가하기, 키보드에서 입력, 파일로부터 읽어오기
1. 키보드에서 입력
2. 데이터 검증
3. VO 객체에 담기 : VO 클래스를 사용하여 vo 객체를 생성하고 setting
4. List 에 추가
5. 필요한 곳으로 이동 : file 에 저장 또는 DBMS 에 insert

## READ : 데이터 조회하기, 저장소에 저장된 데이터를 Select 하여 보여주기
1. Data 저장소에 연결 : DBConnection, FileOpen(Scanner..)
2. 데이터를 모두 읽기
3. VO 객체에 담기 위해 적절히 분해(Encoding)
4. VO 를 List 에 추가
5. Console 로 보이기 등을 위하여 이동

* ScoreServiceImplV2 는 ImplV1 을 상속받아서 나머지 method 를 작성한다.
* ScoreServiceImplV3 는 V2 를 상속받았다.

# 입력한 데이터를 txt file 에 저장하기 [ImplV3](https://github.com/dosunggil/Class/blob/master/Java_60_App_02/src/com/cho/app/service/impl/ScoreServiceImplV3.java)
* controllerV3 에서 입력한 정보를 [controllerV3 패키지](https://github.com/dosunggil/Class/tree/master/Java_60_App_02/src/com/cho/app/service/controller)에 있는 score.txt 에 저장하기.


