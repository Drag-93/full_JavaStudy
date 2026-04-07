package org.java.basic.varEx;

public class VarEx2 {

	public static void main(String[] args) {
		
		System.out.println("변수명명규칙");

		/*
			[변수명명 규칙]
			1. 키워드(예약어)를 사용 X  int class ,,,
			2. 숫자로 시작 X  1Num
			3. 공백 X num 11
			4. _ $ 이외의 특수문자 X  num%%
			5. 대소문자 구분(약속)  Num num
			6. 소문자로 시작(약속)  num
			7. 다른 문자가 시작되면 대문자로 시작(약속)  userName
			8. 한글 사용 하지말자(약속) 한글변수
		*/
		
//		int class=10;
//		int int=10;
//		int 1num=10;
//		int n num=10;
		int _num1=10;
		int $num1=10;
//		int %num1=10;
		
		System.out.println(_num1);
		System.out.println($num1);
		
		int Num=10;
		int num=20;
		System.out.println(Num);
		System.out.println(num);

		int userAge=21;
		int userage=30;
		System.out.println(userAge);
		System.out.println(userage);
		
		int 한글=10;
		System.out.println("한글 -> "+한글);
		
	}
}
