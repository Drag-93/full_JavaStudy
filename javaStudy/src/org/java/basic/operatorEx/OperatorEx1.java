package org.java.basic.operatorEx;

import java.util.Scanner;

public class OperatorEx1 {
	public static void main(String[] args) {
		System.out.println("연산자");
		System.out.println("산술연산자(+-*/%)");
		
		int num1=100;
		int num2=3;
		
		System.out.println(num1+"+"+num2 +"="+(num1+num2));
		System.out.println(num1+"-"+num2 +"="+(num1-num2));
		System.out.println(num1+"*"+num2 +"="+(num1*num2));
		System.out.println(num1+"/"+num2 +"="+(num1/(double)num2));
		System.out.println(num1+"%"+num2 +"="+(num1%num2));
		
		//(double)num1/num2 -> 33.333333333333336
		//(double)num1/num2*1000 -> 33333.333333333336
		//(double)num1/num2*1000/1000.0 -> 33.333
		double d = Math.round(((double)num1/num2)*1000)/1000.0;
		System.out.println(d);
		System.out.printf("%d/%d= %.3f\n",num1,num2,(double)num1/num2);
		
		
		System.out.println("=====================");
		//두수(정수)를 입력 받아서 산술연ㄴ산자(+-*/%) 프로그래밍 해보시오
		//Scanner
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("정수 A: ");
		int A = input.nextInt();
		System.out.println("정수 B: ");
		int B = input.nextInt();
		
		System.out.println(A+"+"+B +"="+(A+B));
		System.out.println(A+"-"+B +"="+(A-B));
		System.out.println(A+"*"+B +"="+(A*B));
		System.out.println(A+"/"+B +"="+String.format("%.2f", (A/(double)B)));//소수 2째 자리까지
		System.out.println(A+"%"+B +"="+(A%B));
		
		

		}
		
		
		
		
		
	}

