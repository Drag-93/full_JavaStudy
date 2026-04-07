package org.java.basic.scannerEx;

import java.util.Scanner;

public class ASCIIEx2 {
	public static void main(String[] args) {
		
		System.out.println("아스키코드");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("입력문자(대문자): ");
		//정석
		String ch = scn.next();
		
		int chInt=ch.charAt(0); // String->char
		
		System.out.println(chInt+32);
		System.out.println((char)(chInt+32));
		
		
		
		/* 이것도 맞음
		char large=scn.next().charAt(0);
					
		System.out.println(large + " -> " +(char)(large+32));
	// System.out.println((char)((int)large+32));
		*/
		scn.close();
	}
}
