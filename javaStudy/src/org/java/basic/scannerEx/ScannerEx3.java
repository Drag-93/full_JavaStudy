package org.java.basic.scannerEx;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		
		System.out.println("Scanner");
		
		// 정수 2개를 입력을 받아서 연산 실행
		// +, -, *, / 결과를 콘솔에 출력 해보세요
		// Scanner 클래스 이용해서	
		System.out.println("두수(정수)를 입력 받아 연산의 결과를 실행 하시오.");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int firstNum = input.nextInt();

		System.out.print("두번째 숫자: ");
		int secondNum = input.nextInt();

		System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
		System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
		System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
		System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
					// 소수 3째자리까지 실수
		String avg=String.format("%.3f", (firstNum+secondNum)/(double)2);
				
		System.out.println("두수의 평균: "+avg);
		
		
		input.close();
		
		
		
	}
}
 