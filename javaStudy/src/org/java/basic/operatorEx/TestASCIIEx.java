package org.java.basic.operatorEx;

import java.util.Scanner;

public class TestASCIIEx {
	public static void main(String[] args) {
		System.out.println("아스키코드 -> 테스트");
		
		Scanner input = new Scanner(System.in);
		
		// 대문자 -> 소문자로 변환해서 콘솔에 출력
		// Scanner, println, print, next(), nextInt()..이용
		
		System.out.println("대문자를 입력하세요");
		
		String alpha=input.next();
		int intCh = alpha.charAt(0);
		char ch1=alpha.charAt(0);
		
		System.out.println(intCh);
		System.out.println("대문자 -> "+ch1);
		
		System.out.println(ch1+32);
		System.out.println("소문자 -> "+(char)(ch1+32));
//		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		input.close();
	}
}
