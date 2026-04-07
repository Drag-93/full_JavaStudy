package org.java.java9.innerClass;

interface In4{
	void m1();
}
class In4Sub implements In4{
	@Override
	public void m1() {
		System.out.println("m1->오버라이드 In4");
	}
	
}


public class RamdaEx1 {

	public static void main(String[] args) {
		//1. 구현객체
		In4Sub i4=new In4Sub();
		i4.m1();
		//2. 익명클래스
		In4 in4=new In4() {
			
			@Override
			public void m1() {
				System.out.println("m1()->오버라이드 In4(익명)");
			}
		};
		in4.m1();
		
		System.out.println("=====람다식=====");
		//람다식1
		In4 in42=()->{ System.out.println("m1()->오버라이드 In4(람다식)");};
		in42.m1();
		
		//람다식2
		In4 in43=() -> System.out.println("m1()->오버라이드 In4(람다식)");
		in43.m1();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
