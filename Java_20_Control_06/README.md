# 한정자, 제한자
* public, private, protected, (생략)
* 다른 클래스에서 method, 변수에 접근할 수 있는 권한을 제한한다.

## public
* 한 프로젝트에 있는 다른 클래스의 method를 자유롭게 호출하여 사용할 수 있다
* class 는 특별한 경우가 아니면 모두 public 으로 선언한다
* method 는 같은 클래스 내에서만 한정적으로 사용할 대는 private으로 선언하고, 그 외에는 public 또는 protected 로 선언한다.
* 변수에도 public 을 선언할 수 있는데, 변수를 class 영역에 선언했을 경우에만 가능하다. method 내에 선언된 변수에는 적용할 수 없다. (전역설정)

## private
* 같은 클래스에서만 접근할 수 있도록 은닉하는 것이다.
* 보통 method, 변수에만 설정한다.


## 생략 할 경우
* method 에 한정자를 생략하면 같은 package 에 있는 클래스에서만 호출할 수 있다.