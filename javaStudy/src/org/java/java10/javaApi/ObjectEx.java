package org.java.java10.javaApi;

import java.util.Scanner;
//import java.util.*;
class A1 extends Object{
	int a;
	int b;
//	public A1() {
//		super();
//	}
	void a1() {
		System.out.println("a1");
	}
	@Override
	public String toString() {
		return "A1 [a=" + a + ", b=" + b + "]";
	}
}
class B1 {
	private int a;
	private int b;
	void b1() {
		System.out.println("b1");
	}
	@Override
	public String toString() {
		return "B1 [a=" + a + ", b=" + b + "]";
	}	
}

public class ObjectEx extends Object{

	public ObjectEx() {
		super();//생략가능
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
         new Scanner(System.in);
		// 1. Object -> 모든 클래스의 부모 클래스
		// 2. Object -> 모든 클래스의 Object 매서드 상속받는다.
		A1 a1 = new A1();
		System.out.println(a1);
		System.out.println(a1.hashCode());  //인스턴스(객체)해시코드
		System.out.println(a1.getClass()); // 객체의 원 클래스 정보
		System.out.println(a1.getClass().getName()); // 클래스명org.java.java10.javaApi.A1
		//// org.java.java10.javaApi.A1@378bf509 <- 원본>
		System.out.println(a1.toString());

		System.out.println();

		B1 b1 = new B1();
		System.out.println("b1-> hashConde: " + b1.hashCode());
		System.out.println(b1.toString()); // 474675244== 1c4af82c
		// 클래스이름+"@"+Integer.toHexString(해시코드10진수)
		System.out.println(b1.getClass() + " < - b1 원래스");
		System.out.println(b1.hashCode() == a1.hashCode());
		System.out.println(b1.getClass().equals(a1.getClass()));
		System.out.println(b1.equals(a1));

		System.out.println();

		B1 b2 = new B1();
		System.out.println(b1.getClass());
		System.out.println(b2.getClass());
		System.out.println(b2.getClass().equals(b1.getClass()));
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);

	}
}