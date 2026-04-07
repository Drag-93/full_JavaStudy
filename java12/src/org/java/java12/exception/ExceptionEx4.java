package org.java.java12.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println("Exception");
		int num1 = 100;
		Scanner input = new Scanner(System.in);
		System.out.println("-> "+1);
		
		System.out.println("나누는 수: ");
		try {
			int num2 = input.nextInt();
			System.out.println("-> "+2);
			int num3=num1/num2;
			System.out.println("-> "+3);
			System.out.println(num3);
			System.out.println("-> "+4);
		}catch(ArithmeticException e) {
			System.out.println("-> "+5);
			System.out.println("0으로 나눔 Fail");
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("-> "+6);
			System.out.println("input type fail");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("-> "+7);
			System.out.println("모든 예외 처리");
			e.printStackTrace();
		}finally {
			
			System.out.println("-> "+8);
			System.out.println("예외 발생과 상관 없이 실행");
		}
		System.out.println("-> "+9);
		input.close();
		System.out.println("프로그램 정상 실행");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
	}

