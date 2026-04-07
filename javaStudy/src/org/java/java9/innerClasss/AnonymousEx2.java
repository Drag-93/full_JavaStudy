package org.java.java9.innerClasss;
// 추상클래스
abstract class Ab1 {
	abstract void a();
}

//구현객체 역할만 ->Ab1Sub
class Ab1Sub extends Ab1 {
	@Override
	void a() {
		System.out.println("a -> 오버라이드");
	}
}

public class AnonymousEx2 {

	public static void main(String[] args) {
		// 구현클래스
		Ab1 ab = new Ab1Sub();
		ab.a();
		// 익명클래스
		Ab1 ab1 = new Ab1() {
			@Override
			void a() {
				System.out.println("추상클래스 -> 익명클래스 이용");

			}
		};
		ab1.a();

	}
}
