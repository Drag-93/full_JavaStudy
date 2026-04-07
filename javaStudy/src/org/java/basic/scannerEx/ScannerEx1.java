package org.java.basic.scannerEx;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("Scanner");
		//사용자가 콘솔에 직접 입력		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("이름을 입력하시오.");
		String name= scn.next();// 문자열 입력
		System.out.println("당신의 이름은 -> "+name);
		System.out.println();
		
		System.out.println("나이를 입력하시오.");
		int age=scn.nextInt();
		System.out.println("당신의 나이는 -> "+age);
		System.out.println();
		
		//당신의 키는 double 소수
		System.out.println("키를 입력하시오.");
		double height= scn.nextDouble();
		System.out.println("당신의 키는 -> "+height);
		
		scn.close();
			
		
	}
}
