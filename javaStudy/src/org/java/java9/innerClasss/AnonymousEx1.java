package org.java.java9.innerClasss;

class A {
	void m1() {
		System.out.println("m1");
	}
}
// 구현객체 역할만 -> ASub
class ASub extends A{
	@Override
	void m1() {
		System.out.println("m1-> 오버라이드");
	}
}
public class AnonymousEx1 {
	public static void main(String[] args) {
		//구현클래스
		ASub a0= new ASub();
		a0.m1();		
		// 무명(익명)클래스를 생성 하고 부모클래스A를 상속
		// 다형성 -> 부모타입(A)의 객체 참조변수 a1		
		A a1 = new A() {
			@Override
			void m1() {	System.out.println("m1-> 오버라이드");}
		};	a1.m1();		
		A a2=new A() {
			@Override
			void m1() {	super.m1();	}
		};a2.m1();
		new A() {
			@Override
			void m1() {System.out.println("m1-> 오버라이드3");}
		}.m1();

	}
}
