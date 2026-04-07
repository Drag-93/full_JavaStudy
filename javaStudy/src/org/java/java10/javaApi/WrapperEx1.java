package org.java.java10.javaApi;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx1 {

	public static void main(String[] args) {

		System.out.println("Wrapper");
		System.out.println("자바의 기본자료형(primitive type)");		
		
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		float f = 1.01f;
		double d = 1.01;		
		char ch = 'a';
		boolean bool = false;
		
		System.out.println("Wrapper-> 박싱");
		// 기본자료형(primitive type) -> 객체형			
		// 박싱 -> 기본자료형 -> 객체형
		Byte b2 = new Byte(b);  // new 권하지 않는다 -> 자동 박싱
		Short s2 = new Short(s);
		Integer i2 = new Integer(i);//
		System.out.println(i2);
		System.out.println(i2.toString());
		Long l2 = new Long(l);

		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);

		Float f2 = new Float(f);
		Double d2 = new Double(d);
		System.out.println(f2);
		System.out.println(d2);

		Character ch2 = new Character(ch);
		System.out.println(ch2);
		Boolean bool2 = new Boolean(bool);
		System.out.println(bool2);
		
		System.out.println(i==i2);
		System.out.println(i2.equals(i));
		
		System.out.println();			
		
		
	}
}