package org.java.java8.interfaceEx;
													//다중상속이 가능하다
public class InterfaceEx0Sub implements InterfaceEx0,InterfaceEx1{

	@Override
	public void ab1() {
		System.out.println("ab1->추상매서드");
		
	}
//	m1 -> default -> 해도 되고 안해도 됨->선택
	@Override
	public void ab2() {
		System.out.println("ab2->추상매서드");
	}

	@Override
	public void ab2(int num1, int num2) {
		System.out.println("ab2->추상매서드");
	}

	@Override
	public void ab3() {
		System.out.println("ab3->추상매서드");
	}
}
