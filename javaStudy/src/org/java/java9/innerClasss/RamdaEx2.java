package org.java.java9.innerClasss;

import org.java.java9.dbConnect.DBConnect;

interface F1 {
	int m1();
}

interface F2 {
	int m2(int num1);
}

interface F3 {
	int m3(int num1, int num2);
}

public class RamdaEx2 {
	public static void main(String[] args) {
		
		DBConnect.getConnection();
		

		System.out.println("===람다식===");
		// 람다식
		// 1. 매개 0
		F1 f12 = () -> {
			System.out.println("m1");
			return 0;
		};
		int num12 = f12.m1();
		System.out.println(num12);
		// 2. 매개 1
		F2 f22 = n1 -> {
			System.out.println("m2");
			return n1;
		};
		int num22 = f22.m2(100);
		System.out.println(num22);
		// 3. 매개 2
		F3 f32 = (n1, n2) -> {
			System.out.println("m3");
			return n1 + n2;
		};
		// 매서드 호출(call)
		int sum22 = f32.m3(100, 200);
		System.out.println(sum22);

		// return만 하나일 경우
		F3 f33 = (n1, n2) -> n1 + n2;

		int sum23 = f33.m3(100, 200);
		System.out.println(sum23);

		// 1. 익명 클래스 이용 m1,m2 구현
		F1 f1 = new F1() {
			@Override
			public int m1() {
				System.out.println("m1");
				return 0;
			}
		};
		int num1 = f1.m1();
		System.out.println(num1);
		F2 f2 = new F2() {
			@Override
			public int m2(int num1) {
				System.out.println("m2");
				return num1;
			}
		};
		int num2 = f2.m2(100);
		System.out.println(num2);
		F3 f3 = new F3() {
			@Override
			public int m3(int num1, int num2) {
				return num1 + num2;
			}
		};
		int sum = f3.m3(100, 200);
		System.out.println(sum);

	}
}
