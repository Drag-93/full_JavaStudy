package org.java.basic.oopEx;

import java.util.Scanner;

public class Class2Main {

	public static void main(String[] args) {
		System.out.println("클래스2");

		Class2 c1 = new Class2();
		c1.num1 = 111;
		c1.num2 = 200;
		c1.op = "+";
		String rs1 = c1.calMethod();
		System.out.println(rs1);

		System.out.println();
		Class2 c2 = new Class2(500, 100, "+");
		String rs2 = c2.calMethod();
		System.out.println(rs2);

		// Scanner이용, num1,num2,op를 적절한 타입으로 초기화 해서
		// 결과를 출력해보세요

		System.out.println();

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("숫자1: ");
			int num1 = input.nextInt();

			System.out.print("숫자2: ");
			int num2 = input.nextInt();

			System.out.print("연산자(+-*/, 평균,exit): ");
			String op = input.next();

			Class2 c3 = new Class2(num1, num2, op);

			if (c3.calMethod().equals("종료")) {
				System.out.println(c3.calMethod());
				break;
			}

			System.out.println(c3.calMethod());
			System.out.println();

		}

	}
}
