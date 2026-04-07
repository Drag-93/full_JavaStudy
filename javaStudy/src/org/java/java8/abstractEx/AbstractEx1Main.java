package org.java.java8.abstractEx;

public class AbstractEx1Main {
	public static void main(String[] args) {

//		new AbstractEx1(); -> 안됨
		
		AbstractEx1Sub ab1=new AbstractEx1Sub();
		ab1.ab1();
		
		//다형성 -> 원하는 매서드만 구현하고 싶을 때 
		//다형성 사용해서 선택할 수 있음
		AbstractEx1 ab2= new AbstractEx1Sub();
		ab1.ab1();
		
		AbstractEx1Sub2Sub ab11=new AbstractEx1Sub2Sub();
		ab11.ab1();
		ab11.ab2();
		
		//다형성 -> 변수 타입에 따라서 사용하는 변수 정해줄 수 있음
		AbstractEx1 a1=new AbstractEx1Sub2Sub();
		a1.ab1();
		
		AbstractEx1Sub2 a2=new AbstractEx1Sub2Sub();
		a2.ab1();
		a2.ab2();
		
	}
}
