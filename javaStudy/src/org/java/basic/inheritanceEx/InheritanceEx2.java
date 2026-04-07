package org.java.basic.inheritanceEx;

class Parent extends Object{
	 int a; // 멤버필드
	 public Parent() {
//		 super();
		 this(10);//다른생성자
	}
	 public Parent(int a) {
		 System.out.println("다른생성자");
	 }
	 void m1() {
		 System.out.println("m1()-> Parent");
	 }
 }


 class S1 extends Parent{
	 int b;
	 public S1() {
		 super(); //부모의 기본생성자
//		 super(10); // 부모의 다른생성자
	 }
	 
	 public S1(int b) {
		 this.b=b;
	 }
	 
	 void m2() {
		 System.out.println("m2()-> Sub1");
	 }
	 
	 @Override // 오버라이드 -> 다형성
	 void m1() {
		 System.out.println("m1()-> 오버라이딩 Sub1");
	 } 
}
 
 class S2 extends S1{
	 int c;
	 public S2() {
		 super(10);
	 }
	 void m3() {
		 System.out.println("m3()-> Sub2");
	 }
	 @Override
	 void m1() {
		 System.out.println("m1()-> 오버라이딩 Sub2");
	 }
	 @Override
	 void m2() {
		 System.out.println("m2()-> 오버라이딩 Sub2");
	 }	 
 }





public class InheritanceEx2 {
	public static void main(String[] args) {
		
		Parent p1 = new Parent(); // 2
		p1.a=10;
		p1.m1();
		
		//다형성(Polymorphism)
		//1. 부모타입의 객체 참조변수로 자식객체를 참조 가능
		p1=new S1();
		p1.a=20;
		p1.m1();
		
		p1=new S2();
		p1.a=20;
		p1.m1();
		
		
		S2 s2=new S2();
		s2.a=10;
		s2.b=20;
		s2.c=30;
		s2.m1();
		s2.m2();
		s2.m3();
		
		
		
//		자식 타입 변수 -> 부모+자식 필드 전부 포함
//		부모 타입 변수 -> 부모+자식 객체를 참조 가능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
