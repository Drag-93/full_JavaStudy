package org.java.basic.operatorEx;

public class OperatorEx6 {
	public static void main(String[] args) {
		System.out.println("Shift 연산자");
		
		int i = 10;
		
		
		System.out.println("오른쪽 shift >>   작아진다 ");
		System.out.println(i);
		System.out.println(i>>2);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i>>2));
		System.out.println(Integer.toBinaryString(i)+" >>2 -> "+Integer.toBinaryString(i>>2));
		
		
		
		System.out.println("왼쪽 shift >>    커진다");
		System.out.println(i);
		System.out.println(i<<2);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i<<2));
		System.out.println(Integer.toBinaryString(i)+" <<2 -> "+Integer.toBinaryString(i<<2));
		
	}
}
