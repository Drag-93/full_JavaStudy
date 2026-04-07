package org.java.basic.oopEx;

public class OverLoadingClass {

	public int num1;
	public int num2;

	//생성자 오버로딩
	public OverLoadingClass() {
		// TODO Auto-generated constructor stub
	}
		
	public OverLoadingClass(int num1) {
		this.num1=num1;
	}
			
	public OverLoadingClass(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}




	public void method1() {
		System.out.println("method1");
	}
		
	public void method1(int num1) {
		System.out.println(num1);
	}

	public void method1(int num1, String name) {
		System.out.println(num1+name);
	}
	public void method1(String name, int num1) {
		System.out.println(num1+name);
	}

//	public void method1(String num1, int name) {
//		System.out.println(num1+name);
//	}
}
