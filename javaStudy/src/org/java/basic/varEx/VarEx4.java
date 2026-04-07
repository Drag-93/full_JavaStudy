package org.java.basic.varEx;

public class VarEx4 {

	public static void main(String[] args) {
		
		int i=10;
		
		// c1 -> 객체 참조변수, 인스턴스변수, 인스턴스,객체
		// new 객체생성 연산자(객체의 주소값을 생성) -> heap
		// 인스턴스화 ,객체화
		Class1 c1=	new Class1();
		// .객체접근연산자
		c1.num1=10;
		c1.num2=20;
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		c1.m1();
		c1.cal1(100, 200);
		
	}
}
