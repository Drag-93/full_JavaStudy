package org.java.basic.oopEx;//패키지

//접근제한자(접근지정자,modify) class 클래스명(대문자로시작)
//선안부
public class Class1 {
	//맴버	
	//필드
	public int num1;//인스턴스맴버
	public int num2;//인스턴스맴버	
	public static final int NUMMAX=10000;// 클래스(static)맴버
	
	//생성자 -> Construct 
	// -> 객체생성에 도움을 주는 일종에 매서드
	// -> 반환타입이 void이다 -> 그래서 생략한다.
	//기본생성자는 컴파일러가 자동으로 생성해준다
	//다른생성자를 생성할 경우 기본생성자는 생성되지 않는다.
	//기본생성자를 같이 사용할 경우 반드시 기본생성자로 생성해주어야된다.
	
	//**** 매서드 오버로딩(매서드의 이름이 같고 매개변수 갯수가 다를 때 허용)
	//기본생성자
	public Class1() {
		System.out.println("기본생성자");
	}
	//다른생성자
	public Class1(int num1) {
		System.out.println("다른생성자1");
		this.num1=num1;
	}	
	//다른생성자
	public Class1(int num1,int num2) {
		System.out.println("다른생성자2");
		this.num1=num1;
		this.num2=num2;
	}	
	
	//매서드
	//선언부
	//접근제한자 반환타입 매서드명(매서변수) 
	public void instanceMathed() { //인스턴스맴버
		//구현변
		System.out.println("instanceMathed");
		return;
	}
								// 지역변수 num3,num4
	public int instanceMethed2(int num3, int num4) {//인스턴스맴버
		//지벽변수  sum
		int sum=num3+num4;
		System.out.println(num3+"+"+num4+"="+(num3+num4));
		return sum;
	}
	public int getNum() {
		return num1+num2;
	}
	
	public static void staticMethod() {// static 맴버
		System.out.println("staticMethod");
	}
	
	
	
}
