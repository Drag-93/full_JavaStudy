package org.java.basic.operatorEx;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		//1. 두 정수와 연산자(+-*/)를 입력을 받아서
		//2. 연산자에 따른 연산을 수행 하시오
		//3. 연산자(+-*/)이외의 값이 입력이 되면 "연산자 입력 오류"라고 콘솔에 표시
		//4. Scanner, 조건문(if),while
		//5. exit 입력시 종료
		
		Scanner input = new Scanner(System.in);
		Boolean bool = true;
		while(bool) {
		System.out.println("계산을 시작하시겠습니까?(yes/no): ");
		String calc=input.next();
			if(calc.equals("yes")) {
		System.out.println("정수 입력1: ");
		int num1 = input.nextInt();
		System.out.println("정수 입력2: ");
		int num2 = input.nextInt();
		System.out.println("연산자 입력(+,-,*,/),계산 종료(exit): ");
		String method = input.next();
		
		if(method.equals("+")) {
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
		}else if(method.equals("-")) {
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
		}else if(method.equals("*")) {
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
		}else if(method.equals("/")) {
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
		}else if(method.equals("exit")) {
			System.out.println("계산을 종료합니다");
			bool=false;
			break;		
		}
		else {
			System.out.println("연산자 입력 오류");
		}
			}else {System.out.println("계산을 종료합니다");
			bool=false;
			break;
			}
		}
	}
}
