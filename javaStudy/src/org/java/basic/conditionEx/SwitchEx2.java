package org.java.basic.conditionEx;

import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		System.out.println("switch");
		
		//영문자소문자,대문자를 입력하면 -> 대문자 출력
		//예) "a"->"A", "A"->"A"
		// a A, b B, c C, 나머지는 "입력값이 다릅니다" 출력
		//Scanner, switch~case 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자 입력: ");
		String str=input.next();
		
		switch(str) {
		case "a":
		case "A":
			System.out.println("A");
			break;
		case "b":
		case "B":
			System.out.println("B");
			break;
		case "c":
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("입력값이 다릅니다");
		}
		
		input.close();
					
		}
		
}