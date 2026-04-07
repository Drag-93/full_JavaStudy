package org.java.basic.scannerEx;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("Scanner");
		
		/*
		 이름, 나이, 주소를 입력받고
		 "~님은 나이는 ~살이고 주소는 ~입니다"
		 콘솔에 출력
		 Scaner를 이용해서 
		 */		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("이름을 입력하시오.");
		String name=scn.next();
		
		System.out.println("나이를 입력하시오.");
		int age=scn.nextInt();		
		
		System.out.println("주소를 입력하시오.");
//		String addr=scn.next();
		// 버퍼 -> 임시저장소
		// 남아있는 엔터(\n)를 읽어서 버퍼를 비워줍니다.
		scn.nextLine();
		String addr=scn.nextLine();
		
		System.out.println(name+"님은 나이는 "+age+"살이고 주소는 "+addr+"입니다");
						
		
		scn.close();
		
		
		
		
		
		
		
	}
}
