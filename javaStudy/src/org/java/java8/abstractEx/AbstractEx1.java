package org.java.java8.abstractEx;

//public class AbstractEx1{
	//추상클래스
public abstract class AbstractEx1 {
	//일반 멤버
	public int num1;
	public int num2;
	
	//선언부
	public void m1() {
		System.out.println("일반 매서드 m1");
	}
	
	//선언부(구현부 없음) ->추상매서드 
//	public void ab1();
	//-> 
	public abstract void ab1();
}
