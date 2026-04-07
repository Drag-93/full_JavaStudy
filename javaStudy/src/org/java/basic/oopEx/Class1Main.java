package org.java.basic.oopEx;

public class Class1Main {

	public static void main(String[] args) {
		System.out.println("클래스");
		System.out.println("클래스(static)맴버");
		//클래스명.static맴버 -> 공유자원
		System.out.println(Class1.NUMMAX);
		Class1.staticMethod();
		
		System.out.println();
		
		// new 객체생성연산자
		// 객체화(인스턴스화)
		// 객체 참조연산-> 인스턴스,객체
		// 사용자 정의 타입 -> 클래스
		Class1 c1 = new Class1();
		c1.num1 = 100;
		c1.num2 = 200;
		int num = c1.getNum();
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(num);
		c1.instanceMathed();
		c1.instanceMethed2(25, 50);
		
		System.out.println();

		Class1 c2 = new Class1(500);
		c2.num2 = 3000;
		int num22 = c2.getNum();
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(num22);
		c2.instanceMathed();
		c2.instanceMethed2(560, 500);
		
		System.out.println();

		Class1 c3 = new Class1(150, 230);
		int num33 = c3.getNum();
		System.out.println(c3.num1);
		System.out.println(c3.num2);
		System.out.println(num33);
		c3.instanceMathed();
		c3.instanceMethed2(150, 650);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
