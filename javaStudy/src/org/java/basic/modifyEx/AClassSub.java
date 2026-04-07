package org.java.basic.modifyEx;

public class AClassSub {

	public static void main(String[] args) {
		System.out.println("같은패키지");
		
		AClass a2= new AClass();
		a2.a=100;
		a2.b=200;
		a2.d=300;
		//private 맴버(필드) setters,getters
		a2.setAge(5000);
		System.out.println(a2.getAge());
		
	}
}
