package org.java.basic.varEx;

public class VarEx6 {

	public static void main(String[] args) {
		System.out.println("형변환");

		/*
		 **** 형변환의 규칙 1. 같은 자료형의 연산은 같은 형으로 형변환(기본) 2. 작은 자료형에서 큰자료형 변환시 자동형변환 3. 작은자료형과
		 * 큰자료형과의 연산 시 큰자료형으로 자동형변환 4. int형 아래 자료형으로 연산자 int형으로 자동 형변환
		 * 
		 */
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 0;
		int i1 = 0;
//		b3=(byte)b1+b2;// (byte)int+int
		// b3=(byte)b1+(byte)b2;// (byte)int+(byte)int-> byte+byte-> int+int
		// 강제형변환,
		b3 = (byte) (b1 + b2);// (byte)(b1+b2)
		System.out.println(b3);

		i1 = b1 + b2;/// byte+byte-> int+int 자동형변환

		System.out.println(i1);

		int i2 = 0;
		byte b4 = 10;
		i2 = b4; // 자동형변환 작은형-> 큰형

		b4 = (byte) i2; // 강제형변환 큰형-> 작은형 ,데이터 손실

		System.out.println();

		byte b5 = 10;
		int i5 = b5 + 10;// byte+int-> int+int , 자동형변환

		byte b52 = (byte) (b5 + 10);// 강제형변환

		System.out.println();
		
		double d=10;// int -> double
		System.out.println(d);

		System.out.println(55/3);//18
		System.out.println((double)(55/3));// int/int -> int
		System.out.println((double)55/3);
		// 자동형변환		
		double d2=1.1+10;// double+int-> double+double
		System.out.println(d2);
		
		//실수형의 기본형 double
		//강제형변환 -> 데이터손실
		float f1=(float)1.1;//double 8 -> float 4
		float f2=1.1f;
		System.out.println(f1);
		System.out.println(f2);
		

	}
}
