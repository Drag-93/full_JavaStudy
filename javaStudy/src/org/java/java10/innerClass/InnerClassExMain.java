package org.java.java10.innerClass;

public class InnerClassExMain {

	public static void main(String[] args) {

		System.out.println(InnerClassEx.d);

		InnerClassEx inner1 = new InnerClassEx();
		inner1.c = 10;
		inner1.d = 200;
		// 내부클래스
		// 인스턴스 클래스
		//외부클래스.내무클래스					//new 외부클래스().new 내부클래스()
		InnerClassEx.InstanceClass inner2 = new InnerClassEx().new InstanceClass();
		inner2.a = 200;
		inner2.m1();
		
		// static클래스 -> 부모클래스.static클래스
		InnerClassEx.StacticClass.m2();
		InnerClassEx.StacticClass.PROJECT = "WEB2026";
		
		// 지역클래스 -> 매서드를 호출 -> 지역클래스 호출
		InnerClassEx inner3 = new InnerClassEx();
		inner3.localMethod();

	}
}