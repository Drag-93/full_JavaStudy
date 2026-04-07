package org.java.java10.javaApi;

public class WrapperEx5 {

	public static void main(String[] args) {
		System.out.println("Wrapper");
		
		int num1=100;
		Integer i=100;		
		System.out.println(Integer.toBinaryString(num1));// int -> 2진수 String
		System.out.println(Integer.bitCount(num1));		//  int -> 2진수 1의 갯수
		System.out.println(Integer.toOctalString(num1));	// 8진수 144
		System.out.println(Integer.toHexString(num1));	// 16진수 64		
		System.out.println();		
		
		String str="100";
		System.out.println(str.equals(100));		
		System.out.println();
		System.out.println("문자열 -> Integer ");
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.parseInt(str)==100);		
		System.out.println();
		
		System.out.println(Integer.toString(num1)+100);
		System.out.println(Integer.toString(105));  // 정수 -> 문자열 int -> String
		System.out.println(Integer.toString(105).equals("105"));
		
	}
}