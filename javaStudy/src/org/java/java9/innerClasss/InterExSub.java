package org.java.java9.innerClasss;
		// 다중 상속 클래스 implements 인터페이스1,인터페이스2,,,
public class InterExSub implements InterEx2,InterEx3 {

	@Override
	public void ab2() {
		System.out.println("ab2-> 오버라이드");
		
	}

	@Override
	public void ab3() {
		System.out.println("ab3-> 오버라이드");
	}

	@Override
	public void ab4() {
		System.out.println("ab4-> 오버라이드");
	}

}
