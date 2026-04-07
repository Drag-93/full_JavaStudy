package org.java.java9.innerClass;

public class InnerClassBasic1 {
	// 인스턴스맴버
	public int a;
	// 클래스 맴버
	public static final int MEBER_MAX = 1000;

	public void op() {
		int a = 10; // 지역변수
		int b = 10;
		System.out.println(a + b);
	}
	// 인스턴스맴버
	public void instanceMethod() {
		System.out.println("instanceMethod");
	}
	// static맴버 -> static매서드
	public static void staticMethod() {
		// static 맴버(필드)만 참조
		System.out.println(MEBER_MAX);
	}
		
	// 인스턴스 클래스  -> 인스턴스 맴버 위치
	class InstanceClass {
		int b;
		void m1() {
			System.out.println("m1()");
		}
	}
	// 인스턴스 클래스  -> 인스턴스 맴버 위치
	class InstanceClass2 {
		int c;
		void m2() {
			System.out.println("m2()");
		}
	}
	// static클래스
	static class StaticClass {
		static int f;
		static void f1() {
			System.out.println("f1()");
		}
	}		
	// 지역(local) 클래스
	public void localMethod() {
		class LocalCalss {
			int d;
			void m4() {
				System.out.println("LocalCalss-> m4");
			}
		}
		LocalCalss local = new LocalCalss();
		local.d = 100;
		local.m4();
	}


}