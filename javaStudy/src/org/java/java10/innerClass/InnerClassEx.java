package org.java.java10.innerClass;

public class InnerClassEx {
	public int c;
	public static int d;

	// 필드
	// 인스턴스 클래스
	class InstanceClass {
		int a;

		void m1() {
			System.out.println("m1");
		}
	}

	// static 클래스
	public static class StacticClass {
		static String PROJECT;

		static void m2() {
			int f = d;
			System.out.println("m2");
		}
	}

	// local 클래스
	public void localMethod() {
		class LocalClass {
			void m3() {
				System.out.println("m3");
			}
		}
//		LocalClass l1 = new LocalClass();
//		l1.m3();
		new LocalClass().m3();
	}

}