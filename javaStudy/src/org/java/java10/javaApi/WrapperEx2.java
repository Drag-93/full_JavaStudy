package org.java.java10.javaApi;

public class WrapperEx2 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		System.out.println("언박싱(Wrapper -> 기본자료형)");
		// 언박싱 -> 객체 -> 기본자료형
		// 박싱 기본자료형 -> 객체형
		// 언박싱  Byte ->byte
		Byte b = new Byte((byte) 10); // int ->byte
		byte b2 = b.byteValue();		
		// Short -> short
		Short s = new Short((short) 10);// int -> short
		short s2 = s.shortValue(); 		
		// Integer -> int
		Integer i = new Integer(10);  //박싱
		int i2 = i.intValue();		// 언박싱
		// Long -> long
		Long l = new Long(10);
		long l2 = l.longValue();
		// Float -> float
		Float f = new Float(10);
		float f2 = f.floatValue();
		// Double -> double
		Double d = new Double(10);
		double d2 = d.doubleValue();
		// Character -> char
		Character ch = new Character('a');
		char ch2 = ch.charValue();
		// Boolean -> boolean
		Boolean bool = new Boolean(false);
		boolean bool2 = bool.booleanValue();

		System.out.println(b + ", " + b2);
		System.out.println(s + ", " + s2);
		System.out.println(i + ", " + i2);
		System.out.println(f + ", " + f2);
		System.out.println(d + ", " + d2);
		System.out.println(ch + ", " + ch2);
		System.out.println(bool + ", " + bool2);

	}
}