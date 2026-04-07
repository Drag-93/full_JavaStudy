package org.java.java8.interfaceEx;

public class InterfaceEx0Main {
	public static void main(String[] args) {
		System.out.println("인터페이스");
		
//		new InterfaceEx0(); -> 객체생성이 안됨 -> 구현체가 구현 필요
		
		
		//구현체(InterfaceEx0Sub)로 객체생성
		InterfaceEx0Sub in1= new InterfaceEx0Sub();
		in1.ab1();
		in1.ab2();
		in1.ab2(100, 200);
		in1.ab3();
		
				
		//다형성
		InterfaceEx0 i0=new InterfaceEx0Sub();
		i0.ab1();
		i0.ab2();
		i0.ab2(100, 200);
		
		
		InterfaceEx1 i1=new InterfaceEx0Sub();
		i1.ab3();
		
		
		
		
	}
}
