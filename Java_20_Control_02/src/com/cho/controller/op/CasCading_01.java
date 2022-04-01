package com.cho.controller.op;

public class CasCading_01 {

	public static void main(String[] args) {

		// java에서 취급하는 정수
		short shortNum1 = 0; // 2의 16제곱
		int intNum1 = 0; // 2의 32제곱
		long longNum1 = 0; // 2의 64제곱

		/*
		 * 크기(저장공간)가 작은 type의 변수에 
		 * 크기가 큰 type의 변수값을 복사 대입하는 경우에는
		 * 값을 잃을 수 있다.
		 * 해서 저장하려 할땐 강제 형 변환(CasCading)을 해주어야 한다.
		 * 강제 형 변환을 수행했을 때 예측할 수 없는 결과가 나올 수 있고,
		 * 그 책임은 개발자 몫이다.
		 */
		shortNum1 = (short)intNum1;
		intNum1 = (int)longNum1;
		
		/*
		 * ***매우 주의해야할 코드***
		 * 연산식에 복합연산자가 포함될 겨우
		 * 변수간에 강제 형 변환이 발생한다.
		 * 결과는 예측할 수 없다.
		 * 중요한 문제를 야기할 수 있다.
		 */
		shortNum1 += intNum1;
		intNum1 += longNum1;
		
		
		/*
		 * 실수값(double,float)을 정수형 변수에 대입하면
		 * 문법 오류가 발생한다.
		 * 이것은 오차에 대한 안전장치이다.
		 * 경우에 따라 소수점 이하 값을 무시하고 
		 * 강제로 형변환을 하여 실수값을 정수형 변수에 대입하기도 한다.
		 */
		intNum1 = (int)3.0;
		intNum1 += 3.0;
		
		/*
		 * 복합연산자가 포함된 식에서는
		 * 실수값을 정수값에 대입하는데 문법 오류가 나지 않는다.
		 * 내부적으로 강제 형 변환이 일어나기 때문이다
		 * 값을 예측할 수 없고 논리적인 문제를 일으키지 않으면
		 * "많은 값을 대입"하여 오류를 방지해야 한다.
		 */
		intNum1 = 0;
		intNum1 += 3.92321321;
		System.out.println(intNum1);
	}
}
