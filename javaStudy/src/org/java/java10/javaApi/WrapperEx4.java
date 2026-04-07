package org.java.java10.javaApi;

public class WrapperEx4 {

	public static void main(String[] args) {
		
		System.out.println("자동언박싱");
		// 자동박싱
		Byte b = 10; // int ->byte
//		byte b2=b.byteValue();
		byte b2 = b; // 자동언박싱

		Short s = 10;// int -> short
		short s2 = s;

		Integer i = 10;
		int i2 = i;

		Long l = 10L;
		long l2 = l;

		Float f = 10.0f;
		float f2 = f;

		Double d = 10.0;
		double d2 = d;

		Character ch = 'a';
		char ch2 = ch;

		Boolean bool = false;
		boolean bool2 = bool;
		System.out.println(b + ", " + b2);
		System.out.println(s + ", " + s2);
		System.out.println(i + ", " + i2);
		System.out.println(l + ", " + l2);
		System.out.println(f + ", " + f2);
		System.out.println(d + ", " + d2);
		System.out.println(ch + ", " + ch2);
		System.out.println(bool + ", " + bool2);

	}
}