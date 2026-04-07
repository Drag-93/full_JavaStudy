package org.java.basic.operatorEx;

public class OperatorEx5 {
	public static void main(String[] args) {
		System.out.println("& -> and 연산자");
		System.out.println("10&12-> "+(10&12));
		//10진수 -> 문자열 2진수
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(10&12));
		System.out.println(10&12);
		
		System.out.println();
		
		System.out.println("| -> or 연산자");
		System.out.println("10|12-> "+(10|12));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(10|12));
		System.out.println(10|12);
		
		System.out.println();
		
		System.out.println("^ -> xor 연산자");
		System.out.println("10^12-> "+(10^12));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(10^12));
		System.out.println(10^12);
		
		System.out.println();
		
		System.out.println("~ -> not 연산자");
		System.out.println("~10 -> "+(~10));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(~10));
	}
}
