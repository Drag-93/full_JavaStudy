package org.java.java9.innerClasss;

public class InnerClassBasice1Main {

	public static void main(String[] args) {

		System.out.println(InnerClassBasic1.MEBER_MAX);
		
		InnerClassBasic1 inner1 = new InnerClassBasic1();
		inner1.a = 10;
		inner1.instanceMethod();
		inner1.op();
		
		//내부클래스에 접근 방법
		System.out.println("====인스턴스클래스====");
		// new 외부클래스().new 내부클래스()
		InnerClassBasic1.InstanceClass instanceClass =
									new InnerClassBasic1().new InstanceClass();
		int b = instanceClass.b = 10;
		System.out.println("내부클래스 b-> " + b);
		instanceClass.m1();		
		
		// 외부클래스인스턴스.new 내부클래스()
		InnerClassBasic1 inner2 = new InnerClassBasic1();
		InnerClassBasic1.InstanceClass2 instanceClass2 = inner2.new InstanceClass2();
		int c = instanceClass2.c = 100;
		System.out.println("내부클래스 c-> " + c);
		instanceClass2.m2();
		
		System.out.println("====static클래스====");
		// 클래스맴버 -> 클래스명.맴버
		int max_number = InnerClassBasic1.MEBER_MAX;
		System.out.println(max_number);
		//외부클래스.static클래스.static맴버
		// static클래스 -> static맴버
		InnerClassBasic1.StaticClass.f = 100; // 필드
		InnerClassBasic1.StaticClass.f1(); // 매서드 호출
		
		System.out.println("====지역클래스====");
		// 지역클래스
		InnerClassBasic1 inner3 = new InnerClassBasic1();
		// 외부클래스.매서드 
		inner3.localMethod();
		
		
		
		
		
		
		
		
		

	}
}
