package org.java.basic.oopEx;

import org.java.basic.modifyEx.AClass;

public class AClassMain {

	public static void main(String[] args) {
		System.out.println("접근제한자(지정자)");
		
		AClass a1= new AClass();
		a1.a=100;		
		System.out.println(a1.a);
		
		System.out.println("private-> setters,getters");
		a1.setAge(50);
		int age1=a1.getAge();
		System.out.println(age1);
				
	}
}
