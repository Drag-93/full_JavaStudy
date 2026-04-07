package org.java.java8.interfaceEx;

public interface InterfaceEx0 {
	
	
//	public int num;
	//반드시 public 
	//일반 안됨 -> final,default,static,abstract ,,,
	public final int NUM=100;
	
//	public void m1() {
//		System.out.println("일반");
//	}
	
	public default void m1() { //default -> 구현 선택
		System.out.println("default");
	}
	
	public static void m2() {
		System.out.println("static");
	}
	
	//abstract -> 추상매서드는 무조건 abstract니까 없어도 오류 안생김
	public abstract void ab1();
	public void ab2();
	public void ab2(int num1,int num2);
	
}
