package org.java.java9.innerClass;

public class AbstractExMain {
	public static void main(String[] args) {
		AbstractExSub ab1= new AbstractExSub();
		ab1.ab1();
		ab1.num1=10;
		ab1.num2=20;
		ab1.num3=30;
		ab1.num4=40;
		
		//부모타입의 객체참조변수로 자식객체를 참조할 수 있다 <- 다형성
		AbstractEx ab2= new AbstractExSub();
		ab2.ab1();
		ab2.num1=10;
		ab2.num2=20;
		
	}
}
