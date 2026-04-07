package org.java.basic.varEx;

public class VarEx3 {

	public static void main(String[] args) {
		
		System.out.println("자바의 기본타입(primitive type)");
		
		/*
		 		1		2		4		8
		 정수형	byte	short	int		long
		 실수형					float	double
		 문자형			char
		 논리형	boolean		 
		 */
		
		// 정수형의 기본은 int
		System.out.println("정수형");		
		byte b=10;    // 1byte 8bit -128~+127  -> 오버플로워 조심
		
		byte b1=(byte)130;  // 큰자료형 -> 작은자료형으로 변환 (형변환)
		System.out.println("byte 오버플로워"); 
		System.out.println(b1); 
		// 127에서 1크면(128) 부호를 반대 = -> - -128
		// 127보다 2크면 -127
		// 127보다 3크면 -126		
		byte b2=(byte)-130;
		System.out.println("byte 언더플로워"); 
		System.out.println(b2); 
		// -128보다 1작으면  절대값은 1작고 부호를 반대	+127
		// -128보다 2작으면  절대값은 1작고 부호를 반대	+126
		short s=10;   // 2byte		-2^15~+2^15-1
		int i=10;	  // 4byte      -2^31~+2^31-1
		long l=10;    // 8byte      -2^63~+2^63-1
		
		int i2=(int)l;// 데이터손상  long -> int
		long i3=l;// 데이터 타입에 맞게 변수 설정
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println("실수형");
		// 실수형의 기본형은 double			
		float f1=1.1f;	// 4byte , 큰자료형에서 작은 자료형으로 형변환,데이터 손실
		float f2=(float)1.1;
		System.out.println(f1);
		System.out.println(f2);
		
		double d=1.1;
		System.out.println(d);
		
		System.out.println("문자형");		
		char ch='a';
		System.out.println(ch);
		
		System.out.println("논리형");
		boolean bool=false;
		System.out.println(bool);
		
	}
}

