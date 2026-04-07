package org.java.basic.varEx;

public class Class1 {
	// 맴버 -> 필드, 매서드
	
	// 필드
	public int num1; //  X맴버변수
	public int num2;
	// static -> 클래스맴버
	// final -> 한번만 초기화 -> javascript  const
	public static final String PROJECTNAME="프로젝트명";
	
	//매서드
	public void m1() {
		System.out.println("m1매서드");
//		return;
	}
	
	public void cal1(int num3,int num4) {
		System.out.println(num3+num4);
//		return;
	}
	
}
