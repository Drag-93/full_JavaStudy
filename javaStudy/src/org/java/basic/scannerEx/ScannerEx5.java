package org.java.basic.scannerEx;

// 자바의 기본패키지 ->  import를 생략 할 수 있다.
//import java.lang.String;

import java.util.Scanner;

public class ScannerEx5 {

	public static void main(String[] args) {
		
		// 정수 2개와 연산자(+*-/%) 입력을 받아서 연산 실행 하고
		// 연산의 결과를 콘솔에 출력 해보세요
		// 연산자를 잘못입력하면 "연산자 입력오류! 다시입력하세요" 콘솔에 출력 해보세요
		// Scanner 클래스 이용해서		
		
		System.out.println("두수(정수)를 입력 받아 연산의 결과를 실행 하시오.");
		Scanner scn= new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int firstNum = scn.nextInt();

		System.out.print("두번째 숫자: ");
		int secondNum = scn.nextInt();
		
		System.out.println("연산자(+*-/%) 입력");
		
		String op=scn.next();
		
		if(op.equals("+")) {
			System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));			
		}else if(op.equals("-")) {
			System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));			
		}else if(op.equals("*")) {
			System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));			
		}else if(op.equals("/")) {
			System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));			
		}else if(op.equals("%")) {
			System.out.println(firstNum + "%" + secondNum + "=" + (firstNum % secondNum));			
		}else {
			System.out.println("연산자 입력오류! 다시입력하세요");
		}
		
//		System.out.println("평균: " + String.format("%.3f", ((firstNum + secondNum) / (double) 2)));

		scn.close();
	}
}
