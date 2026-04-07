package org.java.basic.modifyEx;

public class CClassMain {	
	public static void main(String[] args) {
		System.out.println("접근제한자(지정자)");
		
		CClass c1= new CClass();
//		c1.num1=0   // private int num1; -> 같은 클래스
		c1.num2=10; //int num2; -> 같은 패키지(default)
		c1.num3=20; //protected int num3;-> 같은패키지(상속)
		c1.num4=30; //public int num4;-> 같은 프로젝트

		
		
		
	}
	
}
