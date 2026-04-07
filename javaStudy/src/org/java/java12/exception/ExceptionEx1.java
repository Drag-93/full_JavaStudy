package org.java.java12.exception;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		System.out.println("Exception");
		// 1. 정상적으로 프로그램을 실행하기 위해
		// 2. 예외를 처리 -> 미리예상
		int num1 =100;
		
		Scanner input = new Scanner(System.in);
		System.out.println("num1-> "+num1);
		System.out.println("나누는 수: ");
		int num2 = input.nextInt();
//		 int num3 = num1/num2;
//		System.out.println(num3);
		try {
			// 예외가 발생 할 예상 ->
			int num3 = num1/num2;
			// 예외가 발생하면 실행 안됨
			System.out.println(num3);
		} catch ( ArithmeticException e) {
			System.out.println("0으로 나눔!!");
			// 예외처리
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			// 외부 연결, DB -> SQL 실행후
			System.out.println("예외 발생과 상관없이 실행");
		}
		input.close();
		System.out.println("프로그램 정상 실행");
		
	}
	
}
