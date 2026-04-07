package org.java.basic.inheritanceEx;

class A{
	int num0;
}
class Parent1 extends Object{
	int num1;
	int num2;
	public Parent1() {
		super();
	}
	
	public Parent1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	void m1() {
		System.out.println("m1-> Prarent1");
	}

}
class Sub1 extends Parent1{
	
	int num3;	

	public Sub1() {
		super();
	}
	
	public Sub1(int num3) {
		super(100,200);
		this.num3=num3;
		System.out.println("생성자상속");
	}
	
	//부모클래스의 m1매서드를 재정의 -> 오버라이딩
	@Override
	void m1() {		
//		super.m1();
		System.out.println("m1매서드 오버라이드");
	}
//	@Override  
//	void m1() {
//		System.out.println("m1매서드 재정의");
//	}
	
	void m2() {
		System.out.println("m2");
	}
}

public class InhertanceEx1 {

	public static void main(String[] args) {
		Sub1 s1= new Sub1();
		s1.m1();		
		
	    s1.num2=10;
	    s1.num2=200;
	    s1.num3=30;
	    s1.m1();
	    s1.m2();
		
	    Parent1 p1= new Parent1();
	    p1.num1=200;
	    p1.num2=11;
	    p1.m1();
		
		
	}
}
