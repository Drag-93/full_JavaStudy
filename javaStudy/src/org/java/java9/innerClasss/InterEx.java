package org.java.java9.innerClasss;

public interface InterEx {

//	public int num1;
	public final int NUM=100;
	//추상매서드
	public abstract void ab2();
	
	public static void m1() {
		System.out.println("static");
	}
	public default void m2() {
		System.out.println("default");
	}
}
