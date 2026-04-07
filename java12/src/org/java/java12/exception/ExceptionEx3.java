package org.java.java12.exception;

import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		System.out.println("Exceoption");
		Scanner input = new Scanner(System.in);
		
		try {
				//예외 예상코드
				System.out.println("나이: ");
				String age=input.next();
					//"숫자"입력-> 예외일 때 catch처리
				System.out.println(Integer.parseInt(age));
				
				
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("기본 실행");
			
		}
			
		input.close();
		
		System.out.println("프로그램 정상 실행");
		
		
		
		
		
		
		
		
		
	}
	
	
}
