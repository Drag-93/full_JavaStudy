package org.java.java10.javaApi;

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		System.out.println("String -> 기본 String은 변하지 않는다");
		
		String s1="java";
		String s2="Study";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s2);
		//새로운 객체를 만들어서 저장
		String s3=s1.concat(s2);
		System.out.println(s3);		
		System.out.println();
		
			
		System.out.println("StringBuffer");
		// StringBuffer 생성
		// 1. 기본 new 
		StringBuffer sb1= new StringBuffer();
		
		System.out.println("sb1-> "+sb1);		
		System.out.println("sb1-> "+sb1.length());		
		sb1.append("추가1"); // 원 문자열 뒤에 문자열을 추가
		System.out.println("sb1-> "+sb1+" , "+sb1.length());

		System.out.println();		
		// 2. new 용량 직접 설정
		StringBuffer sb2= new StringBuffer(32);
		System.out.println("sb2-> "+sb2.length());		
		sb2.append("추가2");
		System.out.println("sb2-> "+sb2+" , "+sb2.length());		
		
		System.out.println();

		// 3. new 문자열 초기화
		StringBuffer sb3= new StringBuffer("java Spring");
		System.out.println("sb3-> "+sb3.length());		
		System.out.println("sb3-> "+sb3+" , "+sb3.length());		
		sb3.append("추가3");
		System.out.println("sb3-> "+sb3+" , "+sb3.length());
		
		
	}
}
