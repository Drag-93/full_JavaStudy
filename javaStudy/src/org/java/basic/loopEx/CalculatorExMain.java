package org.java.basic.loopEx;

import java.util.Scanner;

public class CalculatorExMain {
	public static void main(String[] args) {
		System.out.println("계산기 프로그램(클래스이용)");
		
		CalculatorEx cal1=new CalculatorEx(100, 500, "+");
		cal1.getCalculatorMethod();
		
		System.out.println();
		
		CalculatorEx cal2=new CalculatorEx(500, 1000, "-");
			cal2.getCalculatorMethod();
		
		System.out.println();
		
		CalculatorEx cal3=new CalculatorEx();
		
		cal3.num1=1000;
		cal3.num2=50;
		cal3.op="/";
		
		cal3.getCalculatorMethod();
		
		//while,CalculatorEx,Scanner 이용
		//두수(정수),연산자(+*-/)를 입력해서 결과를 콘솔에 출력(getCalculatorMethod() 매서드를이용)
		//연산자 입력시 exit를 입력하면 while문을 종료
		
		Scanner input = new Scanner(System.in);
		CalculatorEx calc=new CalculatorEx();
		
		while(true) {
		
		System.out.print("숫자1 입력: ");
		calc.num1=input.nextInt();
		System.out.print("숫자2 입력: ");
		calc.num2=input.nextInt();
		System.out.print("연산자 입력: ");
		calc.op=input.next();
		
		calc.getCalculatorMethod();
		
		if(calc.op.equals("exit")) {
//			System.out.println("계산 종료");
			break;
		}
		
		}
		
		input.close();
		
	}
}
